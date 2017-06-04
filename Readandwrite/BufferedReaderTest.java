package Readandwrite;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
/**
 * Tools using bufferedreader.
 * This is only for files with one line.
 * Multiple line options are unlikely to be added, due to this class being replaced.
 * Only to be used for compatibility. It is recommended to use {@link Reading.SeparatorReader} instead.
 */
public class BufferedReaderTest {

	public File file;

	/**
	 * Creates a BufferedReaderTest object.
	 * @param f the file to read from
	 */
	public BufferedReaderTest(File f){
		file = f;
	}
	/**
	 * Reads a single line in a file.
	 * @deprecated use {@link Reading.SeparatorReader#readLine()} or {@link Reading.CharsetReader#readLine()}
	 * @return the next line in the file
	 */
	public String readSingleLineFile(){
		String line = null;
		try(BufferedReader reader = new BufferedReader(new FileReader(file))){
			line =  reader.readLine();
			reader.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		return line;
	}
	/**
	 * Reads the number in a file.
	 * @return the integer across the line
	 */
	public int getIntergerinSingleLineFile(){
		int number = 0;
		try(BufferedReader reader = new BufferedReader(new FileReader(file))){
			String line = reader.readLine();
			if(line == null) return -1;
			else number = Integer.parseInt(line);
			reader.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
		return number;
	}
	/**
	 * Gets the length of a file with one line.
	 * @return the length of the file
	 */
	public int getLengthofSingleLineFile(){
		int filelength = 0;
		try(BufferedReader reader = new BufferedReader(new FileReader(file))){
			String line = reader.readLine();
			line = (line == null ? "" : line);
			filelength = line.length();
			reader.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		return filelength;
	}
}
