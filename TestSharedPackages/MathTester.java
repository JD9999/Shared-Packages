package TestSharedPackages;

import java.util.List;

import Math.*;

/**
 * The built-in tester for testing the Math package.
 */
public class MathTester {

	public static void main(String[] args) {
		boolean error = false;
		boolean error11 = false;
		boolean error12 = false;
		boolean error13 = false;
		boolean error14 = false;
		boolean error21 = false;
		boolean error22 = false;
		boolean error23 = false;
		boolean error24 = false;
		boolean error31 = false;
		boolean error32 = false;
		System.out.println("Testing Maths package!");
		Algebra a = new Algebra();
		Pythagoras p = new Pythagoras();
		Trig t = new Trig();
		TrigValue hypknown;
		TrigValue shortknown;
		TrigValue hypunknown;
		try {
			hypknown = new TrigValue(TrigValue.HYPOTENUSE, 5);
			shortknown = new TrigValue(TrigValue.ADJACENT, 3);
			hypunknown = new TrigValue(TrigValue.HYPOTENUSE);
		} catch (TrigonometryException e) {
			System.out.println("FAILURE! Unable to define object! Throwing exception and canceling tester!");
			System.out.println("In case you are testing other testers, not canceling program");
			e.printStackTrace();
			return;
		}
		System.out.println("Testing classes in alphabetical order!");
		//-----
		System.out.println("Testing class 1 of 3: Algebra");
		System.out.println("Commencing test 1 of 4: Obtaining possibilities");
		List<Integer> possibilities = a.getListOfPossibilities(4, 8, false);
		if(possibilities.size() == 5) System.out.println("Obtaining possibilities complete!");
		else{
			System.out.println("FAILURE! Unable to obtain possibilities");
			error = true;
			error11 = true;
		}
		System.out.println("Commencing test 2 of 4: Dividing a value by a multiplier");
		double b = a.getValueOfUnknown(3, 6);
		if(b == 2) System.out.println("Dividing a value by a multiplier complete!");
		else{
			System.out.println("FAILURE! Unable to divide a value by a multiplier");
			error = true;
			error12 = true;
		}
		System.out.println("Commencing test 3 of 4: Dividing a value by a multiplier involving a subtraction");
		double b2 = a.getValueOfUnknown(6, 3, 45);
		if(b2 == 7) System.out.println("Dividing a value by a multiplier involving subtraction complete!");
		else{
			System.out.println("FAILURE! Unable divide a value by a multiplier involving subtraction");
			error = true;
			error13 = true;
		}
		System.out.println("Commencing test 4 of 4: Making a negative value positive");
		double pos = a.makePositive(-6);
		if(pos == 6) System.out.println("Making a negative value positive complete!");
		else{
			System.out.println("FAILURE! Unable to make a negative value positive");
			error = true;
			error14 = true;
		}
		//-----
		System.out.println("Testing class 2 of 3: Pythagoras");
		System.out.println("Commencing test 1 of 4: Obtaining a hypotenuse");
		double hyp = p.getHypotenuse(b, b2);
		if(hyp == Math.sqrt(53)) System.out.println("Obtaining a hypotenuse complete!");
		else{
			System.out.println("FAILURE! Unable to obtain a hypotenuse");
			error21 = true;
			error = true;
		}
		System.out.println("Commencing test 2 of 4: Obtaining a shorter side");
		double sh = p.getShorterSide(b, b2);
		if(sh == Math.sqrt(45)) System.out.println("Obtaining a shorter side complete!");
		else{
			System.out.println("FAILURE! Unable to obtain a shorter side");
			error22 = true;
			error = true;
		}
		System.out.println("Commencing test 3 of 4: Obtaining the side length of a square");
		double side = p.getSideLengthOfSquare(4);
		if(side == Math.sqrt(8)) System.out.println("Obtaining the side length of a square complete!");
		else{
			System.out.println("FAILURE! Unable to obtain the side length of a square");
			error23 = true;
			error = true;
		}
		System.out.println("Commencing test 4 of 4: Testing triads");
		boolean tr = p.isTriad(3, 4, 5);
		boolean f = p.isTriad(3, 4, 6);
		if(tr && !f) System.out.println("Testing triads complete!");
		else{
			System.out.println("FAILURE! Unable to test triads");
			error24 = true;
			error = true;
		}
		//-----
		System.out.println("Testing class 3 of 3: Trig");
		System.out.println("Commencing test 1 of 2: Getting the size of an angle");
		try {
			double angleSize = t.getAngleSize(shortknown, hypknown);
			double acos = Math.acos(3.0 / 5.0);
			if(angleSize == acos) System.out.println("Getting the size of an angle complete!");
			else{
				System.out.println("FAILURE! Unable to get the size of an angle");
				error31 = true;
				error = true;
			}
		} catch (TrigonometryException e) {
			System.out.println("Trigonometry Exception thrown! Test 1 of 2!:");
			e.printStackTrace();
		}
		System.out.println("Commencing test 2 of 2: Getting the length of a side");
		try {
			double length = t.getSideLength(shortknown, 30, hypunknown);
			double rads = Math.PI * 30 / 180;
			double proposedLength = 3/ Math.cos(rads);
			if(length == proposedLength) System.out.println("Getting the length of a side complete!");
			else{
				System.out.println("FAILURE! Unable to get the length of a side");
				error32 = true;
				error = true;
			}
		} catch (TrigonometryException e) {
			System.out.println("Trigonometry Exception thrown! Test 2 of 2!:");
			e.printStackTrace();
		}
		
		if(!error){
			System.out.println("No errors!");
		}else{
			if(error11) System.err.println("Error with Algebra, unable to obtain possibilities");
			if(error12) System.err.println("Error with Algebra, unable to divide a value by a multiplier");
			if(error13) System.err.println("Error with Algebra, unable divide a value by a multiplier involving subtraction");
			if(error14) System.err.println("Error with Algebra, unable to make a negative value positive");
			if(error21) System.err.println("Error with Pythagoras, unable to obtain a hypotenuse");
			if(error22) System.err.println("Error with Pythagoras, unable to obtain a shorter side");
			if(error23) System.err.println("Error with Pythagoras, unable to obtain the side length of a square");
			if(error24) System.err.println("Error with Pythagoras, unable to test triads");
			if(error31) System.err.println("Error with Trig, unable to get the size on an angle");
			if(error32) System.err.println("Error with Trig, unable to get the length of a side");
		}
		
	}

}
