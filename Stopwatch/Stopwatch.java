package Stopwatch;

import java.util.Timer;
import java.util.TimerTask;

import PluginReference.MC_Player;

/**
 * This is a stopwatch in my Clock plugin.
 * NOTE: At the moment, this is not deprecated as there is no replacement for this class.
 * However, it will likely be replace with something like a PurposeStopwatch using the TimePurpose class.
 */
public class Stopwatch
{
	public boolean millisecond = false;
	public boolean stoptimer = false;
	public int elapsedseconds = 0;
	public int elapsedmilliseconds = 0;

	/**
	 * Creates a Stopwatch object.
	 */
	public Stopwatch(){}

	/**
	 * Starts the stopwatch without a player parameter
	 * @return TimerTask the associated timer in case you want to cancel it
	 */
	public TimerTask startstopwatch()
	{
		Timer timer = new Timer();
		TimerTask task = new TimerTask(){
			public void run(){
				if (stoptimer)
				{
					System.out.println("The stopwatch finished at: " + Stopwatch.this.elapsedmilliseconds + "milliseconds");
					timer.cancel();
				}else{
					elapsedmilliseconds = elapsedmilliseconds + 1;
				}
			}
		};
		TimerTask task2 = new TimerTask() {
			public void run()  {
				if (stoptimer)
				{
					System.out.println("The stopwatch finished at: " + Stopwatch.this.elapsedseconds + "seconds");
					timer.cancel();
				}else{
					elapsedseconds = elapsedseconds + 1;
				}
			}
		};
		if (millisecond)
		{
			timer.scheduleAtFixedRate(task, 1, 1);
			return task;
		}
		timer.scheduleAtFixedRate(task2, 1000, 1000);
		return task2;
	}
	/**
	 * Starts a stopwatch with a player variable
	 * @param plr the player who started the timer (or for other uses)
	 * @return TimerTask the associated timer
	 */
	public TimerTask startstopwatchplr(MC_Player plr)
	{
		final Timer timer = new Timer();
		TimerTask task = new TimerTask()
		{
			public void run()
			{
				if (stoptimer)
				{
					System.out.println("The stopwatch finished at: " + Stopwatch.this.elapsedmilliseconds + "milliseconds");
					timer.cancel();
				}
			}
		};
		TimerTask task2 = new TimerTask()
		{
			public void run()
			{
				if (stoptimer)
				{
					plr.sendMessage("The stopwatch finished at: " + Stopwatch.this.elapsedseconds + "seconds");
					timer.cancel();
				}
			}
		};
		if (millisecond)
		{
			timer.scheduleAtFixedRate(task, 1L, 1L);
			return task;
		}
		timer.scheduleAtFixedRate(task2, 1000L, 1000L);
		return task2;
	}
	/**
	 * Stops the stowpatch
	 */
	public void stopstopwatch()
	{
		System.out.println("Stopping timer!");
		stoptimer = true;
	}
	/**
	 * Stops the stopwatch
	 * @param plr The player to notify that the timer has stopped.
	 */
	public void stopstopwatchplr(MC_Player plr)
	{
		plr.sendMessage("Stopping timer!");
		stoptimer = true;
	}
}
