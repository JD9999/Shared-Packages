package Readandwrite;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/**
 * Tools using bufferedwriter.
 *
 */
public class BufferedWriterTest {
	
public BufferedWriterTest(){
	
}	
	
/**
 * Writes to a file.
 * @param contents the content to write to the file.
 * @param append if true it will append. If false it won't. Please put true or false, not null.
 * @param file the file being written to.
 */
public void writeToFile(String contents, boolean append, File file){
	BufferedWriter writer = null;
	if(append){
		try {
			writer = new BufferedWriter(new FileWriter(file, true));
			writer.write(contents);
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try{
				writer.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}else{
		try {
			writer = new BufferedWriter(new FileWriter(file));
			writer.write(contents);
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try{
				writer.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}
/**
 * Writes an integer to a file.
 * @param contents the number to write.
 * @param append if true it will append. If false it won't. Please put true or false, not null.
 * @param file the file being written to.
 */
public void writeIntegerToFile(int contents, boolean append, File file){
	String content = String.valueOf(contents);
	BufferedWriter writer = null;
	if(append){
		try {
			writer = new BufferedWriter(new FileWriter(file, true));
			writer.write(content);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}else{
		try {
			writer = new BufferedWriter(new FileWriter(file));
			writer.write(content);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
}
