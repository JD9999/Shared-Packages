package Readandwrite;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * A class designed to complement BufferedReaderTest.
 * It reads all the contents of a file over multiple lines.
 * It uses the new Files classes, introduced in java 7.
 */
public class Filesfiletest {

	private File file;

	/**
	 * Creates a Filesfiletest object.
	 * @param f the file to read from.
	 */
	public Filesfiletest(File f){
		file = f;
	}	
	/**
	 * Reads the whole contents of a file in a string
	 * @deprecated use {@link Reading.SeparatorReader#readAllLinesAsString()}
	 * @return the contents of the file. 
	 */
	public String readMultipleLineFile(){
		String filecontents = null;
		try {
			byte[] bytes = Files.readAllBytes(file.toPath());
			filecontents = new String(bytes);
			return filecontents;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return filecontents;
	}

	/**
	 * If a file contains an integer on multiple lines you can use this to get all of them
	 * @return the set of integers in the file
	 */
	public int getIntegersinMultipleLineFile(){
		int numberstring = 0;
		try {
			byte[] bytes = Files.readAllBytes(file.toPath());
			String fileints = new String(bytes);
			numberstring = Integer.parseInt(fileints);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return numberstring;	
	}
	/**
	 * Gets the byte length of the file
	 * @return the length of the file
	 */
	public long getLengthofMultipleLineFile(){
		long filelength = 0;
		try {
			filelength = Files.size(file.toPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return filelength;
	}	

}
