package TestSharedPackages;

import java.util.Arrays;

import Readandwrite.BufferedReaderTest;
import Readandwrite.BufferedWriterTest;
import Readandwrite.Filesfiletest;
import Readandwrite.RandomAccessFileTest;

/**
 * The built-in tester for testing the Readandwrite package.
 */
public class ReadandwriteTester {

	public static void main(String[] args) {
		boolean error = false;
		boolean error11 = false;
		boolean error12 = false;
		boolean error13 = false;
		boolean error21 = false;
		boolean error22 = false;
		boolean error23 = false;
		boolean error31 = false;
		boolean error32 = false;
		boolean error33 = false;
		boolean error34 = false;
		boolean error35 = false;
		boolean error36 = false;
		boolean error37 = false;
		boolean error38 = false;
		System.out.println("Testing Readandwrite package!");
		BufferedReaderTest reader = new BufferedReaderTest(Entry.file1);
		BufferedWriterTest writer = new BufferedWriterTest(Entry.file1);
		Filesfiletest nio = new Filesfiletest(Entry.file1);
		RandomAccessFileTest random = new RandomAccessFileTest(Entry.file1);
		//-----
		System.out.println("Testing classes in alphabetical order!");
		//-----
		System.out.println("Testing classes 1 of 4 and 2 of 4 together: BufferedReaderTest and BufferedWriterTest");
		System.out.println("Commencing test 1 of 3: Reading and writing a line in a file");
		writer.writeToFile("This should be read");
		String line = reader.readSingleLineFile();
		if(line.equals("This should be read")) System.out.println("Reading and writing a line in a file complete!");
		else{
			System.out.println("FAILURE! Unable to read and write a line in a file");
			error = true;
			error11 = true;
		}
		System.out.println("Commencing test 2 of 3: Getting the length of a single line file");
		if(line.length() == reader.getLengthofSingleLineFile())System.out.println("Getting the length of a single line file complete!");
		else{
			System.out.println("FAILURE! Unable to get the length of a single line file");
			error = true;
			error12 = true;
		}
		writer.writeIntegerToFile(9);
		System.out.println("Commencing test 3 of 3: Reading and writing an integer in a file");
		if(reader.getIntergerinSingleLineFile() == 9) System.out.println("Reading and writing an integer in a file complete!");
		else{
			System.out.println("FAILURE! Unable to read and write an integer in a file");
			error = true;
			error13 = true;
		}
		//-----
		System.out.println("Testing classes 2 of 3 and 3 of 3 together: Filesfiletest.class");
		writer = new BufferedWriterTest(Entry.file1, true);
		System.out.println("Commencing test 1 of 3: Reading and writing an integer spread across multiple lines.");
		writer.writeToFile("4");
		writer.writeToFile("2");
		if(nio.getIntegersinMultipleLineFile() == 942) System.out.println("Reading and writing an integer spread across multiple lines complete!");
		else{
			System.out.println("FAILURE! Unable to read and write an integer spread across multiple lines");
			error = true;
			error21 = true;
		}
		System.out.println("Commencing test 2 of 3: Getting the length of a file!");
		if(nio.getLengthofMultipleLineFile() == 3) System.out.println("Getting the length of a file complete!");
		else{
			System.out.println("FAILURE! Unable to get the length of a file");
			error = true;
			error22 = true;
		}
		System.out.println("Commencing test 3 of 3: Reading and writing a multiple line file!");
		String sep = System.getProperty("line.separator");
		writer = new BufferedWriterTest(Entry.file1, false);
		writer.writeToFile("Jamie");
		writer = new BufferedWriterTest(Entry.file1, true);
		writer.writeToFile(sep);
		writer.writeToFile("Tim");
		writer.writeToFile(sep);
		writer.writeToFile("Ben");
		writer.writeToFile(sep);
		writer.writeToFile("Matthew");
		String fullLine = nio.readMultipleLineFile();
		if(fullLine.equals("Jamie" + sep + "Tim" + sep + "Ben" + sep + "Matthew")) System.out.println("Reading and writing a multiple line file complete!");
		else{
			System.out.println("FAILURE! Unable to read and write a multiple line file");
			error = true;
			error23 = true;
		}
		//-----
		System.out.println("Testing class 4 of 4: RandomAccessFileTest");
		System.out.println("Commencing test 1 of 8: Reading and writing a boolean!");
		random.writeBoolean(true);
		if(random.readBooleanInFile() == true) System.out.println("Reading and writing boolean complete!");
		else{
			System.out.println("FAILURE! Unable to read and write a boolean!");
			error = true;
			error31 = true;
		}
		System.out.println("Commencing test 2 of 8: Reading and writing a byte array!");
		byte[] bytes = new byte[]{'b', 'l', 'k'};
		random.writeByteArray(bytes);
		byte[] read = random.readByteArray();
		if(Arrays.equals(bytes, read)) System.out.println("Reading and writing byte array complete!");
		else{
			System.out.println("FAILURE! Unable to read and write a byte array!");
			error = true;
			error32 = true;
		}
		System.out.println("Commencing test 3 of 8: Reading and writing a double!");
		double d = 18.92;
		random.writeDouble(d, true);
		if(random.readDoubleInFile() == 18.92) System.out.println("Reading and writing double complete!");
		else{
			System.out.println("FAILURE! Unable to read and write a double!");
			error = true;
			error33 = true;
		}
		System.out.println("Commencing test 4 of 8: Reading and writing a float!");
		float f = 4f;
		random.writeFloat(f, true);
		if(random.readFloatInFile() == 4f) System.out.println("Reading and writing float complete!");
		else{
			System.out.println("FAILURE! Unable to read and write a float");
			error = true;
			error34 = true;
		}
		System.out.println("Commencing test 5 of 8: Reading and writing an int!");
		int i = 832;
		random.writeInt(i);
		if(random.readIntegerInFile() == 832) System.out.println("Reading and writing integer complete!");
		else{
			System.out.println("FAILURE! Unable to read and write an integer");
			error = true;
			error35 = true;
		}
		System.out.println("Commencing test 6 of 8: Reading and writing a long!");
		long l = 834;
		random.writeLong(l);
		if(random.readLongInFile() == 834) System.out.println("Reading and writing long complete!");
		else{
			System.out.println("FAILURE! Unable to read and write a long");
			error = true;
			error36 = true;
		}
		System.out.println("Commencing test 7 of 8: Reading and writing a short!");
		short s = 9;
		random.writeShort(s);
		if(random.readShortInFile() == 9) System.out.println("Reading and writing short complete!");
		else{
			System.out.println("FAILURE! Unable to read and write a short");
			error = true;
			error37 = true;
		}
		System.out.println("Commencing test 8 of 8: Reading and writing a string!");
		String string = "Hello everybody!";
		random.writeString(string);
		if(random.readStringInFile().equals("Hello everybody!")) System.out.println("Reading and writing string complete!");
		else{
			System.out.println("FAILURE! Unable to read and write a string");
			error = true;
			error38 = true;
		}
		
		if(!error) System.out.println("No errors!");
		else{
			if(error11) System.err.println("Error with BufferedReaderTest/BufferedWriterTest, unable to read and write a line in a file");
			if(error12) System.err.println("Error with BufferedReaderTest, unable to get the length of a single line file");
			if(error13) System.err.println("Error with BufferedReaderTest/BufferedWriterTest, unable to read and write an integer in a file");
			if(error21) System.err.println("Error with Filesfiletest/BufferedWriterTest, unable to read and write an integer spread across multiple lines");
			if(error22) System.err.println("Error with Filesfiletest, unable to get the length of a file");
			if(error23) System.err.println("Error with Filesfiletest/BufferedWriterTest, unable to read and write a multiple line file");
			if(error31) System.err.println("Error with RandomAccessFileTest, unable to read and write a boolean!");
			if(error32) System.err.println("Error with RandomAccessFileTest, unable to read and write a byte array!");
			if(error33) System.err.println("Error with RandomAccessFileTest, unable to read and write a double!");
			if(error34) System.err.println("Error with RandomAccessFileTest, unable to read and write a float!");
			if(error35) System.err.println("Error with RandomAccessFileTest, unable to read and write an integer!");
			if(error36) System.err.println("Error with RandomAccessFileTest, unable to read and write a long!");
			if(error37) System.err.println("Error with RandomAccessFileTest, unable to read and write a short!");
			if(error38) System.err.println("Error with RandomAccessFileTest, unable to read and write a string!");
		}
		
	}
}
