package Date;

import java.util.Date;

import PluginReference.*;
/**
 * This class uses a very simple time mechanism to return the time.
 * In V1.0, unlike the other classes, this class will remain as it is.
 * A lot of these methods will be removed in V1.1 and have therefore been deprecated.
 * This is so I can remove PluginReference from the libraries.
 */
public class SimpleDate {

	/**
	 * Creates a SimpleDate object.
	 */
	public SimpleDate(){

	}

	/**
	 * The variable used to store the server. If you are planning on using a Broadcast method, you will need to set this variable.
	 */
	public MC_Server server = null;	

	/**
	 * @deprecated Will be removed in V1.1. Use MC_Player.sendMessage(SimpleDate.TextDate()); to do the same thing
	 * @param plr the player to send the message to
	 */
	public void PlayerDate(MC_Player plr){
		Date date = new Date();
		plr.sendMessage(date.toString());
	}
	
	/**
	 * @deprecated Will be removed in V1.1. Use MC_Server.broadcastMessage(SimpleDate.TextDate()); to do the same thing
	 * Remember to set the public variable "server" so this does not throw a NullPointerException!
	 */
	public void BroadcastDate(){
		Date date = new Date();
		server.broadcastMessage(date.toString());
	}
	
	/**
	 * @deprecated Will be removed in V1.1. Use System.out.println(SimpleDate.TextDate()); to do the same thing
	 */
	public void PrintDate(){
		Date date = new Date();
		System.out.println(date.toString());
	}

	public String TextDate(){
		Date date = new Date();
		return date.toString();
	}

	/**
	 * @deprecated Will be removed in V1.1. Use MC_Player.sendMessage(SimpleDate.TextDateOnly()); to do the same thing
	 * @param plr the player to send the message to
	 */
	public void PlayerDateOnly(MC_Player plr){
		Date date = new Date();
		plr.sendMessage(date.toString().substring(0, date.toString().lastIndexOf("/") + 4));
	}

	/**
	 * @deprecated Will be removed in V1.1. Use MC_Server.broadcastMessage(SimpleDate.TextDateOnly()); to do the same thing
	 */
	public void BroadcaseDateOnly(){
		Date date = new Date();
		server.broadcastMessage(date.toString().substring(0, date.toString().lastIndexOf("/") + 4));
	}

	/**
	 * @deprecated Will be removed in V1.1. Use System.out.println(SimpleDate.TextDateOnly()); to do the same thing
	 */
	public void PrintDateOnly(){
		Date date = new Date();
		System.out.println(date.toString().substring(0, date.toString().lastIndexOf("/") + 4));
	}

	public String textDateOnly() {
		Date date = new Date();
		return date.toString().substring(0, date.toString().lastIndexOf("/") + 4);
	}
}

