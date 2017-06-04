package Encoder;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * An encoder which encodes all the characters in a string individually.
 * The encoding is stored in a file to be decoded from. This way you can shut down an application and decoded it on startup from the encoding file
 * Implements the base Encoder interface.
 * Uses an offset on the character code.
 */
public class AllEncoderBasic implements Encoder{

	private FileEncodingStore encodingStore = null;

	private int offset;
	
	private File file;

	//TODO Add an ALlEncoderBasic(File) constructor, creating an encodingStore file.

	/**
	 * Creates an AllEncoderBasic object, using an offset of 1
	 * @param f the file to store the encoding in.
	 * @throws IOException If it failed to delete the contents of the file
	 */
	public AllEncoderBasic(File f) throws IOException{
		this(f, 1);
	}

	/**
	 * Creates an AllEncoderBasic object.
	 * @param f the file to store the encoding in
	 * @param n the offset to use
	 * @throws IOException If it failed to delete the contents of the file
	 */
	public AllEncoderBasic(File f,int n) throws IOException{
		encodingStore = new FileEncodingStore(f);
		file = f;
		offset = n;
	}

	/**
	 * Gets the offset that is being used
	 * @return the offset
	 */
	@Override
	public int getOffset() {
		return offset;
	}

	/**
	 * Sets the offset to use
	 * @param offset the offset to use
	 */
	@Override
	public void setOffset(int offset) {
		this.offset = offset;
	}

	/**
	 * Checks whether an offset is used.
	 * This should always be true. If it is false, then it won't encode properly!
	 * @return whether there is an offset or not
	 */
	@Override
	public boolean usesOffset() {
		return offset != 0;
	}

	/**
	 * Encodes the string.
	 * For each character in the string, the encoder adds the offset to the character's code and then creates a new character with that code.
	 * That character is then saved to the file
	 * Watch out in case an error to come up.
	 * 
	 * If it does, the encoder may not decode properly, so always check first before assuming it will work.
	 * That character will still be saved to the file, but will not return in the string.
	 * 
	 * @param input the string to encode
	 * @throws UnknownCharacterException this will not be thrown. Used in other encoders.
	 * @return the output of the method
	 */
	@Override
	public String encode(String input) throws UnknownCharacterException {
		encodingStore.clear();
		String output = "";
		try{
			for(int i = 0; i < input.length(); i++){
				int code = Character.codePointAt(input, i);
				int newcode = code + offset;
				encodingStore.add(newcode);
				if(Character.charCount(newcode) == 1){
					char[] array = Character.toChars(newcode);
					if(array.length == 1) output = output + array[0];
					else System.err.println("Character array has more than one character!");
				}else System.err.println("Character would take two characters to represent!");
			}
		}catch(IOException e){
			e.printStackTrace();
		}
		return output;
	}

	/**
	 * Decodes the string.
	 * This works by reversing the offset.
	 * Then it encodes the string.
	 * Then it writes the previously encoded string to the first file.
	 * And finally it fixes up the offset.
	 * @param input the string to decode
	 * @throws UnknownCharacterException this will not be thrown. Used in other encoders.
	 * @return the original string
	 */
	@Override
	public String decode(String input) throws UnknownCharacterException{
		int newOffset = negative(offset);
		offset = newOffset;
		String output = "";
		try {
			int length = encodingStore.definiteLength();
			char[][] c = new char[length][];
			for(int i = 0; i < length; i++){
				c[i] = encodingStore.getCharacter(i);
			}
			output = encode(input);
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			for(char[] a : c){
				for(char b : a){
					writer.append(b);
				}
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		int oldOffset = negative(newOffset);
		offset = oldOffset;
		return output;
	}
	
	private int negative(int n) {
		return n * -1;
	}

}
