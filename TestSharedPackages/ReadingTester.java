package TestSharedPackages;

import java.awt.Dimension;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;

import Reading.CharsetReader;
import Reading.ContextReader;
import Reading.FilterReader;
import Reading.ProfanitySource;
import Reading.Purpose;
import Reading.PurposeFormat;
import Reading.MessagePurpose;
import Reading.SeparatorReader;

/**
 * The built-in tester for testing the Reading package.
 */
public class ReadingTester {

	private static final String FILE_CONTENTS = "Hello everybody its me";
	private static final String FILE_CONTENTS_NO_EVERYBODY = "Hello its me";
	protected static JTextArea errorArea = new JTextArea();
	protected static JTextArea outputArea = new JTextArea();
	protected static final String LINE_SEPARATOR = System.getProperty("line.separator");

	public static void main(String[] args) {
		System.out.println("Preparing ReadingTester...");
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(Entry.file1));
			writer.write(FILE_CONTENTS);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}	

		boolean error = false;

		boolean error11 = false;
		boolean error12 = false;
		boolean error13 = false;

		boolean error21 = false;
		boolean error22 = false;
		boolean error23 = false;
		boolean error24 = false;
		boolean error25 = false;
		boolean error26 = false;
		boolean error27 = false;
		boolean error28 = false;
		boolean error29 = false;

		boolean error311 = false;
		boolean error312 = false;
		boolean error313 = false;
		boolean error314 = false;
		boolean error315 = false;
		boolean error316 = false;
		boolean error321 = false;
		boolean error322 = false;
		boolean error323 = false;
		boolean error324 = false;
		boolean error325 = false;
		boolean error326 = false;
		boolean error331 = false;
		boolean error332 = false;
		boolean error333 = false;
		boolean error334 = false;
		boolean error335 = false;
		boolean error336 = false;
		boolean error3s1 = false;
		boolean error3s2 = false;

		boolean error41 = false;
		boolean error42 = false;
		boolean error43 = false;
		boolean error44 = false;
		boolean error45 = false;
		boolean error46 = false;
		boolean error4s = false;

		boolean error51 = false;
		boolean error52 = false;
		boolean error53 = false;
		boolean error54 = false;
		boolean error55 = false;
		boolean error56 = false;
		boolean error57 = false;
		boolean error58 = false;
		boolean error59 = false;
		boolean error510 = false;
		boolean error511 = false;
		boolean error512 = false;

		boolean error61 = false;
		boolean error62 = false;
		boolean error63 = false;

		boolean error71 = false;
		boolean error72 = false;
		boolean error73 = false;
		boolean error74 = false;

		boolean error811 = false;
		boolean error812 = false;
		boolean error813 = false;
		boolean error814 = false;
		boolean error815 = false;
		boolean error816 = false;
		boolean error817 = false;
		boolean error818 = false;
		boolean error819 = false;
		boolean error8110 = false;
		boolean error821 = false;
		boolean error822 = false;
		boolean error823 = false;
		boolean error824 = false;
		boolean error825 = false;
		boolean error826 = false;
		boolean error827 = false;
		boolean error828 = false;
		boolean error829 = false;
		boolean error8210 = false;
		boolean error831 = false;
		boolean error832 = false;
		boolean error833 = false;
		boolean error834 = false;
		boolean error835 = false;
		boolean error836 = false;
		boolean error837 = false;
		boolean error838 = false;
		boolean error839 = false;
		boolean error8310 = false;

		System.out.println("Testing Reading package");

		System.out.println("Testing class 1 of 8: CharsetReader");
		//Define variables for CharsetReader testing.
		Charset set = Charset.defaultCharset();
		CharsetReader chreaderF = null;
		CharsetReader chreaderI = null;
		CharsetReader chreaderU = null;
		try {
			chreaderF = new CharsetReader(set, Entry.file1);
		} catch (IOException e) {
			System.err.println("Constructor error CharsetReader File: " + e.getMessage());
			error = true;
		}
		try {
			chreaderI = new CharsetReader(set, new FileInputStream(Entry.file1));
		} catch (IOException e) {
			System.err.println("Constructor error CharsetReader InputStream: " + e.getMessage());
			error = true;
		}
		try {
			chreaderU = new CharsetReader(set, Entry.file1.toURI());
		} catch (IOException e) {
			System.err.println("Constructor error CharsetReader URI: " + e.getMessage());
			error = true;
		}
		if(error){
			System.err.println("Not able to test Reading package due to problem constructor(s). Skipping Reading tester.");
			return;
		}

		System.out.println("Commencing test 1 of 3: Reading from file");
		try {
			if(chreaderF.readLine().equals(FILE_CONTENTS)) System.out.println("Reading from a file complete!");
			else{
				System.out.println("FAILURE! Unable to read from a file");
				error = true;
				error11 = true;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Commencing test 2 of 3: Reading from InputStream");
		try {
			if(chreaderI.readLine().equals(FILE_CONTENTS)) System.out.println("Reading from an InputStream complete!");
			else{
				System.out.println("FAILURE! Unable to read from an InputStream");
				error = true;
				error12 = true;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Commencing test 3 of 3: Reading from URI");
		try {
			if(chreaderU.readLine().equals(FILE_CONTENTS)) System.out.println("Reading from a URI complete!");
			else{
				System.out.println("FAILURE! Unable to read from a URI");
				error = true;
				error13 = true;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Testing class 2 of 8: ContextReader");
		ContextReader conReader = null;
		ProfanitySource source = new ProfanitySource();
		source.addProfanity("everybody");
		MessagePurpose purpose = new MessagePurpose(FILE_CONTENTS, source);

		System.out.println("Commencing test 1 of 9: Reading from an InputStream, given a MessagePurpose");
		try {
			conReader = new ContextReader(purpose, new FileInputStream(Entry.file1));
			String line = conReader.readLineInContext();
			if(line.equals(FILE_CONTENTS_NO_EVERYBODY)) System.out.println("Reading from an InputStream, given a MessagePurpose complete!");
			else{
				System.out.println("FAILURE! Unable to read from an InputStream, with a given MessagePurpose");
				error = true;
				error21 = true;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Commencing test 2 of 9: Reading from a file, given a MessagePurpose");
		try {
			conReader = new ContextReader(purpose, Entry.file1);
			String line = conReader.readLineInContext();
			if(line.equals(FILE_CONTENTS_NO_EVERYBODY)) System.out.println("Reading from a file, given a MessagePurpose complete!");
			else{
				System.out.println("FAILURE! Unable to read from a file, with a given MessagePurpose");
				error = true;
				error22 = true;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Commencing test 3 of 9: Reading from a URI, given a MessagePurpose");
		try {
			conReader = new ContextReader(purpose, Entry.file1.toURI());
			String line = conReader.readLineInContext();
			if(line.equals(FILE_CONTENTS_NO_EVERYBODY)) System.out.println("Reading from a URI, given a MessagePurpose complete!");
			else{
				System.out.println("FAILURE! Unable to read from a URI, with a given MessagePurpose");
				error = true;
				error23 = true;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Commencing test 4 of 9: Reading from an InputStream, given a MessagePurpose and a PurposeFormat");
		try {
			conReader = new ContextReader(purpose, purpose.obtainFormat(), new FileInputStream(Entry.file1));
			String line = conReader.readLineInContext();
			if(line.equals(FILE_CONTENTS_NO_EVERYBODY)) System.out.println("Reading from an InputStream, given a MessagePurpose and a PurposeFormat complete!");
			else{
				System.out.println("FAILURE! Unable to read from an InputStream, given a MessagePurpose and a PurposeFormat");
				error = true;
				error24 = true;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Commencing test 5 of 9: Reading from a File, given a MessagePurpose and a PurposeFormat");
		try {
			conReader = new ContextReader(purpose, purpose.obtainFormat(), Entry.file1);
			String line = conReader.readLineInContext();
			if(line.equals(FILE_CONTENTS_NO_EVERYBODY)) System.out.println("Reading from a File, given a MessagePurpose and a PurposeFormat complete!");
			else{
				System.out.println("FAILURE! Unable to read from a File, given a MessagePurpose and a PurposeFormat");
				error = true;
				error25 = true;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Commencing test 6 of 9: Reading from a URI, given a MessagePurpose and a PurposeFormat");
		try {
			conReader = new ContextReader(purpose, purpose.obtainFormat(), Entry.file1.toURI());
			String line = conReader.readLineInContext();
			if(line.equals(FILE_CONTENTS_NO_EVERYBODY)) System.out.println("Reading from a URI, given a MessagePurpose and a PurposeFormat complete!");
			else{
				System.out.println("FAILURE! Unable to read from a URI, given a MessagePurpose and a PurposeFormat");
				error = true;
				error26 = true;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Commencing test 7 of 9: Reading from an InputStream, given a MessagePurpose, a PurposeFormat and a ProfanitySource");
		try {
			conReader = new ContextReader(purpose, purpose.obtainFormat(), new FileInputStream(Entry.file1));
			String line = conReader.readLineInContext();
			if(line.equals(FILE_CONTENTS_NO_EVERYBODY)) System.out.println("Reading from an InputStream, given a MessagePurpose, a PurposeFormat and a ProfanitySource complete!");
			else{
				System.out.println("FAILURE! Unable to read from an InputStream, given a MessagePurpose, a PurposeFormat and a ProfanitySource");
				error = true;
				error27 = true;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Commencing test 8 of 9: Reading from a file, given a MessagePurpose, a PurposeFormat and a ProfanitySource");
		try {
			conReader = new ContextReader(purpose, purpose.obtainFormat(), Entry.file1);
			String line = conReader.readLineInContext();
			if(line.equals(FILE_CONTENTS_NO_EVERYBODY)) System.out.println("Reading from a file, given a MessagePurpose, a PurposeFormat and a ProfanitySource complete!");
			else{
				System.out.println("FAILURE! Unable to read from a file, given a MessagePurpose, a PurposeFormat and a ProfanitySource");
				error = true;
				error28 = true;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Commencing test 9 of 9: Reading from a URI, given a MessagePurpose, a PurposeFormat and a ProfanitySource");
		try {
			conReader = new ContextReader(purpose, purpose.obtainFormat(), Entry.file1.toURI());
			String line = conReader.readLineInContext();
			if(line.equals(FILE_CONTENTS_NO_EVERYBODY)) System.out.println("Reading from a URI, given a MessagePurpose, a PurposeFormat and a ProfanitySource complete!");
			else{
				System.out.println("FAILURE! Unable to read from a URI, given a MessagePurpose, a PurposeFormat and a ProfanitySource");
				error = true;
				error29 = true;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Testing class 3 of 8: FilterReader");
		FilterReader filterReader = null;
		try {
			filterReader = new FilterReader(Entry.file1);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println("Preparing file for testing usage. Please wait.");
		List<String> testLines = new ArrayList<String>();
		testLines.add("Hello everybody");
		testLines.add("It is time for a game.");
		testLines.add("Let's play:");
		testLines.add("WRITE LINES TO A FILE");
		testLines.add("It starts by picking some sentences,");
		testLines.add("and writing them down.");
		testLines.add("Do you want to play?");
		try {
			OpenOption[] array = new OpenOption[]{StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.DSYNC};
			Files.write(Entry.file1.toPath(), testLines, array);
		} catch (IOException e1) {
			e1.printStackTrace();	
		}

		System.out.println("Commencing test 1 of 20: Getting the number of a character from a file");
		if(filterReader.numberOfChar('e') == 11) System.out.println("Getting the number of a character from a file complete!");
		else{
			System.out.println("FAILURE! Unable to get the number of a character from a file");
			error = true;
			error311 = true;
		}

		System.out.println("Commencing test 2 of 20: Getting the number of lines that contain a character from a file");
		int meat = filterReader.numberOfLinesHaveString("meat");
		int Hello = filterReader.numberOfLinesHaveString("Hello"); //While variable declaration IDs should be lowercase, this is an exception because it matches the search string.
		if(meat == 0 && Hello == 1) System.out.println("Getting the number of lines that contain a character from a file complete!");
		else{
			System.out.println("FAILURE! Unable to get the number of lines that contain a character from a file");
			error = true;
			error312 = true;
		}
		System.out.println("Commencing test 3 of 20: Reading a file line by line");
		try {
			List<String> ls = filterReader.readAllLines();
			if(ls.size() == 7)System.out.println("Reading a file line by line complete!");
			else{
				System.out.println("FAILURE! Unable to read a file line by line");
				error = true;
				error313 = true;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		List<String> minuses = new ArrayList<String>();
		minuses.add("everybody");
		minuses.add("time");
		minuses.add("LINES");
		minuses.add("some");
		minuses.add("want");
		minuses.add("to");
		System.out.println("Commencing test 4 of 20: filtering out words in a file");
		List<String> newList = filterReader.readExceptContains(minuses);
		String zeroLine = newList.get(0);
		String oneLine = newList.get(1);
		String twoLine = newList.get(2);
		String threeLine = newList.get(3);
		String fourLine = newList.get(4);
		String fiveLine = newList.get(5);
		String sixLine = newList.get(6);
		if(zeroLine.equals("Hello ") && oneLine.equals("It is  for a game.") && twoLine.equals("Let's play:") && threeLine.equals("WRITE  TO A FILE") && fourLine.equals("It starts by picking  sentences,") && fiveLine.equals("and writing them down.") && sixLine.equals("Do you   play?")) System.out.println("filtering out words in a file complete!");
		else{
			System.out.println("FAILURE! Unable to filter out words in a file");
			error = true;
			error314 = true;
		}

		System.out.println("Commencing test 5 of 20: filtering out lines in a file");
		List<String> badLines = new ArrayList<String>();
		badLines.add("and writing them down.");
		badLines.add("Hello everybody");		
		List<String> newList2 = filterReader.readExceptLines(badLines);
		if(newList2.size() == 5) System.out.println("filtering out lines in a file complete!");
		else{
			System.out.println("FAILURE! Unable to filter out lines in a file");
			error = true;
			error315 = true;
		}

		System.out.println("Commencing test 6 of 20: removing a letter from lines in a file");
		char badChar = 'g';
		List<String> newList3 = filterReader.removeLetter(badChar);
		boolean failure = false;
		for(String line : newList3){
			if(line.contains("g")) failure = true;
		}
		if(!failure) System.out.println("removing a letter from lines in a file complete!");
		else{
			System.out.println("FAILURE! Unable to remove a letter from lines in a file");
			error = true;
			error316 = true;
		}

		try {
			filterReader = new FilterReader(new FileInputStream(Entry.file1));
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		System.out.println("Commencing test 7 of 20: Getting the number of a character from an InputStream");
		if(filterReader.numberOfChar('e') == 11) System.out.println("Getting the number of a character from an InputStream complete!");
		else{
			System.out.println("FAILURE! Unable to get the number of a character from an InputStream");
			error = true;
			error321 = true;
		}

		System.out.println("Commencing test 8 of 20: Getting the number of lines that contain a character from an InputStream");
		if(filterReader.numberOfLinesHaveString("meat") == 0 && filterReader.numberOfLinesHaveString("Hello") == 1) System.out.println("Getting the number of lines that contain a character from an InputStream complete!");
		else{
			System.out.println("FAILURE! Unable to get the number of lines that contain a character from an InputStream");
			error = true;
			error322 = true;
		}
		System.out.println("Commencing test 9 of 20: Reading an InputStream line by line");
		try {
			List<String> ls = filterReader.readAllLines();
			if(ls.size() == 7)System.out.println("Reading an InputStream line by line complete!");
			else{
				System.out.println("FAILURE! Unable to read an InputStream line by line");
				error = true;
				error323 = true;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Commencing test 10 of 20: filtering out words in an InputStream");
		newList = filterReader.readExceptContains(minuses);
		zeroLine = newList.get(0);
		oneLine = newList.get(1);
		twoLine = newList.get(2);
		threeLine = newList.get(3);
		fourLine = newList.get(4);
		fiveLine = newList.get(5);
		sixLine = newList.get(6);
		if(zeroLine.equals("Hello ") && oneLine.equals("It is  for a game.") && twoLine.equals("Let's play:") && threeLine.equals("WRITE  TO A FILE") && fourLine.equals("It starts by picking  sentences,") && fiveLine.equals("and writing them down.") && sixLine.equals("Do you   play?")) System.out.println("filtering out words in an InputStream complete!");
		else{
			System.out.println("FAILURE! Unable to filter out words in an InputStream");
			error = true;
			error324 = true;
		}

		System.out.println("Commencing test 11 of 20: filtering out lines in an InputStream");
		badLines = new ArrayList<String>();
		badLines.add("and writing them down.");
		badLines.add("Hello everybody");		
		newList2 = filterReader.readExceptLines(badLines);
		if(newList2.size() == 5) System.out.println("filtering out lines in an InputStream complete!");
		else{
			System.out.println("FAILURE! Unable to filter out lines in an InputStream");
			error = true;
			error325 = true;
		}

		System.out.println("Commencing test 12 of 20: removing a letter from lines in an InputStream");
		badChar = 'g';
		newList3 = filterReader.removeLetter(badChar);
		failure = false;
		for(String line : newList3){
			if(line.contains("g")) failure = true;
		}
		if(!failure) System.out.println("removing a letter from lines in an InputStream complete!");
		else{
			System.out.println("FAILURE! Unable to remove a letter from lines in an InputStream");
			error = true;
			error326 = true;
		}

		try {
			filterReader = new FilterReader(Entry.file1.toURI());
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		System.out.println("Commencing test 13 of 20: Getting the number of a character from a URI");
		if(filterReader.numberOfChar('e') == 11) System.out.println("Getting the number of a character from a URI complete!");
		else{
			System.out.println("FAILURE! Unable to get the number of a character from a URI");
			error = true;
			error331 = true;
		}

		System.out.println("Commencing test 14 of 20: Getting the number of lines that contain a character from a URI");
		if(filterReader.numberOfLinesHaveString("meat") == 0 && filterReader.numberOfLinesHaveString("Hello") == 1) System.out.println("Getting the number of lines that contain a character from a file complete!");
		else{
			System.out.println("FAILURE! Unable to get the number of lines that contain a character from a URI");
			error = true;
			error332 = true;
		}
		System.out.println("Commencing test 15 of 20: Reading a URI line by line");
		try {
			List<String> ls = filterReader.readAllLines();
			if(ls.size() == 7)System.out.println("Reading a URI line by line complete!");
			else{
				System.out.println("FAILURE! Unable to read a URI line by line");
				error = true;
				error333 = true;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Commencing test 16 of 20: filtering out words in a URI");
		newList = filterReader.readExceptContains(minuses);
		zeroLine = newList.get(0);
		oneLine = newList.get(1);
		twoLine = newList.get(2);
		threeLine = newList.get(3);
		fourLine = newList.get(4);
		fiveLine = newList.get(5);
		sixLine = newList.get(6);
		if(zeroLine.equals("Hello ") && oneLine.equals("It is  for a game.") && twoLine.equals("Let's play:") && threeLine.equals("WRITE  TO A FILE") && fourLine.equals("It starts by picking  sentences,") && fiveLine.equals("and writing them down.") && sixLine.equals("Do you   play?")) System.out.println("filtering out words in a URI complete!");
		else{
			System.out.println("FAILURE! Unable to filter out words in a URI");
			error = true;
			error334 = true;
		}

		System.out.println("Commencing test 17 of 20: filtering out lines in a URI");
		badLines = new ArrayList<String>();
		badLines.add("and writing them down.");
		badLines.add("Hello everybody");		
		newList2 = filterReader.readExceptLines(badLines);
		if(newList2.size() == 5) System.out.println("filtering out lines in a URI complete!");
		else{
			System.out.println("FAILURE! Unable to filter out lines in a file");
			error = true;
			error335 = true;
		}

		System.out.println("Commencing test 18 of 20: removing a letter from lines in a URI");
		badChar = 'g';
		newList3 = filterReader.removeLetter(badChar);
		failure = false;
		for(String line : newList3){
			if(line.contains("g")) failure = true;
		}
		if(!failure) System.out.println("removing a letter from lines in a URI complete!");
		else{
			System.out.println("FAILURE! Unable to remove a letter from lines in a URI");
			error = true;
			error336 = true;
		}

		String testString = "There are some people in a cafe.";
		List<String> badWords = new ArrayList<String>();
		badWords.add("people");
		badWords.add("cafe");
		System.out.println("Commencing test 19 of 20: replacing bad words with asterisks (static method)");
		String newString = FilterReader.asterikWordsFromString(testString, badWords);
		if(newString.equals("There are some **** in a ****.")) System.out.println("replace bad words with asterisks complete!");
		else{
			System.out.println("FAILURE! Unable to replace bad words with asterisks");
			error = true;
			error3s1 = true;
		}

		System.out.println("Commencing test 20 of 20: filtering bad words from a string (static method)");
		newString = FilterReader.filterWordsFromString(testString, badWords);
		if(newString.equals("There are some in a .")) System.out.println("filtering bad words from a string complete!");
		else{
			System.out.println("FAILURE! Unable to filter bad words from a string");
			error = true;
			error3s2 = true;
		}

		System.out.println("Testing class 4 of 8: MessagePurpose");
		MessagePurpose mPurpose = null;
		System.out.println("Commencing test 1 of 7: Returning some given text");
		//Using this constructor and calling the perform(); method will ALWAYS return the text.
		mPurpose = new MessagePurpose(testString);
		if(mPurpose.perform().equals(testString)) System.out.println("Returning some given text complete!");
		else{
			System.out.println("FAILURE! Unable to return some given text");
			error = true;
			error41 = true;
		}

		System.out.println("Commencing test 2 of 7: Returning some text, given a PurposeFormat key");
		mPurpose = new MessagePurpose(testString, PurposeFormat.PLAIN_TEXT);
		if(mPurpose.perform().equals(testString)) System.out.println("Returning some text, given a PurposeFormat key complete!");
		else{
			System.out.println("FAILURE! Unable to return some text, given a PurposeFormat key");
			error = true;
			error42 = true;
		}

		System.out.println("Commencing test 3 of 7: Returning some text, given a PurposeFormat key and a ProfanitySource");
		source.removeProfanity("everybody");
		mPurpose = new MessagePurpose(testString, PurposeFormat.PLAIN_TEXT, source);
		if(mPurpose.perform().equals(testString)) System.out.println("Returning some text, given a PurposeFormat key and a ProfanitySource complete!");
		else{
			System.out.println("FAILURE! Unable to return some text, given a PurposeFormat key and a ProfanitySource");
			error = true;
			error43 = true;
		}

		System.out.println("Commencing test 4 of 7: Returning some text, given a ProfanitySource");
		mPurpose = new MessagePurpose(testString, source);
		if(mPurpose.perform().equals(testString)) System.out.println("Returning some text, given a ProfanitySource complete!");
		else{
			System.out.println("FAILURE! Unable to return some text, given a ProfanitySource");
			error = true;
			error44 = true;
		}

		System.out.println("Commencing test 5 of 7: Returning some text, given a PurposeFormat");
		mPurpose = new MessagePurpose(testString, new PurposeFormat(PurposeFormat.PLAIN_TEXT));
		if(mPurpose.perform().equals(testString)) System.out.println("Returning some text, given a PurposeFormat");
		else{
			System.out.println("FAILURE! Unable to return some text, given a PurposeFormat");
			error = true;
			error45 = true;
		}

		System.out.println("Commencing test 6 of 7: Returning some text, given a PurposeFormat and a ProfanitySource");
		source.removeProfanity("everybody");
		mPurpose = new MessagePurpose(testString, new PurposeFormat(PurposeFormat.PLAIN_TEXT), source);
		if(mPurpose.perform().equals(testString)) System.out.println("Returning some text, given a PurposeFormat and a ProfanitySource complete!");
		else{
			System.out.println("FAILURE! Unable to return some text, given a PurposeFormat and a ProfanitySource");
			error = true;
			error46 = true;
		}

		//Test static method. Aims to work out key, unlike constructor.
		System.out.println("Commencing test 7 of 7: Working out a MessagePurpose from an example string, and boolean to indicate whether to apply the default ProfanitySource or not, and then return a string of formatted text");
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
		String string = formatter.format(new Date());
		mPurpose = MessagePurpose.forString("It is the 18/06/23 today", true);
		String expected = "It is the " + string + " today";
		String result = mPurpose.perform();
		if(result.equals(expected)) System.out.println("Working out a MessagePurpose from an example string, and boolean to indicate whether to apply the default ProfanitySource or not, and then return a string of formatted text complete!");
		else{
			System.out.println("FAILURE! Unable to work out a MessagePurpose from an example string, and boolean to indicate whether to apply the default ProfanitySource or not, and then return a string of formatted text");
			error = true;
			error4s = true;
		}

		System.out.println("Testing class 5 of 8: ProfanitySource");
		ProfanitySource profSource;

		System.out.println("Commencing test 1 of 11: Obtaining a default ProfanitySource");
		profSource = new ProfanitySource();
		if(profSource.getAllProfanities().size() == 17) System.out.println("Obtaining a default ProfanitySource complete!");
		else{
			System.out.println("FAILURE! Unable to obtain a default ProfanitySource");
			error = true;
			error51 = true;
		}

		buildProfanities();
		System.out.println("Commencing test 2 of 11: Obtaining a default ProfanitySource, given a file to read the words from");
		try{
			profSource = new ProfanitySource(new File("profanities.txt"));
			if(profSource.getAllProfanities().size() == 16) System.out.println("Obtaining a default ProfanitySource, given a file to read the words from complete!");
			else{
				System.out.println("FAILURE! Unable to obtain a default ProfanitySource, given a file to read the words from");
				error = true;
				error53 = true;
			}
		}catch(IOException e){
			e.printStackTrace();
		}

		System.out.println("Commencing test 3 of 11: Obtaining a default ProfanitySource, given a file to read the words from, and a char split");
		try{
			profSource = new ProfanitySource(new File("profanities-comma.txt"), ',');
			if(profSource.getAllProfanities().size() == 16) System.out.println("Obtaining a default ProfanitySource, given a file to read the words from, and a char split complete!");
			else{
				System.out.println("FAILURE! Unable to obtain a default ProfanitySource, given a file to read the words from, and a char split");
				error = true;
				error54 = true;
			}
		}catch(IOException e){
			e.printStackTrace();
		}

		System.out.println("Commencing test 4 of 11: Obtaining a default ProfanitySource, given a file to read the words from, and a string split");
		try{
			profSource = new ProfanitySource(new File("profanities-comma.txt"), ",");
			if(profSource.getAllProfanities().size() == 16) System.out.println("Obtaining a default ProfanitySource, given a file to read the words from, and a string split complete!");
			else{
				System.out.println("FAILURE! Unable to obtain a default ProfanitySource, given a file to read the words from, and a string split");
				error = true;
				error55 = true;
			}
		}catch(IOException e){
			e.printStackTrace();
		}

		System.out.println("Commencing test 5 of 11: Obtaining a default ProfanitySource, given an InputStream to read the words from");
		try {
			profSource = new ProfanitySource(new FileInputStream("profanities.txt"));
			int size = profSource.getAllProfanities().size();
			if(size == 16) System.out.println("Obtaining a default ProfanitySource, given an InputStream to read the words from");
			else{
				System.out.println("FAILURE! Unable to obtain a default ProfanitySource, given an InputStream to read the words from");
				error = true;
				error56 = true;
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
			error = true;
			error56 = true;
		}


		System.out.println("Commencing test 6 of 11: Obtaining a default ProfanitySource, given an InputStream to read the words from, and a char split");
		try {
			profSource = new ProfanitySource(new FileInputStream("profanities-comma.txt"), ',');
			if(profSource.getAllProfanities().size() == 16) System.out.println("Obtaining a default ProfanitySource, given an InputStream to read the words from, and a char split complete!");
			else{
				System.out.println("FAILURE! Unable to obtain a default ProfanitySource, given an InputStream to read the words from, and a char split");
				error = true;
				error57 = true;
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
			error = true;
			error57 = true;
		}


		System.out.println("Commencing test 7 of 11: Obtaining a default ProfanitySource, given an InputStream to read the words from, and a string split");
		try {
			profSource = new ProfanitySource(new FileInputStream("profanities-comma.txt"), ",");
			if(profSource.getAllProfanities().size() == 16) System.out.println("Obtaining a default ProfanitySource, given an InputStream to read the words from, and a string split complete!");
			else{
				System.out.println("FAILURE! Unable to obtain a default ProfanitySource, given an InputStream to read the words from, and a string split");
				error = true;
				error58 = true;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Commencing test 8 of 11: Obtaining a default ProfanitySource, given the words");
		List<String> ls = new ArrayList<String>();
		ls.add("random");
		ls.add("people");
		ls.add("being");
		ls.add("stupid");
		profSource = new ProfanitySource(ls);
		if(profSource.getAllProfanities().size() == 4) System.out.println("Obtaining a default ProfanitySource, given the words complete!");
		else{
			System.out.println("FAILURE! Unable to obtain a default ProfanitySource, given the words");
			error = true;
			error59 = true;
		}

		System.out.println("Commencing test 9 of 11: Obtaining a default ProfanitySource, given a URI to read the words from");
		try{
			profSource = new ProfanitySource(new File("profanities.txt").toURI());
			if(profSource.getAllProfanities().size() == 16) System.out.println("Obtaining a default ProfanitySource, given a URI to read the words from complete!");
			else{
				System.out.println("FAILURE! Unable to obtain a default ProfanitySource, given a URI to read the words from");
				error = true;
				error510 = true;
			}
		}catch(IOException e){
			e.printStackTrace();
		}

		System.out.println("Commencing test 10 of 11: Obtaining a default ProfanitySource, given a URI to read the words from, and a char split");
		try{
			profSource = new ProfanitySource(new File("profanities-comma.txt").toURI(), ',');
			if(profSource.getAllProfanities().size() == 16) System.out.println("Obtaining a default ProfanitySource, given a URI to read the words from, and a char split complete!");
			else{
				System.out.println("FAILURE! Unable to obtain a default ProfanitySource, given a URI to read the words from, and a char split");
				error = true;
				error511 = true;
			}
		}catch(IOException e){
			e.printStackTrace();
		}

		System.out.println("Commencing test 11 of 11: Obtaining a default ProfanitySource, given a URI to read the words from, and a string split");
		try{
			profSource = new ProfanitySource(new File("profanities-comma.txt").toURI(), ",");
			if(profSource.getAllProfanities().size() == 16) System.out.println("Obtaining a default ProfanitySource, given a URI to read the words from, and a string split complete!");
			else{
				System.out.println("FAILURE! Unable to obtain a default ProfanitySource, given a URI to read the words from, and a string split");
				error = true;
				error512 = true;
			}
		}catch(IOException e){
			e.printStackTrace();
		}

		System.out.println("Testing class 6 of 8: Purpose");
		Purpose p;
		System.out.println("Commencing test 1 of 3: Obtaining a Purpose, given some text, and printing it.");
		p = new Purpose("Print this");
		String line = p.perform();
		if(line.equals(Entry.readLastLineInStream())) System.out.println("Obtaining a Purpose, given some text, and printing it complete!");
		else{
			System.out.println("FAILURE! Unable to obtain a Purpose, given some text, and print it");
			error = true;
			error61 = true;
		}

		JFrame frame = createGUI();
		System.out.println("Commencing test 2 of 3: Redirecting the error stream");
		TextPrintStream tps = new TextPrintStream(true, errorArea);
		p.redirectErrTo(tps);
		p.sendError("Errors should be on the RIGHT");
		if(errorArea.getText().equals("Errors should be on the RIGHT" + LINE_SEPARATOR)) System.out.println("Redirecting the error stream complete!");
		else{
			System.out.println("FAILURE! Unable to redirect the error stream");
			error = true;
			error62 = true;
		}

		System.out.println("Commencing test 3 of 3: Redirecting the output stream");
		tps = new TextPrintStream(false, outputArea);
		p.redirectOutTo(tps);
		p.sendInfo("Information should be on the LEFT");
		if(outputArea.getText().equals("Information should be on the LEFT" + LINE_SEPARATOR)) System.out.println("Redirecting the output stream complete!");
		else{
			System.out.println("FAILURE! Unable to redirect the output stream");
			error = true;
			error63 = true;
		}

		frame.dispose();

		System.out.println("Testing class 7 of 8: PurposeFormat");
		PurposeFormat plain = new PurposeFormat(PurposeFormat.PLAIN_TEXT);
		PurposeFormat everything = new PurposeFormat(PurposeFormat.CONTAINS_DATE_AND_OTHER_VARIABLES);
		System.out.println("Commencing test 1 of 4: Determining whether a mode contains the date or not");
		if(plain.containsDate() == false && everything.containsDate() == true) System.out.println("Determining whether a mode contains the date or not complete!");
		else{
			System.out.println("FAILURE! Unable to determine whether a mode contains the date or not");
			error = true;
			error71 = true;
		}

		System.out.println("Commencing test 2 of 4: Determining whether a mode contains variables or not");
		if(plain.containsVariables() == false && everything.containsVariables() == true) System.out.println("Determining whether a mode contains variables or not complete!");
		else{
			System.out.println("FAILURE! Unable to determine whether a mode contains variables or not");
			error = true;
			error72 = true;
		}

		System.out.println("Commencing test 3 of 4: Determining whether a mode knows it's desired charset");
		if(everything.getDesiredCharset() == Charset.defaultCharset() && plain.getDesiredCharset() == Charset.forName("UTF-8")) System.out.println("Determining whether a mode knows it's desired charset complete!");
		else{
			System.out.println("FAILURE! Unable to determine whether a mode knows it's desired charset");
			error = true;
			error73 = true;
		}

		System.out.println("Commencing test 4 of 4: Determining whether a mode has formatting or not");
		if(plain.hasNoFormat() == true && everything.hasNoFormat() == false) System.out.println("Determining whether a mode has formatting or not complete!");
		else{
			System.out.println("FAILURE! Unable to determine whether a mode has formatting or not");
			error = true;
			error74 = true;
		}

		System.out.println("Testing class 8 or 8: SeparatorReader");
		File f = buildFile();
		SeparatorReader fileReader = null;
		try{
			fileReader = new SeparatorReader(f);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Commencing test 1 of 30: Reading all the lines from a file");
		try{
			List<String> lines = fileReader.readAllLines();			
			if(lines.get(0).equals("line 1") && lines.get(1).equals("line 2") && lines.get(2).equals("line 3")) System.out.println("Reading all the lines from a file complete!");
			else{
				error = true;
				error811 = true;
				System.out.println("FAILURE! Unable to read all the lines from a file");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Commencing test 2 of 30: Reading the first line from a file");
		try{
			String l = fileReader.readLine();			
			if(l.equals("line 1")) System.out.println("Reading the first line from a file complete!");
			else{
				error = true;
				error812 = true;
				System.out.println("FAILURE! Unable to read the first line from a file");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Commencing test 3 of 30: Reading all of the file and putting it into a string");
		try{
			String output = fileReader.readAllLinesAsString();			
			if(output.equals("line 1" + LINE_SEPARATOR + "line 2" + LINE_SEPARATOR + "line 3")) System.out.println("Reading all the file and putting it into a string complete!");
			else{
				error = true;
				error813 = true;
				System.out.println("FAILURE! Unable to read all of the file and put it into a string!");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Commencing test 4 of 30: Reading a file until a character turns up");
		try{
			char[] chars = fileReader.readUntilChar('2');			
			if(new String(chars).equals("line 1" + LINE_SEPARATOR + "line ")) System.out.println("Reading a file until a character turns up complete!");
			else{
				error = true;
				error814 = true;
				System.out.println("FAILURE! Unable to read a file until a character turns up");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Commencing test 5 of 30: Reading a file until a string turns up");
		try{
			char[] chars = fileReader.readUntilChars("line 2");			
			if(new String(chars).equals("line 1" + LINE_SEPARATOR))System.out.println("Reading a file until a string turns up complete!");
			else{
				error = true;
				error815 = true;
				System.out.println("FAILURE! Unable to read a file until a string turns up");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Commencing test 6 of 30: Reading a file until a character turns up");
		try{
			String s = fileReader.readUntilString('2');			
			if(s.equals("line 1" + LINE_SEPARATOR + "line ")) System.out.println("Reading a file until a character turns up complete!");
			else{
				error = true;
				error816 = true;
				System.out.println("FAILURE! Unable to read a file until a character turns up");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Commencing test 7 of 30: Reading a file until a string turns up");
		try{
			String s = fileReader.readUntilString("line 2");			
			if(s.equals("line 1" + LINE_SEPARATOR))System.out.println("Reading a file until a string turns up complete!");
			else{
				error = true;
				error817 = true;
				System.out.println("FAILURE! Unable to read a file until a string turns up");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Commencing test 8 of 30: Filtering lines with a string in it from a file");
		try{
			List<String> lines = fileReader.separateLinesByContains("2");			
			if(lines.size() == 2) System.out.println("Filtering lines with a string in it from a file complete!");
			else{
				error = true;
				error818 = true;
				System.out.println("FAILURE! Unable to filter lines with a string in it from a file");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Commencing test 9 of 30: Splitting an absolute path into its path and the relative name of the file it is referring to from a file");
		try{
			BufferedWriter writer = new BufferedWriter(new FileWriter("SeparatorReaderFile.txt"));
			writer.write("C:" + File.separator + "Users" + File.separator + "user" + File.separator + "file.txt");
			writer.close();
			String[] array = fileReader.splitFileNameAndPath();			
			if(array[0].equals("C:" + File.separator + "Users" + File.separator + "user" + File.separator) && array[1].equals("file.txt")) System.out.println("Splitting an absolute path into its path and the relative name of the file it is referring to from a file complete!");
			else{
				error = true;
				error819 = true;
				System.out.println("FAILURE! Unable to split an absolute path into its path and the relative name of the file it is referring to from a file");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Commencing test 10 of 30: Splitting a string by a string, terminating at a given string from a file");
		try{
			String[] array = fileReader.splitUntilReached(File.separator, "user");			
			if(array.length == 3) System.out.println("Splitting a string by a string, terminating at a given string from a file complete!");
			else{
				error = true;
				error8110 = true;
				System.out.println("FAILURE! Unable to split a string by a string, terminating at a given string from a file");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			fileReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//InputStream
		buildFile();
		SeparatorReader streamReader = null;
		try{
			streamReader = new SeparatorReader(new FileInputStream(f));
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Commencing test 11 of 30: Reading all the lines from an InputStream");
		try{
			List<String> lines = streamReader.readAllLines();			
			if(lines.get(0).equals("line 1") && lines.get(1).equals("line 2") && lines.get(2).equals("line 3")) System.out.println("Reading all the lines from an InputStream complete!");
			else{
				error = true;
				error821 = true;
				System.out.println("FAILURE! Unable to read all the lines from an InputStream");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Commencing test 12 of 30: Reading the first line from an InputStream");
		try{
			String l = streamReader.readLine();
			if(l.equals("line 1")) System.out.println("Reading the first line from an InputStream complete!");
			else{
				error = true;
				error822 = true;
				System.out.println("FAILURE! Unable to read the first line from an InputStream");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Commencing test 13 of 30: Reading all of the InputStream and putting it into a string");
		try{
			String output = streamReader.readAllLinesAsString();			
			if(output.equals("line 1" + LINE_SEPARATOR + "line 2" + LINE_SEPARATOR + "line 3")) System.out.println("Reading all the file and putting it into a string complete!");
			else{
				error = true;
				error823 = true;
				System.out.println("FAILURE! Unable to read all of the InputStream and put it into a string!");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Commencing test 14 of 30: Reading an InputStream until a character turns up");
		try{
			char[] chars = streamReader.readUntilChar('2');			
			if(new String(chars).equals("line 1" + LINE_SEPARATOR + "line ")) System.out.println("Reading an InputStream until a character turns up complete!");
			else{
				error = true;
				error824 = true;
				System.out.println("FAILURE! Unable to read an InputStream until a character turns up");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Commencing test 15 of 30: Reading an InputStream until a string turns up");
		try{
			char[] chars = streamReader.readUntilChars("line 2");			
			if(new String(chars).equals("line 1" + LINE_SEPARATOR))System.out.println("Reading an InputStream until a string turns up complete!");
			else{
				error = true;
				error825 = true;
				System.out.println("FAILURE! Unable to read an InputStream until a string turns up");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Commencing test 16 of 30: Reading an InputStream until a character turns up");
		try{
			String s = streamReader.readUntilString('2');			
			if(s.equals("line 1" + LINE_SEPARATOR + "line ")) System.out.println("Reading an InputStream until a character turns up complete!");
			else{
				error = true;
				error826 = true;
				System.out.println("FAILURE! Unable to read an InputStream until a character turns up");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Commencing test 17 of 30: Reading an InputStream until a string turns up");
		try{
			String s = streamReader.readUntilString("line 2");			
			if(s.equals("line 1" + LINE_SEPARATOR))System.out.println("Reading an InputStream until a string turns up complete!");
			else{
				error = true;
				error827 = true;
				System.out.println("FAILURE! Unable to read an InputStream until a string turns up");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Commencing test 18 of 30: Filtering lines with a string in it from an InputStream");
		try{
			List<String> lines = streamReader.separateLinesByContains("2");			
			if(lines.size() == 2) System.out.println("Filtering lines with a string in it from an InputStream complete!");
			else{
				error = true;
				error828 = true;
				System.out.println("FAILURE! Unable to filter lines with a string in it from an InputStream");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Commencing test 19 of 30: Splitting an absolute path into its path and the relative name of the file it is referring to from an InputStream");
		try{
			BufferedWriter writer = new BufferedWriter(new FileWriter("SeparatorReaderFile.txt"));
			writer.write("C:" + File.separator + "Users" + File.separator + "user" + File.separator + "file.txt");
			writer.close();
			String[] array = streamReader.splitFileNameAndPath();			
			if(array[0].equals("C:" + File.separator + "Users" + File.separator + "user" + File.separator) && array[1].equals("file.txt")) System.out.println("Splitting an absolute path into its path and the relative name of the file it is referring to from an InputStream complete!");
			else{
				error = true;
				error829 = true;
				System.out.println("FAILURE! Unable to split an absolute path into its path and the relative name of the file it is referring to from an InputStream");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Commencing test 20 of 30: Splitting a string by a string, terminating at a given string from an InputStream");
		try{
			String[] array = streamReader.splitUntilReached(File.separator, "user");			
			if(array.length == 3) System.out.println("Splitting a string by a string, terminating at a given string from an InputStream complete!");
			else{
				error = true;
				error8210 = true;
				System.out.println("FAILURE! Unable to split a string by a string, terminating at a given string from an InputStream");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		//URI
		buildFile();
		SeparatorReader uriReader = null;
		try{
			uriReader = new SeparatorReader(f.toURI());
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Commencing test 21 of 30: Reading all the lines from a URI");
		try{
			List<String> lines = uriReader.readAllLines();			
			if(lines.get(0).equals("line 1") && lines.get(1).equals("line 2") && lines.get(2).equals("line 3")) System.out.println("Reading all the lines from a URI complete!");
			else{
				error = true;
				error831 = true;
				System.out.println("FAILURE! Unable to read all the lines from a URI");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Commencing test 22 of 30: Reading the first line from a URI");
		try{
			String l = uriReader.readLine();
			if(l.equals("line 1")) System.out.println("Reading the first line from a URI complete!");
			else{
				error = true;
				error832 = true;
				System.out.println("FAILURE! Unable to read the first line from a URI");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Commencing test 23 of 30: Reading all of a URI and putting it into a string");
		try{
			String output = uriReader.readAllLinesAsString();			
			if(output.equals("line 1" + LINE_SEPARATOR + "line 2" + LINE_SEPARATOR + "line 3")) System.out.println("Reading all the file and putting it into a string complete!");
			else{
				error = true;
				error833 = true;
				System.out.println("FAILURE! Unable to read all of a URI and put it into a string!");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Commencing test 24 of 30: Reading a URI until a character turns up");
		try{
			char[] chars = uriReader.readUntilChar('2');			
			if(new String(chars).equals("line 1" + LINE_SEPARATOR + "line ")) System.out.println("Reading a URI until a character turns up complete!");
			else{
				error = true;
				error834 = true;
				System.out.println("FAILURE! Unable to read a URI until a character turns up");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Commencing test 25 of 30: Reading a URI until a string turns up");
		try{
			char[] chars = uriReader.readUntilChars("line 2");			
			if(new String(chars).equals("line 1" + LINE_SEPARATOR))System.out.println("Reading a URI until a string turns up complete!");
			else{
				error = true;
				error835 = true;
				System.out.println("FAILURE! Unable to read a URI until a string turns up");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Commencing test 26 of 30: Reading a URI until a character turns up");
		try{
			String s = uriReader.readUntilString('2');			
			if(s.equals("line 1" + LINE_SEPARATOR + "line ")) System.out.println("Reading a URI until a character turns up complete!");
			else{
				error = true;
				error836 = true;
				System.out.println("FAILURE! Unable to read a URI until a character turns up");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Commencing test 27 of 30: Reading a URI until a string turns up");
		try{
			String s = uriReader.readUntilString("line 2");			
			if(s.equals("line 1" + LINE_SEPARATOR))System.out.println("Reading a URI until a string turns up complete!");
			else{
				error = true;
				error837 = true;
				System.out.println("FAILURE! Unable to read a URI until a string turns up");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Commencing test 28 of 30: Filtering lines with a string in it from a URI");
		try{
			List<String> lines = uriReader.separateLinesByContains("2");			
			if(lines.size() == 2) System.out.println("Filtering lines with a string in it from a URI complete!");
			else{
				error = true;
				error838 = true;
				System.out.println("FAILURE! Unable to filter lines with a string in it from a URI");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Commencing test 29 of 30: Splitting an absolute path into its path and the relative name of the file it is referring to from a URI");
		try{
			BufferedWriter writer = new BufferedWriter(new FileWriter("SeparatorReaderFile.txt"));
			writer.write("C:" + File.separator + "Users" + File.separator + "user" + File.separator + "file.txt");
			writer.close();
			String[] array = uriReader.splitFileNameAndPath();
			if(array[0].equals("C:" + File.separator + "Users" + File.separator + "user" + File.separator) && array[1].equals("file.txt")) System.out.println("Splitting an absolute path into its path and the relative name of the file it is referring to from a URI complete!");
			else{
				error = true;
				error839 = true;
				System.out.println("FAILURE! Unable to split an absolute path into its path and the relative name of the file it is referring to from a URI");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Commencing test 30 of 30: Splitting a string by a string, terminating at a given string from a URI");
		try{
			String[] array = streamReader.splitUntilReached(File.separator, "user");
			if(array.length == 3) System.out.println("Splitting a string by a string, terminating at a given string from a URI complete!");
			else{
				error = true;
				error8310 = true;
				System.out.println("FAILURE! Unable to split a string by a string, terminating at a given string from a URI");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		if(!error){
			System.out.println("No errors");
			return;
		}else{
			if(error11) System.err.println("Error with CharsetReader, unable to read from file");
			if(error12) System.err.println("Error with CharsetReader, unable to read from InputStream");
			if(error13) System.err.println("Error with CharsetReader, unable to read from URI");

			if(error21) System.err.println("Error with ContextReader, unable to read from an InputStream, given a MessagePurpose");
			if(error22) System.err.println("Error with ContextReader, unable to read from a file, given a MessagePurpose");
			if(error23) System.err.println("Error with ContextReader, unable to read from a URI, given a MessagePurpose");
			if(error24) System.err.println("Error with ContextReader, unable to read from an InputStream, given a MessagePurpose and a PurposeFormat");
			if(error25) System.err.println("Error with ContextReader, unable to read from a file, given a MessagePurpose and a PurposeFormat");
			if(error26) System.err.println("Error with ContextReader, unable to read from a URI, given a MessagePurpose and a PurposeFormat");
			if(error27) System.err.println("Error with ContextReader, unable to read from an InputStream, given a MessagePurpose, a PurposeFormat and a ProfanitySource");
			if(error28) System.err.println("Error with ContextReader, unable to read from a file, given a MessagePurpose, a PurposeFormat and a ProfanitySource");
			if(error29) System.err.println("Error with ContextReader, unable to read from a URI, given a MessagePurpose, a PurposeFormat and a ProfanitySource");

			if(error311) System.err.println("Error with FilterReader, unable to get the amount of a character from a File");
			if(error312) System.err.println("Error with FilterReader, unable to get the amount of lines containing a character from a File");
			if(error313) System.err.println("Error with FilterReader, unable to read a File line by line");
			if(error314) System.err.println("Error with FilterReader, unable to return a File's contents line by line, while removing forbidden words");
			if(error315) System.err.println("Error with FilterReader, unable to return a File's contents line by line, while removing forbidden lines");
			if(error316) System.err.println("Error with FilterReader, unable to return a File's contents line by line, while removing a specified character");
			if(error321) System.err.println("Error with FilterReader, unable to get the amount of a character from an InputStream");
			if(error322) System.err.println("Error with FilterReader, unable to get the amount of lines containing a character from am InputStream");
			if(error323) System.err.println("Error with FilterReader, unable to read an InputStream line by line");
			if(error324) System.err.println("Error with FilterReader, unable to return an InputStream's contents line by line, while removing forbidden words");
			if(error325) System.err.println("Error with FilterReader, unable to return an InputStream's contents line by line, while removing forbidden lines");
			if(error326) System.err.println("Error with FilterReader, unable to return an InputStream's contents line by line, while removing a specified character");
			if(error331) System.err.println("Error with FilterReader, unable to get the amount of a character from a URI");
			if(error332) System.err.println("Error with FilterReader, unable to get the amount of lines containing a character from a URI");
			if(error333) System.err.println("Error with FilterReader, unable to read a URI line by line");
			if(error334) System.err.println("Error with FilterReader, unable to return a URI's contents line by line, while removing forbidden words");
			if(error335) System.err.println("Error with FilterReader, unable to return a URI's contents line by line, while removing forbidden lines");
			if(error336) System.err.println("Error with FilterReader, unable to return a URI's contents line by line, while removing a specified character");
			if(error3s1) System.err.println("Error with FilterReader, unable to replace forbidden words in a string with asterisks");
			if(error3s2) System.err.println("Error with FilterReader, unable to remove forbidden words in a string");

			if(error41) System.err.println("Error with MessagePurpose, unable to return some given text");
			if(error42) System.err.println("Error with MessagePurpose, unable to return some text, given a PurposeFormat key");
			if(error43) System.err.println("Error with MessagePurpose, unable to return some text, given a PurposeFormat key and a ProfanitySource");
			if(error44) System.err.println("Error with MessagePurpose, unable to return some text, given a ProfanitySource");
			if(error45) System.err.println("Error with MessagePurpose, unable to return some text, given a PurposeFormat");
			if(error46) System.err.println("Error with MessagePurpose, unable to return some text, given a PurposeFormat and a ProfanitySource");
			if(error4s) System.err.println("Error with MessagePurpose, unable to work out a MessagePurpose from an example string, and boolean to indicate whether to apply the default ProfanitySource or not, and then return a string of formatted text");

			if(error51) System.err.println("Error with ProfanitySource, unable to obtain a default ProfanitySource");
			if(error52) System.err.println("Error with ProfanitySource, unable to obtain a default ProfanitySource, given whether to allow same-sex words or not");
			if(error53) System.err.println("Error with ProfanitySource, unable to obtain a default ProfanitySource, given a file to read the words from");
			if(error54) System.err.println("Error with ProfanitySource, unable to obtain a default ProfanitySource, given a file to read the words from, and a char split");
			if(error55) System.err.println("Error with ProfanitySource, unable to obtain a default ProfanitySource, given a file to read the words from, and a string split");
			if(error56) System.err.println("Error with ProfanitySource, unable to obtain a default ProfanitySource, given an InputStream to read the words from");
			if(error57) System.err.println("Error with ProfanitySource, unable to obtain a default ProfanitySource, given an InputStream to read the words from, and a char split");
			if(error58) System.err.println("Error with ProfanitySource, unable to obtain a default ProfanitySource, given an InputStream to read the words from, and a string split");
			if(error59) System.err.println("Error with ProfanitySource, unable to obtain a default ProfanitySource, given the words");
			if(error510) System.err.println("Error with ProfanitySource, unable to obtain a default ProfanitySource, given a URI to read the words from");
			if(error511) System.err.println("Error with ProfanitySource, unable to obtain a default ProfanitySource, given a URI to read the words from, and a char split");
			if(error512) System.err.println("Error with ProfanitySource, unable to obtain a default ProfanitySource, given a URI to read the words from, and a string split");

			if(error61) System.err.println("Error with Purpose, unable to obtain a Purpose, given some text, and print it");
			if(error62) System.err.println("Error with Purpose, unable to redirect the error stream");
			if(error63) System.err.println("Error with Purpose, unable to redirect the output stream");

			if(error71) System.err.println("Error with PurposeFormat, unable to determine whether a mode contains the date or not");
			if(error72) System.err.println("Error with PurposeFormat, unable to determine whether a mode contains variables or not");
			if(error73) System.err.println("Error with PurposeFormat, unable to determine whether a mode knows it's desired charset");
			if(error74) System.err.println("Error with PurposeFormat, unable to determine whether a mode has formatting or not");

			if(error811) System.err.println("Error with SeparatorReader, unable to read all the lines from a file");
			if(error812) System.err.println("Error with SeparatorReader, unable to read the first line from a file");
			if(error813) System.err.println("Error with SeparatorReader, unable to read all of the file and put it into a string");
			if(error814) System.err.println("Error with SeparatorReader, unable to read a file until a character turns up");
			if(error815) System.err.println("Error with SeparatorReader, unable to read a file until a string turns up");
			if(error816) System.err.println("Error with SeparatorReader, unable to read a file until a character turns up");
			if(error817) System.err.println("Error with SeparatorReader, unable to Read a file until a string turns up");
			if(error818) System.err.println("Error with SeparatorReader, unable to filter lines with a string in it from a file");
			if(error819) System.err.println("Error with SeparatorReader, unable to split an absolute path into its path and the relative name of the file it is referring to from a file");
			if(error8110) System.err.println("Error with SeparatorReader, unable to split a string by a string, terminating at a given string from a file");
			if(error821) System.err.println("Error with SeparatorReader, unable to read all the lines from an InputStream");
			if(error822) System.err.println("Error with SeparatorReader, unable to read the first line from an InputStream");
			if(error823) System.err.println("Error with SeparatorReader, unable to read all of the InputStream and put it into a string");
			if(error824) System.err.println("Error with SeparatorReader, unable to read an InputStream until a character turns up");
			if(error825) System.err.println("Error with SeparatorReader, unable to read an InputStream until a string turns up");
			if(error826) System.err.println("Error with SeparatorReader, unable to read an InputStream until a character turns up");
			if(error827) System.err.println("Error with SeparatorReader, unable to read an InputStream until a string turns up");
			if(error828) System.err.println("Error with SeparatorReader, unable to filter lines with a string in it from an InputStream");
			if(error829) System.err.println("Error with SeparatorReader, unable to split an absolute path into its path and the relative name of the file it is referring to from an InputStream");
			if(error8210) System.err.println("Error with SeparatorReader, unable to split a string by a string, terminating at a given string from an InputStream");
			if(error831) System.err.println("Error with SeparatorReader, unable to read all the lines from a URI");
			if(error832) System.err.println("Error with SeparatorReader, unable to read the first line from a URI");
			if(error833) System.err.println("Error with SeparatorReader, unable to read all of the URI and put it into a string");
			if(error834) System.err.println("Error with SeparatorReader, unable to read a URI until a character turns up");
			if(error835) System.err.println("Error with SeparatorReader, unable to read a URI until a string turns up");
			if(error836) System.err.println("Error with SeparatorReader, unable to read a URI until a character turns up");
			if(error837) System.err.println("Error with SeparatorReader, unable to read a URI until a string turns up");
			if(error838) System.err.println("Error with SeparatorReader, unable to filter lines with a string in it from a URI");
			if(error839) System.err.println("Error with SeparatorReader, unable to split an absolute path into its path and the relative name of the file it is referring to from a URI");
			if(error8310) System.err.println("Error with SeparatorReader, unable to split a string by a string, terminating at a given string from a URI");
		}
	}

	public static JFrame createGUI() {
		JFrame frame = new JFrame();
		JSplitPane pane = new JSplitPane();
		outputArea.setName("output");
		errorArea.setName("error");
		pane.setLeftComponent(outputArea);
		pane.setRightComponent(errorArea);
		frame.add(pane);
		frame.setSize(800, 600);
		frame.setPreferredSize(new Dimension(800, 600));
		frame.pack();
		pane.setDividerLocation(0.5);
		frame.setVisible(true);
		return frame;
	}

	private static File buildFile(){
		File f = new File("SeparatorReaderFile.txt");
		try {
			f.createNewFile();
			BufferedWriter writer = new BufferedWriter(new FileWriter(f));
			writer.write("line 1");
			writer.newLine();
			writer.write("line 2");
			writer.newLine();
			writer.write("line 3");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return f;
	}
	private static void buildProfanities() {
		File commaf = new File("profanities-comma.txt");
		File linesf = new File("profanities.txt");
		try(BufferedWriter commaWriter = new BufferedWriter(new FileWriter(commaf));
				BufferedWriter linesWriter = new BufferedWriter(new FileWriter(linesf))){
			commaWriter.write("shit,fuck,damn,bitch,crap,piss,dick,pussy,ass,fag,bastad,slut,douche,anyádat,malacca,retard");
			linesWriter.write("shit,fuck,damn,bitch,crap,piss,dick,pussy,ass,fag,bastad,slut,douche,anyádat,malacca,retard".replaceAll(",", LINE_SEPARATOR));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

/**
 * A PrintStream that redirects output to a JTextArea.
 */
class TextPrintStream extends PrintStream{

	private JTextArea area;

	/**
	 * Creates a TextPrintStream object.
	 * This automatically connects to the {@link ReadingTester.outputArea}
	 * @param error whehter it is an error stream or not.
	 */
	public TextPrintStream(boolean error) {
		super(obtainPrintStream(error));
		this.area = ReadingTester.outputArea;
	}

	/**
	 * Creates a TextPrintStream object.
	 * @param area the JTextArea to print to.
	 * @param error whehter it is an error stream or not.
	 */
	public TextPrintStream(boolean error, JTextArea area){
		super(obtainPrintStream(error));
		this.area = area;
	}

	private static OutputStream obtainPrintStream(boolean error) {
		return error ? System.err : System.out;
	}

	public void print(double d){
		print(String.valueOf(d));
	}

	public void print(boolean b){
		print(String.valueOf(b));
	}

	public void print(int i){
		print(String.valueOf(i));
	}

	public void print(float f){
		print(String.valueOf(f));
	}

	public void print(short s){
		print(String.valueOf(s));
	}

	public void print(char c){
		print(String.valueOf(c));
	}

	public void println(double d){
		println(String.valueOf(d));
	}

	public void println(boolean b){
		println(String.valueOf(b));
	}

	public void println(int i){
		println(String.valueOf(i));
	}

	public void println(float f){
		println(String.valueOf(f));
	}

	public void println(short s){
		println(String.valueOf(s));
	}

	public void println(char c){
		println(String.valueOf(c));
	}

	public void print(String s){
		area.append(s);
	}

	public void println(String s){
		print(s);
		println();
	}

	public void println(){
		print(ReadingTester.LINE_SEPARATOR);
	}

}
