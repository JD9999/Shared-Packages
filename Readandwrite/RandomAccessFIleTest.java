package Readandwrite;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
RandomAccessFile raf = null;

public RandomAccessFileTest(){}

/**
 * Reads a single line of a file
 * @param file the file to be read
 * @return the first line in a file
 */
public String readStringInFile(File file){
	String line = null;
	try {
		raf = new RandomAccessFile(file, "r");
		/*
		 * You will notice that the second parameter I have put "r"
		 * This is the MODE of the file. There are four modes: 
		 * 1) "r" is read only
		 * 2) "rw" is read and write and will attempt to create the file if it is not found
		 * 3) "rws" is like rw, but the file and its metadata will be synchronised to disk (i.e. live save)
		 * 4) "rwd" is like rw, but the file and NOT the metadata will be live saved
		 */
		line = raf.readLine();
		
	} catch (IOException e) {
		e.printStackTrace();
	}finally{
		try{
			raf.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	return line;
}
/**
 * Reads a single integer
 * @param file the file to read
 * @return the 1st integer
 */
public int readIntegerInFile(File file){
	int fileint = 0;
	try {
		raf = new RandomAccessFile(file, "r");
		fileint = Integer.parseInt(readStringInFile(file));
	} catch (IOException e) {
		e.printStackTrace();
	}finally{
		try{
			raf.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	return fileint;
}
/**
 * Reads a byte in a file
 * @param file the file to read
 * @return a byte in a file
 */
public byte readByteInFile(File file){
	byte bytes = 0;
	try{
		raf = new RandomAccessFile(file, "r");
		bytes = new Byte(readStringInFile(file));
	}catch(IOException e){
		e.printStackTrace();
	}finally{
		try{
			raf.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	return bytes;
}
/**
 * Reads an int in a file represented as a long.
 * @param file the file to read
 * @return the long representation of an int in the file
 */
public long readLongInFile(File file){
	long number = 0;
	try{
		raf = new RandomAccessFile(file, "r");
		number = Long.parseLong(readStringInFile(file));
	}catch(IOException e){
		e.printStackTrace();
	}finally{
		try{
			raf.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	return number;
}
/**
 * Reads a boolean (true/false) in a file
 * @param file the file to read
 * @return true or false, or an error.
 */
public boolean readBooleanInFile(File file){
	boolean yes = false;
	try{
		raf = new RandomAccessFile(file, "r");
		yes = raf.readBoolean();
	}catch(IOException e){
		e.printStackTrace();
	}finally{
		try{
			raf.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	return yes;
}
/**
 * Reads an int in a double representation. Lots of things in minecraft use either ints or doubles.
 * @param file The file to read
 * @return a double representation of an int
 */
public double readDoubleInFile(File file){
	double number = 0;
	try{
		raf = new RandomAccessFile(file, "r");
		number = new Double(readStringInFile(file));
	}catch(IOException e){
		e.printStackTrace();
	}finally{
		try{
			raf.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	return number;
}/**
  * Reads a short in a file
  * @param file the file to be read
  * @return a short representation of an integer inside a file
  */
public short readShortInFile(File file){
	short number = 0;
	try{
		raf = new RandomAccessFile(file, "r");
		number = new Short(readStringInFile(file));
	}catch(IOException e){
		e.printStackTrace();
	}finally{
		try{
			raf.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	return number;
}
/**
 * Gets the length of a file
 * @param file the file to read
 * @return the length of a file
 */
public long getLengthOfFile(File file){
	long length = 0;
	try{
		raf = new RandomAccessFile(file, "r");
		length = raf.length();
		
	}catch(IOException e){
		e.printStackTrace();
	}finally{
		try{
			raf.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	return length;
}
/**
 * Writes a boolean to a file
 * @param file the file to write to
 * @param b the boolean to write to the file
 */
public void writeBoolean(File file, boolean b){
	String bool = String.valueOf(b);
	if(bool.equals("true")){
		writeString(file, "true");
	}else if (bool.equals("false")){
		writeString(file, "false");
	}else{
		System.out.println(bool);
	}
	
}
/**
 * Writes an array of bytes to a file
 * You can turn bytes (byte) into a byte array (byte[]) using new byte[byte];
 * @param file the file to write to
 * @param bytes the byte array to write to a file.
 */
public void writeByteArray(File file, byte[] bytes){
	System.out.println(bytes);
	try{
		raf = new RandomAccessFile(file, "rw");
		raf.write(bytes);
	}catch(IOException e){
		e.printStackTrace();
	}finally{
		try{
			raf.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
/**
 * Writes a double to a file
 * @param file the file to write to
 * @param db the double to write to the file
 * @param deciaml whether to keep the decimal on the end or not
 */
public void writeDouble(File file, double db, boolean decimal){
		String str = String.valueOf(db);
		if(decimal)writeString(file, str.replace(".0", ""));
		else writeString(file, str);
}
/**
 * Writes a float to a file
 * @param file the file to write to
 * @param f the float to write to a file
 */
public void writeFloat(File file, float f, boolean decimal){
		String str = String.valueOf(f);
		if(decimal)writeString(file, str.replace(".0", ""));
		else writeString(file, str);
}
/**
 * writes an integer to a file
 * @param file the file to write to
 * @param i the integer to write
 */
public void writeInt(File file, int i){
		String str = String.valueOf(i);
		writeString(file, str);
}
/**
 * writes a long to the specified file
 * @param file the file to write to
 * @param l the long to write in the file
 */
public void writeLong(File file, long l){
		String str = String.valueOf(l);
		writeString(file, str);
}
/**
 * Writes a short to a file
 * @param file the file to write to
 * @param s the short ot write to the file
 */
public void writeShort(File file, short s){
		String str = String.valueOf(s);
		writeString(file, str);
}
/**
 * Writes a string to a file
 * @param file the file to write the string to
 * @param s the string to write
 */
public void writeString(File file, String s){
	try {
		raf = new RandomAccessFile(file, "rw");
		raf.writeBytes(s);
	} catch (IOException e) {
		e.printStackTrace();
	}finally{
		try{
			raf.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
}
