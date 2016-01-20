package TestSharedPackages;

import java.io.Console;
import java.io.File;
import java.util.Random;
import java.util.TimerTask;

import Readandwrite.BufferedReaderTest;
import Readandwrite.BufferedWriterTest;
import Readandwrite.Filesfiletest;
import Readandwrite.RandomAccessFileTest;
import Stopwatch.Stopwatch;
import Timers.customtimers;
import Timers.filetimer;
/**
 * Tests all the methods in shared packages. Useful for troubleshooting.
 *
 */
public class tester {

	public static TimerTask task;

	public static void main(String[] args)
    {
		BufferedReaderTest brtest = new BufferedReaderTest();
		BufferedWriterTest bwtest = new BufferedWriterTest();
		customtimers ctimers = new customtimers();
		filetimer ft = new filetimer();
		Stopwatch sw = new Stopwatch();
		Filesfiletest ff = new Filesfiletest();
		RandomAccessFileTest raf = new RandomAccessFileTest();
        Console console = System.console();
        if (console == null) 
        {
            System.err.println("No console.");
            System.exit(1);
        }
         
        boolean keepRunning = true;
        while (keepRunning)
        {       
        	File file = new File("Seasonsliketest.txt");
        	File file2 = new File("Inttest.txt");
        	String intline = "1";
        	String line = "hello";
            String name =  console.readLine("Type your command, or 'exit' to quit: ");
            if ("exit".equals(name))
            {
                keepRunning = false;
            }
        	
        	// CUSTOMTIMERS CLASS \\
        	else if("90sec".equals(name)){
        		ctimers.ninetysecondtimer();
        	}
        	else if("90secrep".equals(name)){
        		ctimers.ninetysecondtimerrepeating();
        	}
        	else if("fullcustom".equals(name)){
        		ctimers.timerallfeatures(0, 0, 2, 0);
        	}
        	else if("fullcustomrep".equals(name)){
        		ctimers.timerallfeaturesrepeating(0, 0, 2, 0);
        	}
        	// You don't have to test the hour ones
        	else if("hour".equals(name)){
        		ctimers.timerhours(1);
        	}
        	else if("hourrep".equals(name)){
        		ctimers.timerhoursrepeating(1);
        	}
        	//Go back to MUST TEST mode.
        	else if("millisec".equals(name)){
        		ctimers.timermilliseconds(250);
        	}
        	else if("millisecrep".equals(name)){
        		ctimers.timermillisecondsrepeating(250);
        	}
        	else if("minute".equals(name)){
        		ctimers.timerminutes(5);
        	}
        	else if("minuterep".equals(name)){
        		ctimers.timerminutesrepeating(3);
        	}
        	else if("second".equals(name)){
        		ctimers.timerseconds(20);
        	}
        	else if("secondrep".equals(name)){
        		ctimers.timersecondsrepeating(20);
        	}
        	// FILETIMER CLASS \\
        	else if("filecheck".equals(name)){
        		ft.starttimer(file);
        	}
            // STOPWATCHCLASS \\ //TODO version 0.3 here!
        	else if ("startstopwatch".equals(name)){
        		Stopwatch.millisecond = false;
        		Stopwatch.stoptimer = false;
        		sw.startstopwatch();
        	}else if ("stopstopwatch".equals(name)){
        		sw.stopstopwatch();
        	}
        	// BUFFEREDREADERTEST CLASS \\
        	else if("fileintread".equals(name)){
        		brtest.getIntergerinSingleLineFile(file2);
        	}
        	else if("file1linelength".equals(name)){
        		brtest.getLengthofSingleLineFile(file);
        	}
        	else if("file1lineread".equals(name)){
        		brtest.readSingleLineFile(file2);
        	}
        	// BUFFEREDWRITERTEST CLASS \\
        	else if("writeintbw".equals(name)){
        		bwtest.writeToFile(intline, false, file2);
        	}
        	else if("writestringbw".equals(name)){
        		bwtest.writeToFile(line, true, file);
        	}
            // FILESFILETEST CLASS \\ 
        	else if("integerset".equals(name)){
        		int integers = ff.getIntegersinMultipleLineFile(file);
        		System.out.println(integers);
        	}else if("length".equals(name)){
        		bwtest.writeToFile("true", false, file2);
        		long length = ff.getLengthofMultipleLineFile(file2);
        		System.out.println(length);
        	}else if ("returnstring".equals(name)){
        		String l = ff.readMultipleLineFile(file2);
        		System.out.println(l);
        	}
            // RANDOMACCESSFILETEST CLASS \\
        	else if("readboolean".equals(name)){
        		boolean bl = raf.readBooleanInFile(file2);
        		System.out.println(bl);
        	}else if("writeboolean".equals(name)){
        		raf.writeBoolean(file2, false);
        	}else if("readbyte".equals(name)){
        		byte bytes = raf.readByteInFile(file2);
        		System.out.println(bytes);
        	}else if("writebyte".equals(name)){
        		byte[] bytes = new byte[10];
        		raf.writeByteArray(file2, bytes);
        	}else if("readdouble".equals(name)){
        		double bd = raf.readDoubleInFile(file2);
        		System.out.println(bd);
        	}else if("writedouble".equals(name)){
        		raf.writeDouble(file2, 100000, false);
        	}else if("writefloat".equals(name)){
        		float f = 7;
        		raf.writeFloat(file2, f, false);
        	}else if ("filelength".equals(name)){
        		long length = raf.getLengthOfFile(file2);
        		System.out.println(length);
        	}else if ("readint".equals(name)){
        		int i = raf.readIntegerInFile(file2);
        		System.out.println(i);
        	}else if("writeint".equals(name)){
        		raf.writeInt(file2, 5);
        	}else if("readlong".equals(name)){
        		long l = raf.readLongInFile(file2);
        		System.out.println(l);
        	}else if("writelong".equals(name)){
        		raf.writeLong(file2, 3L);
        	}else if("readshort".equals(name)){
        		short s = raf.readShortInFile(file2);
        		System.out.println(s);
        	}else if("writeshort".equals(name)){
        		short s = 9;
        		raf.writeShort(file2, s);
        	}else if("readstringsingle".equals(name)){
        		String fc = raf.readStringInFile(file2);
        		System.out.println(fc);
        	}else if("writestring".equals(name)){
        		raf.writeString(file2, "brand new!");
        	}
        	else if("random".equals(name)){
        		int random = new Random().nextInt(100000000);
        		System.out.println(random);
        	}
        	else{
                System.out.println("That is not a command.");
            }
        }
    }	
	
}
