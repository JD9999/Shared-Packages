package Readandwrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * RandomAccessFile can access the file at a random point, as well as both reading and writing.
 */
public class RandomAccessFileTest {

	RandomAccessFile raf = null;
	private File file;

	/**
	 * Creates a RandomAccessFileTest object.
	 * This prepares the file for both reading and writing.
	 * @param f the file to read and/or write from
	 */
	public RandomAccessFileTest(File f){
		file = f;
		try {
			raf = new RandomAccessFile(file, "rw");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		/*
		 * You will notice that the second parameter I have put "r"
		 * This is the MODE of the file. There are four modes: 
		 * 1) "r" is read only
		 * 2) "rw" is read and write and will attempt to create the file if it is not found
		 * 3) "rws" is like rw, but the file and its metadata will be synchronised to disk (i.e. live save)
		 * 4) "rwd" is like rw, but the file and NOT the metadata will be live saved
		 */
	}

	/**
	 * Reads a single line of a file
	 * @return the first line in a file
	 * @deprecated Use {@link Reading.SeparatorReader#readLine()}
	 */
	public String readStringInFile(){
		String line = null;
		try {
			raf.seek(0);
			line = raf.readUTF();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return line;
	}
	/**
	 * Reads a single integer
	 * @return the 1st integer
	 */
	public int readIntegerInFile(){
		int fileInt = 0;
		try {
			raf.seek(0);
			fileInt = raf.readInt();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return fileInt;
	}
	/**
	 * Reads a byte in a file 
	 * @return a byte in a file
	 */
	public byte readByteInFile(){
		byte bytes = 0;
		try{
			raf.seek(0);
			bytes = raf.readByte();
		}catch(IOException e){
			e.printStackTrace();
		}
		return bytes;
	}
	/**
	 * Reads an int in a file represented as a long.
	 * @return the long representation of an int in the file
	 */
	public long readLongInFile(){
		long number = 0;
		try{
			raf.seek(0);
			number = raf.readLong();
		}catch(IOException e){
			e.printStackTrace();
		}
		return number;
	}
	/**
	 * Reads a boolean (true/false) in a file
	 * @return true or false, or an error.
	 */
	public boolean readBooleanInFile(){
		boolean yes = false;
		try{
			raf.seek(0);
			yes = raf.readBoolean();
		}catch(IOException e){
			e.printStackTrace();
		}
		return yes;
	}

	//Coded myself, does not use RandomAccessFile. But it has been tested to work!
	/**
	 * Reads a byte array
	 * @return the byte array
	 */
	public byte[] readByteArray(){
		try {
			raf.seek(0);
			byte[] array = new byte[(int)raf.length()]; //The array is as big as the size of the file
			raf.read(array);
			return array;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * Reads an int in a double representation.
	 * @return an int
	 */
	public double readDoubleInFile(){
		double number = 0;
		try{
			raf.seek(0);
			number = raf.readDouble();
		}catch(IOException e){
			e.printStackTrace();
		}
		return number;
	}

	/**
	 * Reads a int in a float representation
	 * @return a float
	 */
	public float readFloatInFile(){
		float number = 0f;
		try{
			raf.seek(0);
			number = raf.readFloat();
		}catch(IOException e){
			e.printStackTrace();
		}
		return number;
	}

	/**
	 * Reads a short in a file
	 * @return a short representation of an integer inside a file
	 */
	public short readShortInFile(){
		short number = 0;
		try{
			raf.seek(0);
			number = raf.readShort();
		}catch(IOException e){
			e.printStackTrace();
		}
		return number;
	}
	/**
	 * Gets the length of a file
	 * @return the length of a file
	 */
	public long getLengthOfFile(){
		long length = 0;
		try{
			length = raf.length();	
		}catch(IOException e){
			e.printStackTrace();
		}
		return length;
	}
	/**
	 * Writes a boolean to a file
	 * @param b the boolean to write to the file
	 */
	public void writeBoolean(boolean b){
		try {
			raf.setLength(0);
			raf.writeBoolean(b);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	/**
	 * Writes an array of bytes to a file
	 * You can turn bytes (byte) into a byte array (byte[]) using new byte[byte];
	 * @param bytes the byte array to write to a file.
	 */
	public void writeByteArray(byte[] bytes){
		try {
			raf.setLength(0);
			raf.write(bytes);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * Writes a double to a file
	 * @param db the double to write to the file
	 * @param decimal whether to keep the decimal on the end or not
	 */
	public void writeDouble(double db, boolean decimal){
		try {
			raf.setLength(0);
			if(decimal)raf.writeDouble(db);
			else{
				long l = (long)db;
				raf.writeLong(l);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * Writes a float to a file
	 * @param f the float to write to a file
	 * @param decimal whether to keep the decimal on the end or not
	 */
	public void writeFloat(float f, boolean decimal){
		try {
			raf.setLength(0);
			if(decimal)raf.writeFloat(f);
			else{
				int i = (int)f;
				raf.writeInt(i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * writes an integer to a file
	 * @param i the integer to write
	 */
	public void writeInt(int i){
		try {
			raf.setLength(0);
			raf.writeInt(i);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * writes a long to the specified file
	 * @param l the long to write in the file
	 */
	public void writeLong(long l){
		try {
			raf.setLength(0);
			raf.writeLong(l);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * Writes a short to a file
	 * @param s the short to write to the file
	 */
	public void writeShort(short s){
		try {
			raf.setLength(0);
			raf.writeShort(s);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * @param s the string to write
	 */
	public void writeString(String s){
		try {
			raf.setLength(0);
			raf.writeUTF(s);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
