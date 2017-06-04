package Date;

import java.util.Date;

/**
 * Every week, Earth gains one extra second in time. This can be used to calculate that difference.
 */
public class Astronomical {

	/**
	 * Creates an Astronomical object
	 */
	public Astronomical(){
		synchronise();
	}
	
	//TODO Add more constructors, maybe a Date object and a milliseconds difference object?
	
	/**
	 * The difference between Earth time and space time
	 */
	private double milliseconds = 0;
	
	/**
	 * Resynchronize time e.g. Astronaut comes back to Earth
	 */
	public void synchronise(){
		milliseconds = 0;
	}
	
	/**
	 * The astronaut is away for x hours
	 * @param hours the amount of hours they are away for
	 */
	public void passHours(double hours){
		milliseconds = milliseconds + (hours / 7 / 24) * 1000;
	}
	
	/**
	 * The astronaut is away for x days
	 * @param d the amount of days they are away for
	 */
	public void passDays(double d){
		milliseconds = milliseconds + (d / 7) * 1000;
	}
	
	/**
	 * The astronaut is away for x weeks
	 * @param weeks the amount of weeks they are away for
	 */
	public void passWeeks(double weeks){
		milliseconds = milliseconds + weeks * 1000;
	}
	
	/**
	 * The astronaut is away for x months
	 * @param months the amount of months they are away for
	 */
	public void passMonths(double months){
		passDays(months * 30.44);
	}
	
	/**
	 * Gets the time the astronaut has been away for, in milliseconds
	 * @return the milliseconds difference
	 */
	public double getDifferenceInMilliseconds(){
		return milliseconds;
	}
	
	/**
	 * Get the time the astronaut has been away for, in seconds
	 * @return the seconds difference
	 */
	public double getDifferenceInSeconds(){
		return milliseconds / 1000;
	}
	
	/**
	 * Get a Date object representing the current date and time of the astronaut
	 * @return the Date object.
	 */
	public Date getDateForAstronaut(){
		Date date = new Date();
		if(milliseconds != 0){
			long mis = date.getTime();
			date.setTime(mis - Math.round(milliseconds));
		}
		return date;
	}
	
}
