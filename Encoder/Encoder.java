package Encoder;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * An interface for an encoder.
 * This interface uses an offset, which is the difference between one character and another.
 * This could be used in a really advanced way as well, having different offsets per starting character.
 * Being an interface, this can be adapted to whatever your needs.
 * If you need a quick but unreadable encoding use AllEncoderBasic. 
 * @author Jamie
 *
 */
public interface Encoder {
	
	/**
	 * Gets the offest used to encode
	 * @return the offest
	 */
	public int getOffset();
	
	/**
	 * Sets the offest used to encode
	 * @param offset the offset
	 */
	public void setOffset(int offset);
	
	/**
	 * Checks whether the offset is used
	 * @return whether it is used
	 */
	public boolean usesOffset();
	
	/**
	 * Encodes a String
	 * @param string the string to encode
	 * @return the encoded string
	 * @throws UnknownCharacterException If a character code cannot be recognized
	 */
	public String encode(String string) throws UnknownCharacterException;
	
	/**
	 * Decodes a String
	 * @param string the string to decoded
	 * @return the decoded string
	 * @throws UnknownCharacterException If a character code cannot be recognized
	 */
	public String decode(String string) throws UnknownCharacterException;
	
	/**
	 * Encodes a String as well as writing it to a file
	 * @param string the string to encode
	 * @param file the file to encode to
	 * @return the encoded string
	 * @throws UnknownCharacterException If a character code cannot be recognised
	 * @throws IOException if there is an error writing it to a file.
	 */
	public default String encodeTo(String string, File file) throws IOException, UnknownCharacterException{
		BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		String encoding = encode(string);
		writer.write(encoding);
		writer.close();
		return encoding;
	}
	
	/**
	 * Decodes a String as well as writing it to a file
	 * @param string the string to decode
	 * @param file the file to encode to
	 * @return the decoded string
	 * @throws UnknownCharacterException If a character code cannot be recognised
	 * @throws IOException if there is an error writing it to a file.
	 */
	public default String decodeTo(String string, File file) throws IOException, UnknownCharacterException{
		BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		String decoding = decode(string);
		writer.write(decoding);
		writer.close();
		return decoding;
	}
}
