package Math;

import java.util.ArrayList;
import java.util.List;

/**
 * Does basic algebra functions
 */
public class Algebra {
	
	/**
	 * Creates an Algebra object
	 */
	public Algebra(){
	}
	
	/**
	 * Gets the value of an unknown where multiplier * x = total
	 * @param multiplier the multiplier
	 * @param total the total value
	 * @return the value of the unknown
	 */
	public double getValueOfUnknown(double multiplier, double total){
		double value = total / multiplier;
		return value;
	}
	
	/**
	 * Gets the value of an unknown where (multiplier * x) + addition = total
	 * @param multiplier the value to multiply the unknown by
	 * @param addition the added value on top of mx
	 * @param total the total that everything adds up to
	 * @return the value of the unknown
	 */
	public double getValueOfUnknown(double multiplier, double addition, double total){
		double newtotal = total - addition;
		return getValueOfUnknown(multiplier, newtotal);
	}
	
	/**
	 * Gets all the numbers that are inside a range
	 * @param rangeBottom the bottom of the range
	 * @param rangeTop the top of the range
	 * @param inside true if it should exclude the rangeBottom and rangeTop as options.
	 * @return a list of integers {@literal (ArrayList<Integer>)} that has all the possibilities
	 */
	public List<Integer> getListOfPossibilities(int rangeBottom, int rangeTop, boolean inside){
		List<Integer> intrange = new ArrayList<Integer>();
		for(int i = rangeBottom; i < rangeTop; i++){
			if(rangeBottom == i && inside) continue;
			intrange.add(i);
		}
		if(!inside) intrange.add(rangeTop);
		return intrange;
	}
	
	/**
	 * Makes a number positive
	 * You do not need to do a check to make sure the number is negative first. This method already does this.
	 * @param d the number to make positive
	 * @return a positive number.
	 */
	public double makePositive(double d){
		if(d < 0) return d - 2 * d;
		else return d;
	}
	
}
