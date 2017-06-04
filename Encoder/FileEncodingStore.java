package Encoder;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

/**
 * A way to store encodings.
 * This is used in the AllEncoderBasic class.
 */
public class FileEncodingStore{

	/**
	 * The file to write to and read from
	 */
	private File file;
	
	/**
	 * The file's contents
	 */
	
	private List<String> lines = new ArrayList<String>();
	/**
	 * Is the lines object up to date?
	 */
	private boolean isReliable = true;
	
	/**
	 * The amount of elements added since the lines object has been reliable
	 */
	private int length = 0;
	
	/**
	 * The constructor. Creates a FileEncodingStore object.
	 * @param f The file to read and write from
	 * @throws IOException When deleting the contents of the file
	 */
	public FileEncodingStore(File f) throws IOException {
		file = f;
		FileChannel.open(file.toPath(), getOptions()).close();
	}

	private OpenOption[] getOptions(){
		return new OpenOption[]{StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING};
	}
	
	/**
	 * Adds an element to the encoding store
	 * @param charcode the character code to add to the store.
	 * @throws IOException If there is an error writing to the file
	 */
	public void add(int charcode) throws IOException{
		isReliable = false;
		length++;
		BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
		writer.write(String.valueOf(charcode));
		writer.newLine();
		writer.close();
	}

	/**
	 * Gets the amount of character codes in the encoding store
	 * @return the amount.
	 * @throws IOException is the file cannot be read
	 */
	public int definiteLength() throws IOException {
		reset();
		return lines.size();
	}
	
	/**
	 * Gets the supposed amount of character codes in the encoding store
	 * @return the amount.
	 */
	public int supposedLength(){
		return lines.size() + length;
	}

	/**
	 * Gets a character from the encoding store
	 * @param i the character number to read
	 * @return the character array representing the character code
	 * @throws IOException if the character cannot be read.
	 * NOTE: For people using this class, use c.length; to check the length.
	 * If it is not 1, it is 2. Some character codes require two characters to represent.
	 */
	public char[] getCharacter(int i) throws IOException {
		if(lines.size() == 0) reset();
		String line = lines.get(i);
		char[] c = Character.toChars(Integer.parseInt(line));
		return c;
	}
	
	/**
	 * Resets the file encoding store.
	 * @throws IOException if there is an error reading the file.
	 */
	public void reset() throws IOException{
		lines.clear();
		lines.addAll(Files.readAllLines(file.toPath()));
		isReliable = true;
	}

	/**
	 * Clears the file holding the encoding.
	 */
	public void clear() {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Checks whether the length of characters in the encoding store is definitely reliable.
	 * Use this method to determine whether to use the supposedLength() or definateLength() method.
	 * @return whether it is or not.
	 */
	public boolean isReliable(){
		return isReliable;
	}

}
