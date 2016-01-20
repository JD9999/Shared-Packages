package Date;

import java.util.Date;

import PluginReference.*;
/**
 * This class uses a very simple time mechanism to return the time.
 *
 */
public class SimpleDate {

public SimpleDate(){
	
}
	
public static MC_Server server = null;	
	
	public void PlayerDate(MC_Player plr){
		Date date = new Date();
		plr.sendMessage(date.toString());
	}
	public void BroadcastDate(){
		Date date = new Date();
		server.broadcastMessage(date.toString());
	}
	public void PrintDate(){
		Date date = new Date();
		System.out.println(date.toString());
	}
}

