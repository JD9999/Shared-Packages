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
 * The special thing about the FilterReader is that it excludes stuff from the results returned.
 */
public class FilterReader implements Closeable{

	private InputStream stream;
	private Object buildObject;
	private BufferedReader reader;

	/**
	 * Creates a FilterReader object
	 * @param f the file to read from
	 * @throws FileNotFoundException if the file does not exist or cannot be read.
	 */
	public FilterReader(File f) throws FileNotFoundException{
		stream = new FileInputStream(f);
		buildObject = f;
	}

	/**
	 * Creates a FilterReader object
	 * @param iS the InputStream to read from
	 */
	public FilterReader(InputStream iS){
		stream = iS;
		buildObject = iS;
	}

	/**
	 * Creates a FilterReader object
	 * @param uri the URI to read from
	 * @throws IOException if the URI cannto be converted into an InputStream.
	 */
	public FilterReader(URI uri) throws IOException{
		stream = uri.toURL().openStream();
		buildObject = uri;
	}

	/**
	 * Converts the FilterReader to a CharsetReader
	 * Uses the UTF-8 encoding.
	 * @return a CharsetReader object.
	 */
	public CharsetReader toCharsetReader(){
		return toCharsetReader(Charset.forName("UTF8"));
	}	

	/**
	 * Converts the FilterReader to a CharsetReader
	 * @param set the Charset to use
	 * @return a CharsetReader object.
	 */
	public CharsetReader toCharsetReader(Charset set){
		return new CharsetReader(set, stream);
	}

	/**
	 * Converts the FilterReader to a ContextReader
	 * The process is a little bit interesting.
	 * It converts itself to a SeparatorReader and reads one line.
	 * Then it gives that line as an example string to the MessagePurpose class.
	 * Then it invokes the {@link #toContextReader(MessagePurpose)} method with the given MessagePurpose
	 * @return a ContextReader object
	 * @throws IOException if there is an error reading a line.
	 */
	public ContextReader toContextReader() throws IOException{
		return toContextReader(new MessagePurpose(toSeparatorReader().readLine()));
	}

	/**
	 * Converts the FilterReader to a ContextReader
	 * @param purpose the MessagePurpose to use
	 * @return a ContextReader object.
	 */
	public ContextReader toContextReader(MessagePurpose purpose) {
		return new ContextReader(purpose, stream);
	}

	/**
	 * Converts the FilterRader to a SeparatorReader
	 * @return a SeparatorReader object
	 */
	public SeparatorReader toSeparatorReader(){
		return new SeparatorReader(stream);
	}

	/**
	 * Reads all the lines.
	 * For each line, if it is equal to any line in the avoid list (ignoring case), it is removed from the list.
	 * @param avoid a list of strings not to be in the list returned.
	 * @return the list without the lines in the provided list.
	 */
	public List<String> readExceptLines(List<String> avoid){
		List<String> list = new ArrayList<String>();
		try {
			List<String> lines = readAllLines();
			list.addAll(lines);
			for(String no : avoid){
				for(String line : lines){
					if(no.equalsIgnoreCase(line)) list.remove(line);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}

	/**
	 * Reads all the lines, and then removes each string from each line
	 * @param avoid the strings to avoid
	 * @return the list without the strings in the provided list
	 */
	public List<String> readExceptContains(List<String> avoid){
		List<String> filter = new ArrayList<String>();
		try {
			List<String> lines = readAllLines();
			for(String line : lines){
				String filterLine = line;
				for(int a = 0; a < avoid.size(); a++){
					String set = avoid.get(a);
					if(line.contains(set)){
						filterLine = filterLine.replaceAll(set, "");
					}else continue;
				}
				filter.add(filterLine);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return filter;
	}

	/**
	 * Read all the lines
	 * @return a list of all the lines
	 * @throws IOException if there is an error reading a line
	 */
	public synchronized List<String> readAllLines() throws IOException{
		reset();
		String line;
		List<String> lines = new ArrayList<String>();
		reader = new BufferedReader(new InputStreamReader(stream));
		while((line = reader.readLine())!=null){
			lines.add(line);
		}
		return lines;
	}

	/**
	 * Remove a character from the contents of the content stream
	 * @param c the character to remove
	 * @return the list of lines without that character
	 */
	public List<String> removeLetter(char c){
		List<String> chList = new ArrayList<String>();
		chList.add(String.valueOf(c));
		return this.readExceptContains(chList);
	}

	/**
	 * Checks how many lines contain a string
	 * @param s the string to search for
	 * @return the amount of lines
	 */
	public int numberOfLinesHaveString(String s){
		int count = 0;
		try {
			List<String> ls = this.readAllLines();
			for(String line : ls){
				if(line.contains(s)) count++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return count;
	}

	/**
	 * Checks how many characters are the specified character
	 * @param c the character to search for
	 * @return the amount of occurances
	 */
	public int numberOfChar(char c){
		int count = 0;
		try {
			List<String> ls = this.readAllLines();
			for(String line : ls){
				for(char ch : line.toCharArray()){
					if(c == ch) count++;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return count;
	}

	/**
	 * Filter the words from the string
	 * @param source the string to filter from
	 * @param badwords the words to filter out of the source
	 * @return the string without the words
	 */
	public static String filterWordsFromString(String source, List<String> badwords){
		String filter = source;
		for(String badword : badwords){
			filter = filter.replaceAll(badword, rep(true));
		}
		filter = filter.replaceAll("  ", " ");
		return filter;
	}

	/**
	 * Replace the words in the list with "****"
	 * @param source the string to search and remove strings from
	 * @param badwords the list of strings to remove
	 * @return the string with the filtered strings replaced with asterisks.
	 */
	public static String asterikWordsFromString(String source, List<String> badwords){
		String filter = source;
		for(String badword : badwords){
			filter = filter.replaceAll(badword, rep(false));
		}
		return filter;
	}

	private static String rep(boolean b) {
		return b ? "" : "****";
	}

	/**
	 * Resets the reader, so it will start reading at the start of the file.
	 * With the exception of a FileInputStream, the current BufferedReader object will be closed and then re-opened using the constructor-provided information.
	 * An error will be thrown if there is a constructor has not been used.
	 * It is not recommended to use Reflection to create any of the four readers for this reason.
	 * @throws IOException if there is a problem setting a FileInputStream's channel to the beginning of the file, if there is an issue creating a FileInputStream for a File, or if there is an error opening the InputStream from a URI.
	 */
	public synchronized void reset() throws IOException {
		if(reader == null)return;
		if(buildObject instanceof FileInputStream){
			FileInputStream fis = (FileInputStream)buildObject;
			FileChannel channel = fis.getChannel();
			channel.position(0);
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
	}

	/**
	 * Closes the reader.
	 * @throws IOException if there is an error closing the BufferedReader.
	 */
	@Override
	public synchronized void close() throws IOException {
		reader.close();
	}

}
