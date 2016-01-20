package Readandwrite;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
/**
 * Tools using bufferedreader.
 *
 */
public class BufferedReaderTest {
	public BufferedReaderTest(){
		
	}
/**
 * The BufferedReader object for the class.
 */
static BufferedReader reader = null;
/**
 * Reads a single line in a file.
 * @param file the file being read.
 */
public String readSingleLineFile(File file){
	String line = null;
	try{
	reader = new BufferedReader(new FileReader(file));
	while((line = reader.readLine())!=null){
	}
	}catch(IOException e){
		e.printStackTrace();
	}finally{
		try{
			reader.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	return line;
}
/**
 * Reads the number in a file.
 * @param file the file being read
 */
public int getIntergerinSingleLineFile(File file){
	String line = null;
	int number = 0;
	try{
		reader = new BufferedReader(new FileReader(file));
		while((line = reader.readLine())!=null){
			number = Integer.parseInt(line);
		}
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				reader.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	return number;
}
/**
 * Gets the length of a file with one line.
 * @param file the file being read.
 */
public int getLengthofSingleLineFile(File file){
	String line;
	int filelength = 0;
	try{
		reader = new BufferedReader(new FileReader(file));
		while((line = reader.readLine())!=null){
			filelength = line.length();
			System.out.println(filelength);
		}
	}catch(IOException e){
		e.printStackTrace();
	}finally{
		try{
			reader.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	return filelength;
}
}
