package Date;

import java.util.Calendar;

import PluginReference.*;
/**
 * This class uses the Calendar method. This means that, although it is harder to use and potentially laggier, it can do 12/24 hour time. It also uses non-deprecated methods.
 */	
public class NonDeprecatedAdvancedDate {
	static String AM_PM;
	
	public NonDeprecatedAdvancedDate(){
		
	}
	
/**
 * Returns the date in integers. 24 hour.
 * Not used for a player
 */
public void IntDate24hour(){
	Calendar cal = Calendar.getInstance();
	System.out.println(cal.get(Calendar.DAY_OF_MONTH) + "/" + cal.get(Calendar.MONTH) + "/" + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + ":" + cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND));
}
/**
 * Returns the date in integers. 12 hour.
 */
public void IntDateAMPM(){
	Calendar cal = Calendar.getInstance();
	if(cal.get(Calendar.AM_PM) == 0){
		AM_PM = "AM";
	}else if(cal.get(Calendar.AM_PM) == 1){
		AM_PM = "PM";
	}else{
		System.err.println("Unable to detect AM/PM!");
	}
	System.out.println(cal.get(Calendar.DAY_OF_MONTH) + "/" + cal.get(Calendar.MONTH) + "/" + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":" + cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
}
/**
 * Returns the date in Integers. 24 hour.
 * Used for a player
 * @param plr MC_Player the player you send the time to.
 */
public void IntDate24hour(MC_Player plr){

	Calendar cal = Calendar.getInstance();
	plr.sendMessage((cal.get(Calendar.DAY_OF_MONTH)) + "/" + ((cal.get(Calendar.MONTH)) + 1) + "/" + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + ":" + cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND));
}
/**
 * Returns the date in Integers. 12 hour.
 * Used for a player.
 * @param plr MC_Player the player you send the message to.
 */
public void IntDateAMPM(MC_Player plr){
	Calendar cal = Calendar.getInstance();
	if(cal.get(Calendar.AM_PM) == 0){
		AM_PM = "AM";
	}else if(cal.get(Calendar.AM_PM) == 1){
		AM_PM = "PM";
	}else{
		System.err.println("Unable to detect AM/PM!");
	}
	plr.sendMessage(cal.get(Calendar.DAY_OF_MONTH) + "/" + cal.get(Calendar.MONTH) + "/" + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":" + cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
}
/**
 * This method is similar the the Date method in SimpleDate, but it returns the month like "January" rather than "Jan" and the day like "Monday" rather than "Mon"
 * This method is for 24 hour time. Use FullwordDateAMPM() for 12-hour time
 * This method cannot be used for a player
 */
public void FullwordDate24hour(){
	String fullmonth;
	String fullday;
	Calendar cal = Calendar.getInstance();
	int monthint = cal.get(Calendar.MONTH);
	int dayint = cal.get(Calendar.DAY_OF_WEEK);
		if(monthint == 0){
			fullmonth = "January";
			if(dayint == 0){
				fullday	= "Sunday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 1){
				fullday = "Monday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 2){
				fullday = "Tuesday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 3){
				fullday = "Wednesday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 4){
				fullday = "Thursday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 5){
				fullday = "Friday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 6){
				fullday = "Saturday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if(monthint == 1){
			fullmonth = "February";
			if(dayint == 0){
				fullday	= "Sunday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 1){
				fullday = "Monday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 2){
				fullday = "Tuesday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 3){
				fullday = "Wednesday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 4){
				fullday = "Thursday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 5){
				fullday = "Friday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 6){
				fullday = "Saturday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if (monthint == 2){
			fullmonth = "March";
			if(dayint == 0){
				fullday	= "Sunday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 1){
				fullday = "Monday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 2){
				fullday = "Tuesday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 3){
				fullday = "Wednesday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 4){
				fullday = "Thursday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 5){
				fullday = "Friday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 6){
				fullday = "Saturday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if (monthint == 3){
			fullmonth = "April";
			if(dayint == 0){
				fullday	= "Sunday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 1){
				fullday = "Monday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 2){
				fullday = "Tuesday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 3){
				fullday = "Wednesday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 4){
				fullday = "Thursday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 5){
				fullday = "Friday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 6){
				fullday = "Saturday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if (monthint == 4){
			fullmonth = "May";
			if(dayint == 0){
				fullday	= "Sunday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 1){
				fullday = "Monday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 2){
				fullday = "Tuesday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 3){
				fullday = "Wednesday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 4){
				fullday = "Thursday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 5){
				fullday = "Friday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 6){
				fullday = "Saturday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if (monthint == 5){
			fullmonth = "June";
			if(dayint == 0){
				fullday	= "Sunday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 1){
				fullday = "Monday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 2){
				fullday = "Tuesday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 3){
				fullday = "Wednesday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 4){
				fullday = "Thursday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 5){
				fullday = "Friday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 6){
				fullday = "Saturday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if (monthint == 6){
			fullmonth = "July";
			if(dayint == 0){
				fullday	= "Sunday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 1){
				fullday = "Monday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 2){
				fullday = "Tuesday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 3){
				fullday = "Wednesday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 4){
				fullday = "Thursday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 5){
				fullday = "Friday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 6){
				fullday = "Saturday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if (monthint == 7){
			fullmonth = "August";
			if(dayint == 0){
				fullday	= "Sunday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 1){
				fullday = "Monday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 2){
				fullday = "Tuesday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 3){
				fullday = "Wednesday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 4){
				fullday = "Thursday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 5){
				fullday = "Friday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 6){
				fullday = "Saturday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if (monthint == 8){
			fullmonth = "Spetember";
			if(dayint == 0){
				fullday	= "Sunday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 1){
				fullday = "Monday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 2){
				fullday = "Tuesday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 3){
				fullday = "Wednesday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 4){
				fullday = "Thursday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 5){
				fullday = "Friday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 6){
				fullday = "Saturday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if (monthint == 9){
			fullmonth = "October";
			if(dayint == 0){
				fullday	= "Sunday";
				if(dayint == 0){
					fullday	= "Sunday";
					System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
				}else if (dayint == 1){
					fullday = "Monday";
					System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
				}else if (dayint == 2){
					fullday = "Tuesday";
					System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
				}else if (dayint == 3){
					fullday = "Wednesday";
					System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
				}else if (dayint == 4){
					fullday = "Thursday";
					System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
				}else if (dayint == 5){
					fullday = "Friday";
					System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
				}else if (dayint == 6){
					fullday = "Saturday";
					System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
				}else{
					System.err.println("Unable to detect day!");
				}
		}else if (monthint == 10){
			fullmonth = "November";
			if(dayint == 0){
				fullday	= "Sunday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 1){
				fullday = "Monday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 2){
				fullday = "Tuesday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 3){
				fullday = "Wednesday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 4){
				fullday = "Thursday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 5){
				fullday = "Friday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 6){
				fullday = "Saturday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else{
				System.err.println("Unable to detect day!");
			}
			}else if (monthint == 11){
				fullmonth = "December";
				if(dayint == 0){
					fullday	= "Sunday";
					System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
				}else if (dayint == 1){
					fullday = "Monday";
					System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
				}else if (dayint == 2){
					fullday = "Tuesday";
					System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
				}else if (dayint == 3){
					fullday = "Wednesday";
					System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
				}else if (dayint == 4){
					fullday = "Thursday";
					System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
				}else if (dayint == 5){
					fullday = "Friday";
					System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
				}else if (dayint == 6){
					fullday = "Saturday";
					System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
				}else{
					System.err.println("Unable to detect day!");
				}
				}
			}else{
				System.err.println("Unable to detect month!");
			}
	}
/**
 * This method is similar the the Date method in SimpleDate, but it returns the month like "January" rather than "Jan" and the day like "Monday" rather than "Mon"
 * This method is for 24 hour time. Use FullwordDateAMPM(MC_Player plr) for 12-hour time
 * This method is used for a player
 * @param plr MC_Player the player you send the date to.
 */
public void FullwordDate24hour(MC_Player plr){
	Calendar cal = Calendar.getInstance();
	String fullmonth;
	String fullday;
	int monthint = Calendar.MONTH;
	int dayint = Calendar.DAY_OF_WEEK;
		if(monthint == 0){
			fullmonth = "January";
			if(dayint == 0){
				fullday	= "Sunday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 1){
				fullday = "Monday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 2){
				fullday = "Tuesday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 3){
				fullday = "Wednesday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 4){
				fullday = "Thursday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 5){
				fullday = "Friday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 6){
				fullday = "Saturday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if(monthint == 1){
			fullmonth = "February";
			if(dayint == 0){
				fullday	= "Sunday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 1){
				fullday = "Monday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 2){
				fullday = "Tuesday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 3){
				fullday = "Wednesday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 4){
				fullday = "Thursday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 5){
				fullday = "Friday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 6){
				fullday = "Saturday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if (monthint == 2){
			fullmonth = "March";
			if(dayint == 0){
				fullday	= "Sunday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 1){
				fullday = "Monday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 2){
				fullday = "Tuesday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 3){
				fullday = "Wednesday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 4){
				fullday = "Thursday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 5){
				fullday = "Friday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 6){
				fullday = "Saturday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if (monthint == 3){
			fullmonth = "April";
			if(dayint == 0){
				fullday	= "Sunday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 1){
				fullday = "Monday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 2){
				fullday = "Tuesday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 3){
				fullday = "Wednesday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 4){
				fullday = "Thursday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 5){
				fullday = "Friday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 6){
				fullday = "Saturday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if (monthint == 4){
			fullmonth = "May";
			if(dayint == 0){
				fullday	= "Sunday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 1){
				fullday = "Monday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 2){
				fullday = "Tuesday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 3){
				fullday = "Wednesday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 4){
				fullday = "Thursday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 5){
				fullday = "Friday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 6){
				fullday = "Saturday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if (monthint == 5){
			fullmonth = "June";
			if(dayint == 0){
				fullday	= "Sunday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 1){
				fullday = "Monday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 2){
				fullday = "Tuesday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 3){
				fullday = "Wednesday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 4){
				fullday = "Thursday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 5){
				fullday = "Friday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 6){
				fullday = "Saturday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if (monthint == 6){
			fullmonth = "July";
			if(dayint == 0){
				fullday	= "Sunday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 1){
				fullday = "Monday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 2){
				fullday = "Tuesday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 3){
				fullday = "Wednesday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 4){
				fullday = "Thursday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 5){
				fullday = "Friday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 6){
				fullday = "Saturday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if (monthint == 7){
			fullmonth = "August";
			if(dayint == 0){
				fullday	= "Sunday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 1){
				fullday = "Monday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 2){
				fullday = "Tuesday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 3){
				fullday = "Wednesday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 4){
				fullday = "Thursday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 5){
				fullday = "Friday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 6){
				fullday = "Saturday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if (monthint == 8){
			fullmonth = "Spetember";
			if(dayint == 0){
				fullday	= "Sunday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 1){
				fullday = "Monday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 2){
				fullday = "Tuesday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 3){
				fullday = "Wednesday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 4){
				fullday = "Thursday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 5){
				fullday = "Friday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 6){
				fullday = "Saturday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if (monthint == 9){
			fullmonth = "October";
			if(dayint == 0){
				fullday	= "Sunday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 1){
				fullday = "Monday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 2){
				fullday = "Tuesday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 3){
				fullday = "Wednesday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 4){
				fullday = "Thursday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 5){
				fullday = "Friday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 6){
				fullday = "Saturday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if (monthint == 10){
			fullmonth = "November";
			if(dayint == 0){
				fullday	= "Sunday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 1){
				fullday = "Monday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 2){
				fullday = "Tuesday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 3){
				fullday = "Wednesday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 4){
				fullday = "Thursday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 5){
				fullday = "Friday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 6){
				fullday = "Saturday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if (monthint == 11){
			fullmonth = "December";
			if(dayint == 0){
				fullday	= "Sunday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 1){
				fullday = "Monday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 2){
				fullday = "Tuesday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 3){
				fullday = "Wednesday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 4){
				fullday = "Thursday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 5){
				fullday = "Friday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else if (dayint == 6){
				fullday = "Saturday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR_OF_DAY) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
			}else{
				System.err.println("Unable to detect day!");
			}
		}else{
			System.err.println("Unable to detect month!");
		}
	}
/**
 * This method is similar the the Date method in SimpleDate, but it returns the month like "January" rather than "Jan" and the day like "Monday" rather than "Mon"
 * This method is for 12 hour time. Use FullwordDate24hour() for 24-hour time
 * This method cannot be used for a player
 */
public void FullwordDateAMPM(){
	String fullmonth;
	String fullday;
	Calendar cal = Calendar.getInstance();
	if(cal.get(Calendar.AM_PM) == 0){
		AM_PM = "AM";
	}else if(cal.get(Calendar.AM_PM) == 1){
		AM_PM = "PM";
	}else{
		System.err.println("Unable to detect AM/PM!");
	}
	int monthint = Calendar.MONTH;
	int dayint = Calendar.DAY_OF_WEEK;
		if(monthint == 0){
			fullmonth = "January";
			if(dayint == 0){
				fullday	= "Sunday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 1){
				fullday = "Monday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 2){
				fullday = "Tuesday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 3){
				fullday = "Wednesday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 4){
				fullday = "Thursday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 5){
				fullday = "Friday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 6){
				fullday = "Saturday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if(monthint == 1){
			fullmonth = "February";
			if(dayint == 0){
				fullday	= "Sunday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 1){
				fullday = "Monday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 2){
				fullday = "Tuesday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 3){
				fullday = "Wednesday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 4){
				fullday = "Thursday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 5){
				fullday = "Friday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 6){
				fullday = "Saturday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if (monthint == 2){
			fullmonth = "March";
			if(dayint == 0){
				fullday	= "Sunday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 1){
				fullday = "Monday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 2){
				fullday = "Tuesday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 3){
				fullday = "Wednesday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 4){
				fullday = "Thursday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 5){
				fullday = "Friday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 6){
				fullday = "Saturday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if (monthint == 3){
			fullmonth = "April";
			if(dayint == 0){
				fullday	= "Sunday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 1){
				fullday = "Monday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 2){
				fullday = "Tuesday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 3){
				fullday = "Wednesday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 4){
				fullday = "Thursday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 5){
				fullday = "Friday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 6){
				fullday = "Saturday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if (monthint == 4){
			fullmonth = "May";
			if(dayint == 0){
				fullday	= "Sunday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 1){
				fullday = "Monday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 2){
				fullday = "Tuesday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 3){
				fullday = "Wednesday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 4){
				fullday = "Thursday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 5){
				fullday = "Friday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 6){
				fullday = "Saturday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if (monthint == 5){
			fullmonth = "June";
			if(dayint == 0){
				fullday	= "Sunday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 1){
				fullday = "Monday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 2){
				fullday = "Tuesday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 3){
				fullday = "Wednesday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 4){
				fullday = "Thursday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 5){
				fullday = "Friday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 6){
				fullday = "Saturday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if (monthint == 6){
			fullmonth = "July";
			if(dayint == 0){
				fullday	= "Sunday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 1){
				fullday = "Monday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 2){
				fullday = "Tuesday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 3){
				fullday = "Wednesday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 4){
				fullday = "Thursday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 5){
				fullday = "Friday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 6){
				fullday = "Saturday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if (monthint == 7){
			fullmonth = "August";
			if(dayint == 0){
				fullday	= "Sunday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 1){
				fullday = "Monday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 2){
				fullday = "Tuesday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 3){
				fullday = "Wednesday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 4){
				fullday = "Thursday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 5){
				fullday = "Friday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 6){
				fullday = "Saturday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if (monthint == 8){
			fullmonth = "Spetember";
			if(dayint == 0){
				fullday	= "Sunday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 1){
				fullday = "Monday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 2){
				fullday = "Tuesday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 3){
				fullday = "Wednesday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 4){
				fullday = "Thursday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 5){
				fullday = "Friday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 6){
				fullday = "Saturday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if (monthint == 9){
			fullmonth = "October";
			if(dayint == 0){
				fullday	= "Sunday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 1){
				fullday = "Monday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 2){
				fullday = "Tuesday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 3){
				fullday = "Wednesday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 4){
				fullday = "Thursday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 5){
				fullday = "Friday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 6){
				fullday = "Saturday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if (monthint == 10){
			fullmonth = "November";
			if(dayint == 0){
				fullday	= "Sunday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 1){
				fullday = "Monday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 2){
				fullday = "Tuesday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 3){
				fullday = "Wednesday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 4){
				fullday = "Thursday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 5){
				fullday = "Friday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 6){
				fullday = "Saturday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if (monthint == 11){
			fullmonth = "December";
			if(dayint == 0){
				fullday	= "Sunday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 1){
				fullday = "Monday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 2){
				fullday = "Tuesday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 3){
				fullday = "Wednesday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 4){
				fullday = "Thursday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 5){
				fullday = "Friday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else if (dayint == 6){
				fullday = "Saturday";
				System.out.println(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + " " + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + ":"+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + AM_PM);
			}else{
				System.err.println("Unable to detect day!");
			}
		}else{
			System.err.println("Unable to detect month!");
		}
	}
/**
 * This method is similar the the Date method in SimpleDate, but it returns the month like "January" rather than "Jan" and the day like "Monday" rather than "Mon"
 * This method is for 12 hour time. Use FullwordDate24hour() for 24-hour time
 * @param plr MC_Player the player you send the date to.
 */
public void FullwordDateAMPM(MC_Player plr){
	String fullmonth;
	String fullday;
	Calendar cal = Calendar.getInstance();
	if(cal.get(Calendar.AM_PM) == 0){
		AM_PM = "AM";
	}else if(cal.get(Calendar.AM_PM) == 1){
		AM_PM = "PM";
	}else{
		System.err.println("Unable to detect AM/PM!");
	}
	int monthint = cal.get(Calendar.MONTH);
	int dayint = cal.get(Calendar.DAY_OF_WEEK);
		if(monthint == 0){
			fullmonth = "January";
			if(dayint == 0){
				fullday	= "Sunday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 1){
				fullday = "Monday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 2){
				fullday = "Tuesday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 3){
				fullday = "Wednesday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 4){
				fullday = "Thursday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 5){
				fullday = "Friday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 6){
				fullday = "Saturday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if(monthint == 1){
			fullmonth = "February";
			if(dayint == 0){
				fullday	= "Sunday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 1){
				fullday = "Monday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 2){
				fullday = "Tuesday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 3){
				fullday = "Wednesday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 4){
				fullday = "Thursday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 5){
				fullday = "Friday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 6){
				fullday = "Saturday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if (monthint == 2){
			fullmonth = "March";
			if(dayint == 0){
				fullday	= "Sunday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 1){
				fullday = "Monday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 2){
				fullday = "Tuesday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 3){
				fullday = "Wednesday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 4){
				fullday = "Thursday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 5){
				fullday = "Friday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 6){
				fullday = "Saturday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if (monthint == 3){
			fullmonth = "April";
			if(dayint == 0){
				fullday	= "Sunday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 1){
				fullday = "Monday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 2){
				fullday = "Tuesday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 3){
				fullday = "Wednesday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 4){
				fullday = "Thursday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 5){
				fullday = "Friday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 6){
				fullday = "Saturday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if (monthint == 4){
			fullmonth = "May";
			if(dayint == 0){
				fullday	= "Sunday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 1){
				fullday = "Monday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 2){
				fullday = "Tuesday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 3){
				fullday = "Wednesday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 4){
				fullday = "Thursday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 5){
				fullday = "Friday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 6){
				fullday = "Saturday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if (monthint == 5){
			fullmonth = "June";
			if(dayint == 0){
				fullday	= "Sunday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 1){
				fullday = "Monday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 2){
				fullday = "Tuesday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 3){
				fullday = "Wednesday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 4){
				fullday = "Thursday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 5){
				fullday = "Friday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 6){
				fullday = "Saturday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if (monthint == 6){
			fullmonth = "July";
			if(dayint == 0){
				fullday	= "Sunday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 1){
				fullday = "Monday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 2){
				fullday = "Tuesday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 3){
				fullday = "Wednesday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 4){
				fullday = "Thursday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 5){
				fullday = "Friday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 6){
				fullday = "Saturday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if (monthint == 7){
			fullmonth = "August";
			if(dayint == 0){
				fullday	= "Sunday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 1){
				fullday = "Monday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 2){
				fullday = "Tuesday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 3){
				fullday = "Wednesday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 4){
				fullday = "Thursday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 5){
				fullday = "Friday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 6){
				fullday = "Saturday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if (monthint == 8){
			fullmonth = "Spetember";
			if(dayint == 0){
				fullday	= "Sunday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 1){
				fullday = "Monday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 2){
				fullday = "Tuesday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 3){
				fullday = "Wednesday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 4){
				fullday = "Thursday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 5){
				fullday = "Friday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 6){
				fullday = "Saturday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if (monthint == 9){
			fullmonth = "October";
			if(dayint == 0){
				fullday	= "Sunday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 1){
				fullday = "Monday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 2){
				fullday = "Tuesday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 3){
				fullday = "Wednesday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 4){
				fullday = "Thursday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 5){
				fullday = "Friday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 6){
				fullday = "Saturday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if (monthint == 10){
			fullmonth = "November";
			if(dayint == 0){
				fullday	= "Sunday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 1){
				fullday = "Monday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 2){
				fullday = "Tuesday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 3){
				fullday = "Wednesday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 4){
				fullday = "Thursday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 5){
				fullday = "Friday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 6){
				fullday = "Saturday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else{
				System.err.println("Unable to detect day!");
			}
		}else if (monthint == 11){
			fullmonth = "December";
			if(dayint == 0){
				fullday	= "Sunday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 1){
				fullday = "Monday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 2){
				fullday = "Tuesday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 3){
				fullday = "Wednesday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 4){
				fullday = "Thursday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 5){
				fullday = "Friday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else if (dayint == 6){
				fullday = "Saturday";
				plr.sendMessage(fullday +" " + cal.get(Calendar.DAY_OF_MONTH) + " of " + fullmonth + cal.get(Calendar.YEAR) + ", " + cal.get(Calendar.HOUR) + " "+ cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + AM_PM);
			}else{
				System.err.println("Unable to detect day!");
			}
		}else{
			System.err.println("Unable to detect month!");
		}
	}
}
