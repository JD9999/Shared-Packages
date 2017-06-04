package Reading;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

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
 * The special thing about the CharsetReader class is that it reads the file with a specified charset.
 * It only reads the file line by line.
 */
public class CharsetReader implements Closeable{

	private Object buildObject;
	private BufferedReader reader;
	private InputStream stream;

	/**
	 * Creates a CharsetReader object.
	 * @param set the Charset ({@link java.nio.charset.Charset}) to use
	 * @param uri the URI to read from
	 * @throws IOException if there is an error either creating a BufferedReader from the URI, or there is an error creating an InputStream object for the URI.
	 */
	public CharsetReader(Charset set, URI uri) throws IOException{
		buildObject = uri;
		reader = Files.newBufferedReader(Paths.get(uri), set);
		stream = uri.toURL().openStream();
	}

	/**
	 * Creates a CharsetReader object.
	 * @param set the Charset ({@link java.nio.charset.Charset}) to use
	 * @param file the file to read from
	 * @throws IOException if there is an error either creating a BufferedReader from the file, or a FileNotFoundException if there is an error creating an InputStream object for the file.
	 */
	public CharsetReader(Charset set, File file) throws IOException{
		buildObject = file;
		reader = Files.newBufferedReader(file.toPath(), set);
		stream = new FileInputStream(file);
	}

	/**
	 * Creates a CharsetReader object.
	 * @param set the charset ({@link java.nio.charset.Charset}) to use
	 * @param stream the InputStream to read from
	 */
	public CharsetReader(Charset set, InputStream stream){
		buildObject = stream;
		reader = new BufferedReader(new InputStreamReader(stream, set));
		this.stream = stream;
	}

	/**
	 * Reads a line
	 * @return the line in the charset specified
	 * @throws IOException if there is an IO error with reading.
	 */
	public synchronized String readLine() throws IOException{
		return reader.readLine();
	}

	/**
	 * Converts the CharsetReader to a SeparatorReader.
	 * Unfortunately, this will not read in the charset specified in the constructor.
	 * This means that {@code reader.toSeparatorReader().toCharsetReader()} will not necessarily return the same reader.
	 * @return the SeparatorReader object.
	 */
	public SeparatorReader toSeparatorReader(){
		return new SeparatorReader(stream);
	}

	/**
	 * Converts the CharsetReader to a FilterReader.
	 * Unfortunately, this will not read in the charset specified in the constructor.
	 * This means that {@code reader.toFilterReader().toCharsetReader()} will not necessarily return the same reader.
	 * @return the FilterReader object.
	 */
	public FilterReader toFilterReader(){
		return new FilterReader(stream);
	}

	/**
	 * Converts the CharsetReader to a ContextReader.
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
	 * Converts the CharsetReader to a ContextReader
	 * This conversion will retain the same charset.
	 * This method is recommended as you can specify the MessagePurpose for the string.
	 * @param purpose the MessagePurpose object to read the file in its context
	 * @return The ContextReader object.
	 */
	public ContextReader toContextReader(MessagePurpose purpose) {
		ContextReader reader = new ContextReader(purpose, stream);
		reader.setCharsetReader(this);
		return reader;
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
			reader = new BufferedReader(new InputStreamReader(fis));
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
	 * Closes the reader
	 * @throws IOException if there is an error closing the BufferedReader associated with the reader.
	 */
	@Override
	public synchronized void close() throws IOException {
		reader.close();
	}

}
