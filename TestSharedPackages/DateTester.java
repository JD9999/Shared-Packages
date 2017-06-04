package TestSharedPackages;

import java.util.Date;

import Date.*;

/**
 * The built-in tester for testing what can be tested of the Date package.
 */
public class DateTester {

	public static void main(String[] args) {
		boolean error = false;
		boolean error11 = false;
		boolean error12 = false;
		boolean error13 = false;
		boolean error14 = false;
		System.out.println("Testing Date package!");
		System.out.println("Unfortunately it is difficult to test Dates (like stopwatches and timers), so only the Astronomical class can be tested programmatically");
		System.out.println("Testing class 1 of 1: Astronomical");
		Astronomical astronaut = new Astronomical();
		System.out.println("Commencing test 1 of 4: Working out the difference in time between Earth and space from one input");
		astronaut.passDays(14);
		if(astronaut.getDifferenceInMilliseconds() == 2000) System.out.println("Working out the difference in time between Earth and space from one input completed!");
		else{
			System.out.println("FAILURE! Unable to work out the difference in time between Earth and space from one input");
			error11 = true;
			error = true;
		}
		
		System.out.println("Commencing test 2 of 4: Synchronizing times");
		astronaut.synchronise();
		if(astronaut.getDifferenceInMilliseconds() == 0) System.out.println("Synchronising times completed!");
		else{
			System.out.println("FAILURE! Unable to synchronize times");
			error12 = true;
			error = true;
		}
		
		System.out.println("Commencing test 3 of 4: Working out the difference in time between Earth and space from many inputs");
		astronaut.passWeeks(3);
		astronaut.passDays(3);
		double t = 3;
		double b = 7;
		double n = t/b;
		if(astronaut.getDifferenceInSeconds() == 3 + n) System.out.println("Working out the difference in time between Earth and space from many inputs completed!");
		else{
			System.out.println("FAILURE! Unable to work out the difference in time between Earth and space from many inputs");
			error13 = true;
			error = true;
		}
		
		System.out.println("Commencing test 4 of 4: Obtaining a Date object relative to the Astronaut's time");
		long time = astronaut.getDateForAstronaut().getTime();
		long time2 = new Date().getTime();
		if(time <= time2) System.out.println("Obtaining a Date object relative to the Astronaut's time completed!");
		else{
			System.out.println("FAILURE! Unable to obtain a Date object relative to the Astronaut's time");
			error14 = true;
			error = true;
		}
		
		if(!error) System.out.println("No errors!");
		else{
			if(error11) System.err.println("Error with Astronomical, unable to work out the difference in time between Earth and space from one input");
			if(error12) System.err.println("Error with Astronomical, unable to synchronize times");
			if(error13) System.err.println("Error with Astronomical, unable to work out the difference in time between Earth and space from many inputs");
			if(error14) System.err.println("Error with Astronomical, unable to obtain a Date object relative to the Astronaut's time");
		}
		
	}

}
