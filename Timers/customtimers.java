package Timers;

import java.util.Timer;
import java.util.TimerTask;
/**
 * A full set of customisable timers. Tell me if there is one you want that is not here.
 * Also added a 90 second timer as a quick option.
 *
 */
public class customtimers {
	
public customtimers(){
	
}
	
/**
 * Runs a timer for (milliseconds) milliseconds.
 * @param milliseconds amount of milliseconds to run the timer for.
 */
	public void timermilliseconds(int milliseconds){
		Timer timer = new Timer();
		timer.schedule(new TimerTask(){
			@Override
			public void run() {
				System.out.println("Your timer is up!");
			}
		}, milliseconds);
	}
	/**
	 * Runs a timer for (seconds) seconds.
	 * @param seconds amount of seconds to run the timer for.
	 */
	public void timerseconds(int seconds){
		int Timeinterval = seconds * 1000;
		Timer timer = new Timer();
		timer.schedule(new TimerTask(){
			@Override
			public void run() {
				System.out.println("Your timer is up!");
			}
		}, Timeinterval);
	}
	/**
	 * Runs a timer for (minutes) minutes.
	 * @param minutes amount of minutes to run the timer for.
	 */
	public void timerminutes(int minutes){
		int Timeinterval = minutes * 60 * 1000;
		Timer timer = new Timer();
		timer.schedule(new TimerTask(){
			@Override
			public void run() {
				System.out.println("Your timer is up!");
			}
		}, Timeinterval);
	}
	/**
	 * Runs a timer for (hours) hours.
	 * @param hours amount of hours to run the timer for.
	 */
	public void timerhours(int hours){
		int Timeinterval = hours * 60 * 60 * 1000;
		Timer timer = new Timer();
		timer.schedule(new TimerTask(){
			@Override
			public void run() {
				System.out.println("Your timer is up!");
			}
		}, Timeinterval);
	}
	/**
	 * Runs a timer for the specified length.
	 * @param milliseconds the amount of milliseconds to run for.
	 * @param seconds the amount of seconds to run for.
	 * @param minutes the amount of minutes to run for.
	 * @param hours the amount of hours to run for.
	 */
	public void timerallfeatures(int milliseconds, int seconds, int minutes, int hours){
		int Timeinterval = (hours * 60 * 60 * 1000) + (minutes * 60 * 1000) + (seconds * 1000) + milliseconds;
		Timer timer = new Timer();
		timer.schedule(new TimerTask(){
			@Override
			public void run() {
				System.out.println("Your timer is up!");
			}
		}, Timeinterval);
	}
	/**
	 * Runs a timer for 90 seconds.
	 */
	public void ninetysecondtimer(){
			int Timeinterval = 90 * 1000;
			Timer timer = new Timer();
			timer.schedule(new TimerTask(){
				@Override
				public void run() {
					System.out.println("Your timer is up!");
				}
			}, Timeinterval);
	}
	/**
	 * Runs a timer for (milliseconds) milliseconds.
	 * Timer repeats.
	 * @param milliseconds amount of milliseconds to run the timer for.
	 */
	public void timermillisecondsrepeating(int milliseconds){
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask(){
			@Override
			public void run() {
				System.out.println("Your timer is up!");
			}
		}, milliseconds, milliseconds);
	}
	/**
	 * Runs a timer for (seconds) seconds.
	 * Timer repeats.
	 * @param seconds amount of seconds to run the timer for.
	 */
	public void timersecondsrepeating(int seconds){
		int Timeinterval = seconds * 1000;
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask(){
			@Override
			public void run() {
				System.out.println("Your timer is up!");
			}
		}, Timeinterval, Timeinterval);
	}
	/**
	 * Runs a timer for (minutes) minutes.
	 * Timer repeats.
	 * @param minutes amount of minutes to run the timer for.
	 */
	public void timerminutesrepeating(int minutes){
		int Timeinterval = minutes * 60 * 1000;
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask(){
			@Override
			public void run() {
				System.out.println("Your timer is up!");
			}
		}, Timeinterval, Timeinterval);
	}
	/**
	 * Runs a timer for (hours) hours.
	 * Timer repeats.
	 * @param hours amount of hours to run the timer for.
	 */
	public void timerhoursrepeating(int hours){
		int Timeinterval = hours * 60 * 60 * 1000;
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask(){
			@Override
			public void run() {
				System.out.println("Your timer is up!");
			}
		}, Timeinterval, Timeinterval);
	}
	/**
	 * Runs a timer for the specified length.
	 * Timer repeats.
	 * @param milliseconds the amount of milliseconds to run for.
	 * @param seconds the amount of seconds to run for.
	 * @param minutes the amount of minutes to run for.
	 * @param hours the amount of hours to run for.
	 */
	public void timerallfeaturesrepeating(int milliseconds, int seconds, int minutes, int hours){
		int Timeinterval = hours * minutes * seconds * milliseconds;
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask(){
			@Override
			public void run() {
				System.out.println("Your timer is up!");
			}
		}, Timeinterval, Timeinterval);
	}
	/**
	 * Runs a timer for 90 seconds.
	 * Timer repeats.
	 */
	public void ninetysecondtimerrepeating(){
			int Timeinterval = 90 * 1000;
			Timer timer = new Timer();
			timer.scheduleAtFixedRate(new TimerTask(){
				@Override
				public void run() {
					System.out.println("Your timer is up!");
				}
			}, Timeinterval, Timeinterval);
	}
	
}
