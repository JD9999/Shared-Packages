package Reading;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.PatternSyntaxException;

import Reading.MessagePurpose;

/**
 * One of the four readers added in V1.0
 * This means that the class:
 * 	- Can be converted into any of the other three readers
 * 	- Supports both the reset and close methods
 * 	- implements the Closeable interface
 * 	- Can read a File, an InputStream and a URI
 * 	- has synchronization between the reset, close and reading methods
 * 
 * The special thing about the SeparatorReader is that is splits the string at any given point.
 */
public class SeparatorReader implements Closeable{

	private Object buildObject;
	private InputStream stream;
	private BufferedReader reader;
	private boolean reObject;
	
	/**
	 * Creates a SeparatorReader object.
	 * @param f the file to read
	 * @throws FileNotFoundException if the file is not found.
	 */
	public SeparatorReader(File f) throws FileNotFoundException{
		buildObject = f;
		stream = new BufferedInputStream(new FileInputStream(f));
		reader = new BufferedReader(new InputStreamReader(stream));
	}

	/**
	 * Creates a SeparatorReader object.
	 * @param stream the InputStream to read from
	 */
	public SeparatorReader(InputStream stream){
		buildObject = stream;
		this.stream = new BufferedInputStream(stream);
		reader = new BufferedReader(new InputStreamReader(stream));
	}
	
	/**
	 * Creates a SeparatorReader object.
	 * @param uri the URI to read from
	 * @throws IOException if there is an error creating an InputStream to read it from.
	 */
	public SeparatorReader(URI uri) throws IOException{
		buildObject = uri;
		stream = new BufferedInputStream(uri.toURL().openStream());
		reader = new BufferedReader(new InputStreamReader(stream));
	}
	
	/**
	 * Read the file until a character appears.
	 * Calls the {@link #readUntilString(char)} method.
	 * @param separator the character to stop reading at
	 * @return a character array of each character before the character specified
	 * @throws IOException if there is an error reading all the file.
	 */
	public char[] readUntilChar(char separator) throws IOException{
		String sep = readUntilString(separator);
		return sep.toCharArray();
	}

	/**
	 * Reads the file until a character appears
	 * @param separator the character to stop reading at
	 * @return a string of all the characters before the character specified
	 * @throws IOException if there is an error reading all the file.
	 */
	public String readUntilString(char separator) throws IOException{
		String line = readAllLinesAsString();
		String sep = line.substring(0, line.indexOf(separator));
		return sep;
	}
	
	/**
	 * Reads a file until a string appears
	 * @param separator the string to stop reading at
	 * @return a character array of all the characters before the string specified
	 * @throws IOException if there is an error reading all the file.
	 */
	public char[] readUntilChars(String separator) throws IOException{
		String sep = readUntilString(separator);
		return sep.toCharArray();
	}
	
	/**
	 * Reads the file until a string appears
	 * @param separator the string to stop reading at
	 * @return a string of all the characters before the string specified
	 * @throws IOException if there is an error reading all the file.
	 */
	public String readUntilString(String separator) throws IOException {
		String line = readAllLinesAsString();
		int index = line.indexOf(separator);
		if(index == -1) return line;
		String sep = line.substring(0, index);
		return sep;
	}

	/**
	 * Split the string by the file path and the file name
	 * The array is formated with the file path being array[0] and the file name (incl.extensions) being array[1]
	 * @return the array.
	 * @throws IOException if there is an error reading the line.
	 */
	public String[] splitFileNameAndPath() throws IOException{
		String line = readLine();
		String filename = line.substring(line.lastIndexOf(File.separator) + 1);
		String filepath = line.substring(0, line.lastIndexOf(File.separator) + 1);
		String[] array = new String[]{
			filepath,
			filename
		};
		return array;
	}
	
	/**
	 * Split the string into an array, stopping at the point specified.
	 * Note that this is accompanied by a private method to split a string safely where a PatternSyntaxException would occur otherwise.
	 * @param split the string to split by
	 * @param endpoint the string to stop the reading process.
	 * @return the array of each string split by the point.
	 * @throws IOException if there is an error reading all the file.
	 */
	public String[] splitUntilReached(String split, String endpoint) throws IOException{
		String line = readAllLinesAsString();
		String set = line.substring(0, line.indexOf(endpoint));
		String[] array = splitSafely(set, split);
		return array;
	}
	
	private String[] splitSafely(String set, String split) {
		try{
			return set.split(split);
		}catch(PatternSyntaxException e){
			if(split.equals(File.separator)){
				String[] array = new String[set.length() / 2 - 1];
				int placeIndex = 0;
				int lastIndex = 0;
				while(set.indexOf(File.separator) != -1){
					int index = set.indexOf(File.separator);
					String placeString = set.substring(lastIndex, index);
					lastIndex = index;
					array[placeIndex] = placeString;
					set = set.substring(index + 1);
				}
				return array;
			}else{
				//Untested and may not work
				String[] array = new String[set.length() / 2 - 1];
				int placeIndex = 0;
				int lastIndex = 0;
				while(set.indexOf(split) != -1){
					int index = set.indexOf(split);
					String placeString = set.substring(lastIndex, index);
					lastIndex = index;
					array[placeIndex] = placeString;
					set = set.substring(index + 1);
				}
				return array;
			}
		}
	}

	/**
	 * Reads the line.
	 * If the reader is at the end of the file, it will go back to the start of the file.
	 * @return the line read.
	 * @throws IOException If there is an error reading the line.
	 */
	public synchronized String readLine() throws IOException{
		String line = null;
		if((line = reader.readLine()) !=null){
			reObject = true;
			return line;
		}
		else{
			reset();
			reObject = true;
			return reader.readLine();
		}
		
	}

	/**
	 * Read every line, putting in into a list.
	 * @return the list of lines
	 * @throws IOException if there is an error reading a line.
	 */
	public synchronized List<String> readAllLines() throws IOException{
		reset();
		List<String> ls = new ArrayList<String>();
		String line;
		while((line = reader.readLine())!=null){
			ls.add(line);
		}
		reObject = false;
		return ls;
	}
	
	/**
	 * Read every line, putting in into a string.
	 * Each line is read using the {@link #readAllLines()} method, and put into a string.
	 * The string is separated by {@code System.getProperty("line.separator")}
	 * @return all the lines as a string
	 * @throws IOException if there is an error reading a line.
	 */
	public String readAllLinesAsString() throws IOException{
		StringBuilder builder = new StringBuilder();
		List<String> readLines = readAllLines();
		builder.append(readLines.get(0));
		List<String> lines = new ArrayList<String>();
		lines.addAll(readLines);
		lines.remove(0);
		for(String line : lines){
			builder.append(System.getProperty("line.separator"));
			builder.append(line);
		}
		return builder.toString();
	}
	
	/**
	 * Reads all the lines, and then removes each line if it contains the string.
	 * @param forbidden the string to make sure no lines have.
	 * @return the list of strings that do not have the string.
	 * @throws IOException if there is an error reading all the lines
	 */
	public List<String> separateLinesByContains(String forbidden) throws IOException{
		List<String> ls = new ArrayList<String>();
		List<String> lines = readAllLines();
		for(String line : lines){
			if(line.contains(forbidden)) continue;
			ls.add(line);
		}
		return ls;
	}
	
	/**
	 * Resets the reader, so it will start reading at the start of the file.
	 * With the exception of a FileInputStream, the current BufferedReader object will be closed and then re-opened using the constructor-provided information.
	 * An error will be thrown if there is a constructor has not been used.
	 * It is not recommended to use Reflection to create any of the four readers for this reason.
	 * @throws IOException if there is a problem setting a FileInputStream's channel to the beginning of the file, if there is an issue creating a FileInputStream for a File, or if there is an error opening the InputStream from a URI.
	 */
	public synchronized void reset() throws IOException {
		if(buildObject instanceof FileInputStream){
			FileInputStream fis = (FileInputStream)buildObject;
			FileChannel channel = fis.getChannel();
			channel.position(0);
			if(reObject)reader = new BufferedReader(new InputStreamReader(fis));
			return;
		}
		reader.close();
		if(buildObject instanceof File){
			stream = new FileInputStream((File)buildObject);
		}else if(buildObject instanceof InputStream){
			stream = new BufferedInputStream((InputStream)buildObject);
		}else if(buildObject instanceof URI){
			stream = ((URI)buildObject).toURL().openStream();
		}else System.err.println("Object not built correctly! Please only use one of the three constructors");
		reader = new BufferedReader(new InputStreamReader(stream));
	}

	/**
	 * Converts the SeparatorReader into a CharsetReader
	 * It uses the UTF-8 charset.
	 * @return the CharsetReader object.
	 */
	public CharsetReader toCharsetReader(){
		return new CharsetReader(Charset.forName("UTF8"), stream);
	}
	
	/**
	 * Converts the SeparatorReader into a CharsetReader
	 * @param set the charset to use
	 * @return the CharsetReader object.
	 */
	public CharsetReader toCharsetReader(Charset set){
		return new CharsetReader(set, stream);
	}
	
	/**
	 * Converts the SeparatorReader to a ContextReader.
	 * This conversion will retain the same charset.
	 * However, this method is not preferred because it will function exactly the same as this class already does.
	 * It is recommended to use the {@link #toContextReader(MessagePurpose) toContextReader(MessagePurpose)} method to specify the functions you want the string to be pushed through before returning.
	 * @return the ContextReader object
	 * @throws IOException if an IOException occurs while sampling text.
	 */
	public ContextReader toContextReader() throws IOException{
		return toContextReader(new MessagePurpose(readLine()));
	}

	/**
	 * Converts the SeparatorReader to a ContextReader
	 * This conversion will retain the same charset.
	 * This method is recommended as you can specify the MessagePurpose for the string.
	 * @param purpose the MessagePurpose object to read the file in its context
	 * @return The ContextReader object.
	 */
	public ContextReader toContextReader(MessagePurpose purpose) {
		return new ContextReader(purpose, stream);
	}
	
	/**
	 * Converts the SeparatorReader to a FilterReader
	 * @return the FilterReader object.
	 */
	public FilterReader toFilterReader(){
		return new FilterReader(stream);
	}

	/**
	 * Closes the reader
	 * @throws IOException if there is an error closing the BufferedReader associated with the reader.
	 */
	@Override
	public synchronized void close() throws IOException {
		reader.close();
	}
	
}
