package Timers;

import java.util.Timer;
import java.util.TimerTask;

import PluginReference.*;
/**
* This is used as a separate class in my Clock plugin.
*/
public class Timerclass {
	
public Timerclass(){
	
}

	public static MC_Server server = null;
	/**
	 * This is the timer called by Clock v1.0+ when the console enters the timerminute command
	 * To use in your plugin, you can call onConsoleInput, register your command as normal then type:
	 * 
	 * Timerclass.minutetimer(server);
	 * 
	 * Assuming you have added "Shared_packages.Timers.*" as an import  
	 * 
	 * @param server MC_Server (the server that entered the command)
	 */
	public void minutetimer(MC_Server server) {
		Timer timer = new Timer();
		int timeinterval = 1*60 * 1000;
		timer.schedule(new TimerTask() {
		  @Override
		  public void run() {
System.out.println("your timer is up!"); }
		}, timeinterval);
	}
	/**
	 * This is the timer called by Clock v1.0+ when the console enters the timerhalfhour command
	 * To use in your plugin, you can call onConsoleInput, register your command as normal then type:
	 * 
	 * Timerclass.halfhourtimer(server);
	 * 
	 * Assuming you have added "Shared_packages.Timers.*" as an import  
	 * 
	 * @param server MC_Server (the server that entered the command)
	 */
	public void halfhourtimer(MC_Server server){
		Timer timer = new Timer();
		int timeinterval = 30*60 * 1000;
		timer.schedule(new TimerTask() {
		  @Override
		  public void run() {
System.out.println("your timer is up!"); }
		}, timeinterval);
	}
	/**
	 * This is the timer called by Clock v1.0+ when the console enters the timerhour command
	 * To use in your plugin, you can call onConsoleInput, register your command as normal then type:
	 * 
	 * Timerclass.hourtimer(server);
	 * 
	 * Assuming you have added "Shared_packages.Timers.*" as an import  
	 * 
	 * @param server MC_Server (the server that entered the command)
	 */
	public void hourtimer(MC_Server server){
		Timer timer = new Timer();
		int timeinterval = 1*60*60 * 1000;
		timer.schedule(new TimerTask() {
		  @Override
		  public void run() {
System.out.println("your timer is up!"); }
		}, timeinterval);
	}
	/**
	 * This is the timer called by Clock v1.0+ when a player enters the /timerhalfhour command
	 * To use in your plugin, you can call onPlayerInput, register your command as normal then type:
	 * 
	 * Timerclass.halfhourtimer(plr);
	 * 
	 * Assuming you have added "Shared_packages.Timers.*" as an import  
	 * 
	 * @param plr MC_Player (the player that entered the command)
	 */
	public void halfhourtimer(MC_Player plr) {
		Timer timer = new Timer();
		int timeinterval = 30*60 * 1000;
		timer.schedule(new TimerTask() {
		  @Override
		  public void run() {
			  plr.sendMessage("Your timer is up!");
		  }
		}, timeinterval);
}
	/**
	 * This is the timer called by Clock v1.0+ when a player enters the /timerhour command
	 * To use in your plugin, you can call onPlayerInput, register your command as normal then type:
	 * 
	 * Timerclass.hourtimer(plr);
	 * 
	 * Assuming you have added "Shared_packages.Timers.*" as an import  
	 * 
	 * @param plr (the player that entered the command)
	 */
	public void hourtimer(MC_Player plr) {
		Timer timer = new Timer();
		int timeinterval = 1*60*60 * 1000;
		timer.schedule(new TimerTask() {
		  @Override
		  public void run() {
	plr.sendMessage("Your timer is up!");
		  }
}, timeinterval);
		}
	/**
	 * This is the timer called by Clock v1.0+ when a player enters the /timerminute command
	 * To use in your plugin, you can call onPlayerInput, register your command as normal then type:
	 * 
	 * Timerclass.minutetimer(plr);
	 * 
	 * Assuming you have added "Shared_packages.Timers.*" as an import  
	 *
	 * @param plr (the player that entered the command)
	 */
	public void minutetimer(MC_Player plr) {
		Timer timer = new Timer();
		int timeinterval = 1*60 * 1000;
		timer.schedule(new TimerTask() {
		  @Override
		  public void run() {
plr.sendMessage("Your timer is up!"); }
		}, timeinterval);
		}
}

