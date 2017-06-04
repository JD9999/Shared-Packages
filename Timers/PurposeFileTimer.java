package Timers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.util.Timer;
import java.util.TimerTask;

/**
 * A class very similar to the {@link filetimer} class.
 * The only difference is that it executes a TimePurpose, giving it more use cases.
 * There is also more functionality installed in the class, such as stopping the timer.
 * This class also supports having multiple timers.
 * This also implements part of the policy of the four readers implemented in V1.0+
 * by having options to read from a File, an InputStream, or a URI.

 */
public class PurposeFileTimer {

	private BufferedReader inStream;
	private Timer timer;
	private TimePurpose timePurpose;

	/**
	 * Creates a PurposeFileTimer object.
	 * @param purpose what to do when the timer goes off
	 * @param f the file to read the time from. See {@link #startTimer()} for formatting.
	 * @throws FileNotFoundException If the file is not found.
	 */
	public PurposeFileTimer(TimePurpose purpose, File f) throws FileNotFoundException{
		inStream = new BufferedReader(new FileReader(f));
		timer = new Timer();
		timePurpose = purpose;
	}

	/**
	 * Creates a PurposeFileTimer object.
	 * @param purpose what to do when the timer goes off
	 * @param stream the InputStream to read the time from. See {@link #startTimer()} for formatting.
	 */
	public PurposeFileTimer(TimePurpose purpose, InputStream stream){
		inStream = new BufferedReader(new InputStreamReader(stream));
		timer = new Timer();
		timePurpose = purpose;
	}
	
	/**
	 * Creates PurposeFileTimer object.
	 * @param purpose what to do when the timer goes off
	 * @param uri the URI to read the time from. See {@link #startTimer()} for formatting.
	 * @throws MalformedURLException If there is an error converting the URI to a URL
	 * @throws IOException if there is an error creating the InputStream from the URL.
	 */
	public PurposeFileTimer(TimePurpose purpose, URI uri) throws MalformedURLException, IOException{
		inStream = new BufferedReader(new InputStreamReader(uri.toURL().openStream()));
		timer = new Timer();
		timePurpose = purpose;
	}

	/**
	 * Starts the timer.
	 * The time formatting is [number][type]
	 * [number] specifies how many of the specified type of time period.
	 * [type] the interval at which one value passes. 
	 * Can be "s" (seconds), "m" (minutes), "h" (hours), "w" (weeks)
	 * @throws IOException if there is an error reading the time
	 * @throws TimerException if it does not match the pattern above.
	 */
	public void startTimer() throws IOException, TimerException{
		int milliseconds = determineTime();
		TimerTask task = task();
		timer.schedule(task, milliseconds);
	}

	/**
	 * Starts the timer.
	 * Once one execution is complete, it will start the countdown again.
	 * The time formatting is [number][type]
	 * [number] specifies how many of the specified type of time period.
	 * [type] the interval at which one value passes. 
	 * Can be "s" (seconds), "m" (minutes), "h" (hours), "w" (weeks)
	 * @param catchup whether to catch up if an execution is missed or not.
	 * @throws IOException if there is an error reading the time
	 * @throws TimerException if it does not match the pattern above.
	 */
	public void startRepeatingTimer(boolean catchup) throws IOException, TimerException{
		int milliseconds = determineTime();
		TimerTask task = task();
		if(catchup) timer.scheduleAtFixedRate(task, milliseconds, milliseconds);
		else timer.schedule(task, milliseconds, milliseconds);	
	}

	/**
	 * Stops all the timers. 
	 */
	public void stopTasks(){
		timer.purge();
	}

	private TimerTask task() {
		return new TimerTask(){

			@Override
			public void run() {
				timePurpose.execute();				
			}

		};
	}

	private int determineTime() throws IOException, TimerException {
		int totalTime = 0;
		String timeString = inStream.readLine();
		if(timeString.length() < 2) throw new TimerException("must follow pattern: <number><unit>");
		else{
			String[] sets = timeString.trim().split(";");
			for(int i = 0; i < sets.length; i++){
				String unit = sets[i];
				int number;
				if(unit.endsWith("d")){
					number = Integer.parseInt(unit.substring(0, unit.length() -1));
					totalTime = totalTime + number * 24 * 60 * 60 * 1000;
				}else if(unit.endsWith("h")){
					number = Integer.parseInt(unit.substring(0, unit.length() -1));
					totalTime = totalTime + number * 60 * 60 * 1000;
				}else if(unit.endsWith("m")){
					number = Integer.parseInt(unit.substring(0, unit.length() -1));
					totalTime = totalTime + number * 60 * 1000;
				}else if(unit.endsWith("s")){
					number = Integer.parseInt(unit.substring(0, unit.length() -1));
					totalTime = totalTime + number * 1000;
				}else throw new TimerException("Does not end in a variable!");
			}
			return totalTime;
		}
	}

}
