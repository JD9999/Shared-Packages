package Readandwrite;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/**
 * Tools using bufferedwriter.
 * Since there has been no Writing package in V1.0, 
 * both this and the {@link Readandwrite.RandomAccessFileTest} class are the only ways to use the API to write.
 */
public class BufferedWriterTest {

	/**
	 * The file to write to
	 */
	public File file;
	
	/**
	 * Whether to append to the file or not
	 */
	public boolean append;

	/**
	 * Creates a BufferedWriterTest object.
	 * @param f the file to write to
	 */
	public BufferedWriterTest(File f){
		this(f, false);
	}	

	/**
	 * Creates a BufferedWriterTest object.
	 * @param f the file to write to
	 * @param append whether to append to the file or not
	 */
	public BufferedWriterTest(File f, boolean append){
		file = f;
		this.append = append;
	}

	/**
	 * Writes to a file.
	 * If append is true, the writer will skip to the end of the file.
	 * Otherwise, the file will be wiped before being written to.
	 * @param content the content to write to the file.
	 */
	public void writeToFile(String content){
		write(content);
	}
	/**
	 * Writes an integer to a file.
	 * If append is true, the writer will skip to the end of the file.
	 * Otherwise, the file will be wiped before being written to.
	 * @param contents the number to write.
	 */
	public void writeIntegerToFile(int contents){
		String content = String.valueOf(contents);
		write(content);
	}

	private void write(String content){
		try {
			BufferedWriter writer = append ? new BufferedWriter(new FileWriter(file, true)) : new BufferedWriter(new FileWriter(file));
			writer.write(content);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
