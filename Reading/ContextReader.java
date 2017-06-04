package Reading;

import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

import Reading.MessagePurpose;
import Reading.PurposeFormat;

/**
 * One of the four readers added in V1.0
 * This means that the class:
 * 	- Can be converted into any of the other three readers
 * 	- Supports both the reset and close methods
 * 	- implements the Closeable interface
 * 	- Can read a File, an InputStream and a URI
 * 	- has synchronization between the reset, close and reading methods
 * 
 * The special thing about this class is that it puts the input in context.
 * This could include censoring inappropriate words, or replacing a date with the current date, or replacing other variables.
 * It can also read it in a specific Charset.
 * This is why, instead of using a BufferedReader, uses the CharsetReader class first.
 * Like the CharsetReader class, it only reads a file line by line.
 * 
 * The API's current design means that only MessagePurpose classes can be used.
 * Hopefully, as the API is updated and improved, different types of Purpose implementations will be able to be used in this class.
 * 
 * @see CharsetReader
 */
public class ContextReader implements Closeable{

	private Object buildObject;
	private MessagePurpose purpose;
	private PurposeFormat fmat;
	private CharsetReader reader;
	private InputStream stream;
	private ProfanitySource source;
	
	/**
	 * Creates a ContextReader object.
	 * @param p the MessagePurpose to put the content in context
	 * @param stream the InputStream to read from.
	 */
	public ContextReader(MessagePurpose p, InputStream stream){
		buildObject = stream;
		purpose = p;
		fmat = p.obtainFormat();
		reader = new CharsetReader(fmat.getDesiredCharset(), stream);
		this.stream = stream;
		source = p.obtainSource();
	}
	
	/**
	 * Creates a ContextReader object.
	 * @param p the MessagePurpose to put the content in context
	 * @param f the file to read from.
	 * @throws IOException if there is a problem creating a FileInputStream
	 */
	public ContextReader(MessagePurpose p, File f) throws IOException{
		buildObject = f;
		purpose = p;
		fmat = p.obtainFormat();
		reader = new CharsetReader(fmat.getDesiredCharset(), f);
		stream = new FileInputStream(f);
		source = p.obtainSource();
	}
	
	/**
	 * Creates a ContextReader object.
	 * @param p the MessagePurpose to put the content in context
	 * @param uri the URI to read from.
	 * @throws IOException if there is a problem creating an InputStream
	 */
	public ContextReader(MessagePurpose p, URI uri) throws IOException{
		buildObject = uri;
		purpose = p;
		fmat = p.obtainFormat();
		reader = new CharsetReader(fmat.getDesiredCharset(), uri);
		stream = uri.toURL().openStream();
		source = p.obtainSource();
	}
	
	/**
	 * Creates a ContextReader object.
	 * @param p the MessagePurpose to put the content in context
	 * @param format the PurposeFormat that tells the reader what to look for
	 * @param stream the InputStream to read from.
	 */
	public ContextReader(MessagePurpose p, PurposeFormat format, InputStream stream){
		buildObject = stream;
		purpose = p;
		fmat = format;
		reader = new CharsetReader(fmat.getDesiredCharset(), stream);
		this.stream = stream;
		source = p.obtainSource();
	}
	
	/**
	 * Creates a ContextReader object.
	 * @param p the MessagePurpose to put the content in context
	 * @param format the PurposeFormat that tells the reader what to look for
	 * @param f the file to read from.
	 * @throws IOException if there is a problem creating a FileInputStream
	 */
	public ContextReader(MessagePurpose p, PurposeFormat format, File f) throws IOException{
		buildObject = f;
		purpose = p;
		fmat = format;
		reader = new CharsetReader(fmat.getDesiredCharset(), f);
		stream = new FileInputStream(f);
		source = p.obtainSource();
	}
	
	/**
	 * Creates a ContextReader object.
	 * @param p the MessagePurpose to put the content in context
	 * @param format the PurposeFormat that tells the reader what to look for
	 * @param uri the URI to read from.
	 * @throws IOException if there is a problem creating an InputStream
	 */
	public ContextReader(MessagePurpose p, PurposeFormat format, URI uri) throws IOException{
		buildObject = uri;
		purpose = p;
		fmat = format;
		reader = new CharsetReader(fmat.getDesiredCharset(), uri);
		stream = uri.toURL().openStream();
		source = p.obtainSource();
	}
	
	/**
	 * Creates a ContextReader object.
	 * @param p the MessagePurpose to put the content in context
	 * @param format the PurposeFormat that tells the reader what to look for
	 * @param source the ProfanitySource to censor from
	 * @param stream the stream to read from.
	 */
	public ContextReader(MessagePurpose p, PurposeFormat format, ProfanitySource source, InputStream stream){
		purpose = p;
		fmat = format;
		reader = new CharsetReader(fmat.getDesiredCharset(), stream);
		this.stream = stream;
		this.source = source;
	}
	
	/**
	 * Creates a ContextReader object.
	 * @param p the MessagePurpose to put the content in context
	 * @param format the PurposeFormat that tells the reader what to look for
	 * @param source the ProfanitySource to censor from
	 * @param f the file to read from.
	 * @throws IOException if there is a problem creating a FileInputStream
	 */
	public ContextReader(MessagePurpose p, PurposeFormat format, ProfanitySource source, File f) throws IOException{
		buildObject = f;
		purpose = p;
		fmat = format;
		reader = new CharsetReader(fmat.getDesiredCharset(), f);
		stream = new FileInputStream(f);
		this.source = source;
	}
	
	/**
	 * Creates a ContextReader object.
	 * @param p the MessagePurpose to put the content in context
	 * @param format the PurposeFormat that tells the reader what to look for
	 * @param source the ProfanitySource to censor from
	 * @param uri the URI to read from.
	 * @throws IOException if there is a problem creating an InputStream
	 */
	public ContextReader(MessagePurpose p, PurposeFormat format, ProfanitySource source, URI uri) throws IOException{
		buildObject = uri;
		purpose = p;
		fmat = format;
		reader = new CharsetReader(fmat.getDesiredCharset(), uri);
		stream = uri.toURL().openStream();
		this.source = source;
	}
	
	/**
	 * Reads the line in its context
	 * The first check is if the PurposeFormat has no format. If it does not, it just returns the line.
	 * Otherwise, it filters the line the MessagePurpose was created with using the {@link MessagePurpose#perform()} method.
	 * It will then replace all the profanities.
	 * If the profanities are specified in the MessagePurpose, they will be replaced wiht "****" not dependant on the size of the word.
	 * If they are specified within a constructor, they will be removed.
	 * @return the string read in context
	 * @throws IOException if there is an error reading the line.
	 */
	public synchronized String readLineInContext() throws IOException{
		String line = reader.readLine();
		if(!fmat.hasNoFormat()){
			purpose.setText(line);
			line = purpose.perform();
		}
		line = source.filter(line);
		return line;
	}
	
	/**
	 * Sets the CharsetReader. This method is useful if you are reading two different Charsets.
	 * @param reader the CharsetReader to replace the current reader with.
	 */
	public synchronized void setCharsetReader(CharsetReader reader){
		this.reader = reader;
	}
	
	/**
	 * Gets the CharsetReader currently being used.
	 * @return the CharsetReader being used.
	 */
	public CharsetReader obtainCharsetReader(){
		return reader;
	}
	
	/**
	 * Converts the ContextReader to a CharsetReader.
	 * It uses the UTF-8 encoding.
	 * @return a brand new CharsetReader.
	 */
	public CharsetReader toCharsetReader(){
		return toCharsetReader(Charset.forName("UTF-8"));
	}
	
	/**
	 * Converts the ContextReader to a CharsetRader
	 * @param charset the charset to use
	 * @return a brand new CharsetReader.
	 */
	public CharsetReader toCharsetReader(Charset charset) {
		return new CharsetReader(charset, stream);
	}

	/**
	 * Converts the ContextReader to a FilterReader.
	 * @return the FilterReader object.
	 */
	public FilterReader toFilterReader(){
		return new FilterReader(stream);
	}
	
	/**
	 * Converts the ContextReader to a SeparatorReader.
	 * @return the SeparatorReader object.
	 */
	public SeparatorReader toSeparatorReader(){
		return new SeparatorReader(stream);
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
			reader = new CharsetReader(fmat.getDesiredCharset(), stream);
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
		reader = new CharsetReader(fmat.getDesiredCharset(), stream);
	}

	/**
	 * Closes the reader.
	 * @throws IOException if there is an error closing the CharsetReader (see {@link CharsetReader#close()}).
	 */
	@Override
	public synchronized void close() throws IOException {
		reader.close();
	}
	
}
