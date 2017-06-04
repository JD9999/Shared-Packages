package Date;

import java.util.Date;
import PluginReference.*;
/**
 * This class, while using deprecated methods, uses a Date class instead of a Calendar. It is easier to use.
 * However, if you want to use non-deprecated methods, go to the NonDeprecatedAdvancedDate.class in the same package.
 * 
 * NOTE: The methods in the classes that do the work for you (like IntDate(MC_Player)) will be removed next update.
 * The other of the two methods will return a String instead of printing it to the console.
 */
public class AdvancedDate {

	/**
	 * Creates an AdvancedDate object.
	 */
	public AdvancedDate(){

	}

	/**
	 * This method uses decrepated methods, though they are all returned as integers
	 * This cannot be used for a player
	 */
	public void IntDate(){ 
		Date date = new Date();
		System.out.println(date.getDay() + "/" + date.getMonth() + "/" + (1900 + date.getYear()) + ", " + date.getHours() + ":"+ date.getMinutes() + ":" + date.getSeconds());
	}
	/**
	 * @deprecated in V1.1, IntDate() will return a string, and this method will be removed. Use MC_Player.sendMessage(AdvancedDate.IntDate()) to do the same thing.
	 * This method uses decrepated methods, though they are all returned as integers.
	 * This method can be used for a player.
	 * @param plr MC_Player the player you send the date to.
	 */
	public void IntDate(MC_Player plr){ 
		Date date = new Date();
		plr.sendMessage(date.getDay() + "/" + date.getMonth() + "/" + (1900 + date.getYear()) + ", " + date.getHours() + ":"+ date.getMinutes() + ":" + date.getSeconds());
	}
	/**
	 * This method is similar the the Date method in SimpleDate, but it returns the month like "January" rather than "Jan" and the day like "Monday" rather than "Mon"
	 * This method also uses decrepated methods, but it is much simpler to use then the java.util.Calendar class.
	 * This method cannot be used for a player
	 */
	public void FullwordDate(){
		String fullmonth;
		String fullday;
		Date date = new Date();
		int monthint = date.getMonth();
		int dayint = date.getDay();
		if(monthint == 0){
			fullmonth = "January";
			if(dayint == 0){
				fullday	= "Sunday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 1){
				fullday = "Monday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 2){
				fullday = "Tuesday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 3){
				fullday = "Wednesday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 4){
				fullday = "Thursday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 5){
				fullday = "Friday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 6){
				fullday = "Saturday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if(monthint == 1){
			fullmonth = "February";
			if(dayint == 0){
				fullday	= "Sunday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 1){
				fullday = "Monday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 2){
				fullday = "Tuesday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 3){
				fullday = "Wednesday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 4){
				fullday = "Thursday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 5){
				fullday = "Friday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 6){
				fullday = "Saturday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if (monthint == 2){
			fullmonth = "March";
			if(dayint == 0){
				fullday	= "Sunday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 1){
				fullday = "Monday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 2){
				fullday = "Tuesday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 3){
				fullday = "Wednesday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 4){
				fullday = "Thursday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 5){
				fullday = "Friday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 6){
				fullday = "Saturday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if (monthint == 3){
			fullmonth = "April";
			if(dayint == 0){
				fullday	= "Sunday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 1){
				fullday = "Monday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 2){
				fullday = "Tuesday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 3){
				fullday = "Wednesday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 4){
				fullday = "Thursday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 5){
				fullday = "Friday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 6){
				fullday = "Saturday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if (monthint == 4){
			fullmonth = "May";
			if(dayint == 0){
				fullday	= "Sunday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 1){
				fullday = "Monday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 2){
				fullday = "Tuesday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 3){
				fullday = "Wednesday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 4){
				fullday = "Thursday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 5){
				fullday = "Friday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 6){
				fullday = "Saturday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if (monthint == 5){
			fullmonth = "June";
			if(dayint == 0){
				fullday	= "Sunday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 1){
				fullday = "Monday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 2){
				fullday = "Tuesday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 3){
				fullday = "Wednesday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 4){
				fullday = "Thursday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 5){
				fullday = "Friday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 6){
				fullday = "Saturday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if (monthint == 6){
			fullmonth = "July";
			if(dayint == 0){
				fullday	= "Sunday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 1){
				fullday = "Monday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 2){
				fullday = "Tuesday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 3){
				fullday = "Wednesday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 4){
				fullday = "Thursday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 5){
				fullday = "Friday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 6){
				fullday = "Saturday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if (monthint == 7){
			fullmonth = "August";
			if(dayint == 0){
				fullday	= "Sunday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 1){
				fullday = "Monday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 2){
				fullday = "Tuesday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 3){
				fullday = "Wednesday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 4){
				fullday = "Thursday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 5){
				fullday = "Friday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 6){
				fullday = "Saturday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if (monthint == 8){
			fullmonth = "Spetember";
			if(dayint == 0){
				fullday	= "Sunday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 1){
				fullday = "Monday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 2){
				fullday = "Tuesday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 3){
				fullday = "Wednesday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 4){
				fullday = "Thursday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 5){
				fullday = "Friday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 6){
				fullday = "Saturday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if (monthint == 9){
			fullmonth = "October";
			if(dayint == 0){
				fullday	= "Sunday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 1){
				fullday = "Monday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 2){
				fullday = "Tuesday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 3){
				fullday = "Wednesday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 4){
				fullday = "Thursday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 5){
				fullday = "Friday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 6){
				fullday = "Saturday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if (monthint == 10){
			fullmonth = "November";
			if(dayint == 0){
				fullday	= "Sunday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 1){
				fullday = "Monday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 2){
				fullday = "Tuesday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 3){
				fullday = "Wednesday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 4){
				fullday = "Thursday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 5){
				fullday = "Friday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 6){
				fullday = "Saturday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if (monthint == 11){
			fullmonth = "December";
			if(dayint == 0){
				fullday	= "Sunday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 1){
				fullday = "Monday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 2){
				fullday = "Tuesday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 3){
				fullday = "Wednesday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 4){
				fullday = "Thursday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 5){
				fullday = "Friday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else if (dayint == 6){
				fullday = "Saturday";
				System.out.println(fullday +" " + date.getDay() + " of " + fullmonth + date.getYear() + ", " + date.getHours() + " "+ date.getMinutes() + " " + date.getSeconds());
			}else{
				System.err.println("Unable to detect day!");
			}
		}else{
			System.err.println("Unable to detect month!");
		}
	}
	/**
	 * @deprecated in V1.1, FullwordDate() will return a string, and this method will be removed. Use MC_Player.sendMessage(AdvancedDate.FullwordDate()) to do the same thing.
	 * This method is similar the the Date method in SimpleDate, but it returns the month like "January" rather than "Jan" and the day like "Monday" rather than "Mon"
	 * This method also uses decrepated methods, but it is much simpler to use then the java.util.Calendar class.
	 * This method, however, can be used for a player
	 * @param plr The player (MC_Player)
	 */
	public void FullwordDate(MC_Player plr){
		String fullmonth;
		String fullday;
		Date Date = new Date();
		int monthint = Date.getMonth();
		int dayint = Date.getDay();
		if(monthint == 0){
			fullmonth = "January";
			if(dayint == 0){
				fullday	= "Sunday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 1){
				fullday = "Monday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 2){
				fullday = "Tuesday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 3){
				fullday = "Wednesday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 4){
				fullday = "Thursday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 5){
				fullday = "Friday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 6){
				fullday = "Saturday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if(monthint == 1){
			fullmonth = "February";
			if(dayint == 0){
				fullday	= "Sunday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 1){
				fullday = "Monday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 2){
				fullday = "Tuesday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 3){
				fullday = "Wednesday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 4){
				fullday = "Thursday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 5){
				fullday = "Friday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 6){
				fullday = "Saturday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if (monthint == 2){
			fullmonth = "March";
			if(dayint == 0){
				fullday	= "Sunday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 1){
				fullday = "Monday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 2){
				fullday = "Tuesday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 3){
				fullday = "Wednesday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 4){
				fullday = "Thursday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 5){
				fullday = "Friday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 6){
				fullday = "Saturday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if (monthint == 3){
			fullmonth = "April";
			if(dayint == 0){
				fullday	= "Sunday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 1){
				fullday = "Monday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 2){
				fullday = "Tuesday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 3){
				fullday = "Wednesday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 4){
				fullday = "Thursday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 5){
				fullday = "Friday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 6){
				fullday = "Saturday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if (monthint == 4){
			fullmonth = "May";
			if(dayint == 0){
				fullday	= "Sunday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 1){
				fullday = "Monday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 2){
				fullday = "Tuesday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 3){
				fullday = "Wednesday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 4){
				fullday = "Thursday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 5){
				fullday = "Friday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 6){
				fullday = "Saturday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if (monthint == 5){
			fullmonth = "June";
			if(dayint == 0){
				fullday	= "Sunday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 1){
				fullday = "Monday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 2){
				fullday = "Tuesday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 3){
				fullday = "Wednesday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 4){
				fullday = "Thursday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 5){
				fullday = "Friday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 6){
				fullday = "Saturday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if (monthint == 6){
			fullmonth = "July";
			if(dayint == 0){
				fullday	= "Sunday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 1){
				fullday = "Monday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 2){
				fullday = "Tuesday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 3){
				fullday = "Wednesday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 4){
				fullday = "Thursday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 5){
				fullday = "Friday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 6){
				fullday = "Saturday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if (monthint == 7){
			fullmonth = "August";
			if(dayint == 0){
				fullday	= "Sunday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 1){
				fullday = "Monday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 2){
				fullday = "Tuesday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 3){
				fullday = "Wednesday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 4){
				fullday = "Thursday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 5){
				fullday = "Friday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 6){
				fullday = "Saturday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if (monthint == 8){
			fullmonth = "Spetember";
			if(dayint == 0){
				fullday	= "Sunday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 1){
				fullday = "Monday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 2){
				fullday = "Tuesday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 3){
				fullday = "Wednesday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 4){
				fullday = "Thursday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 5){
				fullday = "Friday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 6){
				fullday = "Saturday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if (monthint == 9){
			fullmonth = "October";
			if(dayint == 0){
				fullday	= "Sunday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 1){
				fullday = "Monday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 2){
				fullday = "Tuesday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 3){
				fullday = "Wednesday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 4){
				fullday = "Thursday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 5){
				fullday = "Friday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 6){
				fullday = "Saturday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if (monthint == 10){
			fullmonth = "November";
			if(dayint == 0){
				fullday	= "Sunday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 1){
				fullday = "Monday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 2){
				fullday = "Tuesday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 3){
				fullday = "Wednesday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 4){
				fullday = "Thursday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 5){
				fullday = "Friday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 6){
				fullday = "Saturday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if (monthint == 11){
			fullmonth = "December";
			if(dayint == 0){
				fullday	= "Sunday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 1){
				fullday = "Monday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 2){
				fullday = "Tuesday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 3){
				fullday = "Wednesday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 4){
				fullday = "Thursday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 5){
				fullday = "Friday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else if (dayint == 6){
				fullday = "Saturday";
				plr.sendMessage(fullday +" " + Date.getDay() + " of " + fullmonth + Date.getYear() + ", " + Date.getHours() + " "+ Date.getMinutes() + " " + Date.getSeconds());
			}else{
				System.err.println("Unable to detect day!");
			}
		}else{
			System.err.println("Unable to detect month!");
		}
	}
}
