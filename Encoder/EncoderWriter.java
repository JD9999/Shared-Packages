package Encoder;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * A writer that writes characters with either one or two encodings
 * There are three provided in the API, though you can make your own too!
 * It works in exactly the same way you would use a BufferedWriter:
 * e.g. EncoderWriter writer = new EncoderWriter(new RW4(), new FileWriter(new File("file.txt")));
 */
public class EncoderWriter extends BufferedWriter {
	
	private Encoder encoder1;
	private Encoder encoder2;
	
	/**
	 * Writes with one encoder.
	 * @param encoder the Encoder to encode with. 
	 * @param writer a writer to write with.
	 */
	public EncoderWriter(Encoder encoder, Writer writer){
		super(writer);
		this.encoder1 = encoder;
		this.encoder2 = null;
	}
	
	/**
	 * Writes with two encoders
	 * @param encoder1 the first Encoder to encode with
	 * @param encoder2 the second Encoder to encode with
	 * @param writer a writer to write with
	 */
	public EncoderWriter(Encoder encoder1, Encoder encoder2, Writer writer){
		super(writer);
		this.encoder1 = encoder1;
		this.encoder2 = encoder2;
	}
	
	/**
	 * Writes the contents of a character array, starting at a point and finishing when a length is reached.
	 * The encoder works as described in the {@link #write(String)} method.
	 * @param cbuf the character array to write from
	 * @param off the index of the character array to start writing from.
	 * @param len the amount of characters to write
	 * @throws IOException thrown as described in the {@link #write(String)} method.
	 */
	public void write(char[] cbuf, int off, int len) throws IOException{
		String s = new String(cbuf);
		write(s.substring(off, len + off));
	}

	/**
	 * Writes the contents of a string, starting at a point and finishing when a length is reached.
	 * The encoder works as described in the {@link #write(String)} method.
	 * @param s the string to write from
	 * @param off the index of the string to start writing from.
	 * @param len the amount of characters to write
	 * @throws IOException thrown as described in the {@link #write(String)} method.
	 */
	public void write(String s, int off, int len) throws IOException{
		write(s.substring(off, len + off));
	}
	
	/**
	 * Writes a single character.
	 * The encoder works as described in the {@link #write(String)} method.
	 * @param c the character code to write
	 * @throws IOException thrown as described in the {@link #write(String)} method.
	 */
	public void write(int c) throws IOException{
		char[] array = new char[1];
		array[0] = (char)c;
		write(new String(array));
	}
	
	/**
	 * Writes a character array.
	 * The encoder works as described in the {@link #write(String)} method.
	 * @param cbuf the character array to write
	 * @throws IOException thrown as described in the {@link #write(String)} method.
	 */
	public void write(char[] cbuf) throws IOException{
		write(new String(cbuf));
	}
	
	/**
	 * Writes a string to a file.
	 * If only one encoder is used, it will encode the string in that encoding and write it to the file.
	 * If two encoders are used, the encoders will alternate per character.
	 * For example, in a string "aaaaaa", where one encoder converts a to "c", and the other to "d", the string will become "cdcdcd".
	 * An EncoderReader class does not exist yet, however it will be implemented soon.
	 * @param s the string to write
	 * @throws IOException thrown by the {@link java.io.Writer#write(String)}
	 */
	public void write(String s) throws IOException{
		if(encoder2 !=null){
			char[] writeChars = new char[s.length()];
			for(int charIndex = 0; charIndex < s.length(); charIndex++){
				char c = s.charAt(charIndex);
				if(charIndex % 2 == 0){
					//The number is even.
					try {
						char d = encoder1.encode(Character.toString(c)).charAt(0);
						writeChars[charIndex] = d;
					} catch (UnknownCharacterException e) {
						e.printStackTrace();
					}
				}else{
					try {
						char d = encoder2.encode(Character.toString(c)).charAt(0);
						writeChars[charIndex] = d;
					} catch (UnknownCharacterException e) {
						e.printStackTrace();
					}
				}
			}
			super.write(new String(writeChars));
		}else{
			try {
				super.write(encoder1.encode(s));
			} catch (UnknownCharacterException e) {
				e.printStackTrace();
			}
		}
	}
	
}
