package Readandwrite;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Paths;

public class Filesfiletest {

public Filesfiletest(){
}	
	/**
	 * Reads the whole contents of a file in a string
	 * @param file the file to read
	 * @return the contents of the file.
	 */
	public String readMultipleLineFile(File file){
		String filecontents = null;
		URI uri = file.toURI();
		try {
			byte[] bytes = java.nio.file.Files.readAllBytes(Paths.get(uri));
			filecontents = new String(bytes);
			return filecontents;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return filecontents;
	}

	/**
	 * If a file contains a set of integers on multiple lines you can use this to get all of them
	 * @param file the file to read
	 * @return the set of integers in the file
	 */
	public int getIntegersinMultipleLineFile(File file){
	int numberstring = 0;
	URI uri = file.toURI();
	try {
		byte[] bytes = java.nio.file.Files.readAllBytes(Paths.get(uri));
		String fileints = new String(bytes);
		numberstring = Integer.parseInt(fileints);
	} catch (IOException e) {
		e.printStackTrace();
	}
		return numberstring;	
	}
	/**
	 * Gets the byte length of the file
	 * @param file the file to read
	 * @return the length of the file
	 */
	public long getLengthofMultipleLineFile(File file){
		long filelength = 0;
		URI uri = file.toURI();
		try {
			filelength = java.nio.file.Files.size(Paths.get(uri));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return filelength;
	}	
	
}
