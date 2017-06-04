package TestSharedPackages;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import Timers.PurposeFileTimer;
import Timers.TimerException;
import Timers.TimePurpose;
import Timers.filetimer;

/**
 * The built-in tester for testing what can be tested of the Timers package.
 */
public class TimersTester {

	public static boolean error = false;
	public static boolean error11 = false;
	public static boolean error12 = false;
	public static boolean error21 = false;

	private static boolean wait = true;

	public static void main(String[] args) {
		System.out.println("Timers are difficult to test (as are stopwatches and dates), and so only limited testing can be performed.");
		System.out.println("Testing class 1 of 2: filetimer");
		Timer timer = new Timer();

		System.out.println("Commencing test 1 of 2: Reading the time off a file");
		filetimer fileTimer = new filetimer(buildFile(6));
		fileTimer.starttimer();
		TimerTask task = getTimerTask(fileTimer, 11);
		timer.schedule(task, 12500);
		while(wait){
			Entry.addOutput("");
		}
		fileTimer.keeprunning = false;
		wait = true;
		System.out.println("Commencing test 2 of 2: Stopping the timer halfway");
		fileTimer = new filetimer(buildFile(10));
		fileTimer.starttimer();
		task = getTimerTask(fileTimer, 12);
		timer.schedule(task, 5000);
		task = getStopTimerTask(fileTimer);
		timer.schedule(task, 21000);
		task = getTimerTask(fileTimer);
		timer.schedule(task, 25000);
		while(wait){
			Entry.addOutput("");
		}		
		wait = true;
		fileTimer.keeprunning = false;
		System.out.println("Testing class 2 of 2: PurposeFileTimers");
		buildFile(5);
		timer.purge();
		try {
			PurposeFileTimer pft = new PurposeFileTimer(getPurpose(), Entry.file1);
			System.out.println("Commencing test 1 of 1: Reading the time from a file and delegating to a purpose");
			pft.startTimer();
			timer.schedule(getTimerTask(pft), 5500);
			while(wait){
				Entry.addOutput("");
			}
			pft.stopTasks();
		} catch (IOException | TimerException e) {
			e.printStackTrace();
		}
		
		if(!error) System.out.println("No errors!");
		else{
			if(error11) System.err.println("Error with filetimer, reading the time off a file");
			if(error12) System.err.println("Error with filetimer, stopping the timer halfway");
			
			if(error21) System.err.println("Error with PurposeFileTimers, reading the time from a file and delegating to a purpose");
		}
	}

	private static TimePurpose getPurpose() {
		return new TimePurpose(){

			@Override
			public void execute() {
				System.out.println("Reading the time from a file and delegating to a purpose complete!");
				wait = false;
			}
			
		};
	}
	
	private static TimerTask getStopTimerTask(filetimer fileTimer) {
		return new TimerTask(){
			
			public void run(){
				fileTimer.keeprunning = false;
			}
			
		};
	}

	private static TimerTask getTimerTask(PurposeFileTimer timer){
		return new TimerTask(){
			
			public void run(){
				if(wait){
					error = true;
					error21 = true;
					System.out.println("FAILURE! Unable to read the time from a file and delegating to a purpose");
					wait = false;
				}
				
			}
			
		};
	}

	private static TimerTask getTimerTask(filetimer fileTimer) {
		return new TimerTask(){

			public void run(){
				if(fileTimer.count == 2) System.out.println("Stopping the timer halfway complete!");
				else{
					error = true;
					error12 = true;
					System.out.println("FAILURE! Unable to stop the timer halfway!");
				}
				wait = false;
			}

		};
	}

	private static TimerTask getTimerTask(filetimer fileTimer, int errorCode) {
		return new TimerTask(){

			@Override
			public void run() {
				if(errorCode == 11){
					if(fileTimer.count == 2) System.out.println("Reading the time off a file complete!");
					else{
						error = true;
						error11 = true;
						System.out.println("FAILURE! Unable to read the time off a file!");	
					}
					wait = false;
				}else if(errorCode == 12){
					System.out.println("Executed!");
				}else{
					System.err.println("Incorrect error code!");
				}
			}

		};
	}

	private static File buildFile(int time) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(Entry.file1))){
			writer.write(time + "s");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return Entry.file1;
	}

}
