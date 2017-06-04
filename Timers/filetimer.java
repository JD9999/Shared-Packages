package Timers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
/**
 * Uses a filetimer like seasons, but not directly copied from it, rather modified for customisation.
 * This method may be slow at the moment. Update 1.0 aimed to introduce features that didn't exist. 
 * Update 1.0 also aimed to improve performance, and in that update the code was optimized.
 * This is likely to be removed in V1.1 due to limited use cases.
 * @deprecated Use PurposeFileTimer
 */
public class filetimer {

	/**
	 * The amount of times the timer has been executed.
	 */
	public int count = 0;
	
	/**
	 * Whether to keep the timer on or not. By setting it to false, the timer will stop executing.
	 */
	public boolean keeprunning = true;

	/**
	 * The only reason this method even exists is because I would have to remove it 200 times!
	 * That would be a pain.
	 * @param file the file being written to.
	 */
	public void switchseason(File file) {
		System.out.println("File timer read!");
		count++;
	}	

	private File file;
	
	/**
	 * Creates a filetimer object.
	 * @param f the file to read the time from.
	 */
	public filetimer(File f){
		file = f;
		keeprunning = true;
	}
	/**
	 * This method starts a timer by reading (file) file and checks it's contents. Like Seasons
	 */
	public void starttimer(){
		System.out.println("Starting timer!");
		BufferedReader reader = null;
		String timera;
		int timeInterval = 0;
		try{
			reader = new BufferedReader(new FileReader(file));
			while((timera = reader.readLine())!=null){
				if(timera.endsWith("d")){
					Integer amount = Integer.parseInt(timera.substring(0, timera.length() - 1));
					timeInterval = amount * 24 * 60 * 60 * 1000;
				}
				else if(timera.endsWith("h")){
					Integer amount = Integer.parseInt(timera.substring(0, timera.length() - 1));
					timeInterval = amount * 60 * 60 * 1000;
				}
				else if(timera.endsWith("m")){
					Integer amount = Integer.parseInt(timera.substring(0, timera.length() - 1));
					timeInterval = amount * 60 * 1000;
				}
				else if(timera.endsWith("s")){
					Integer amount = Integer.parseInt(timera.substring(0, timera.length() - 1));
					timeInterval = amount * 1000;
				}else{
					System.err.println("There is a problem with the timer file! Make sure what ever is in there can be read!");
					System.err.println("Putting on a two-hour timer.");
					timeInterval = 2*60*60*1000;
				}
				Timer timer = new Timer();
				timer.scheduleAtFixedRate(new TimerTask() {
					@Override
					public void run() {
						if(keeprunning){
							switchseason(file);
						}else{
							timer.cancel();
						}
					}						
				} , timeInterval, timeInterval);
				return;
			}

		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				reader.close();
			}catch (IOException e){
				e.printStackTrace();
			}
		}
	}

}
