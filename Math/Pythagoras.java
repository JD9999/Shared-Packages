package Math;

/**
 * Does basic Pythagoras functions
 */
public class Pythagoras {
	
	/**
	 * Creates a Pythagoras object
	 */
	public Pythagoras() {
	}
	
	/**
	 * Checks whether the three numbers form a Pythagorean Triad
	 * @param a the first value
	 * @param b the second value
	 * @param c the thrid value
	 * @return whether it is a triad or not
	 */
	public boolean isTriad(double a, double b, double c){
		double as = a * a;
		double bs = b * b;
		double cs = c * c;
		return as+bs == cs;
	}
	
	/**
	 * Gets the hypotenuse of the triangle
	 * @param a the first shorter side
	 * @param b the second shorter side
	 * @return the hypotenuse of the triangle
	 */
	public double getHypotenuse(double a, double b){
		double as = a * a;
		double bs = b * b;
		double cs = as + bs;
		return Math.sqrt(cs);
	}
	
	/**
	 * Gets one of the shorter sides of a triangle
	 * @param a the other shorter side
	 * @param hyp the hypotenuse
	 * @return the shorter side of the triangle
	 */
	public double getShorterSide(double a, double hyp){
		if(a > hyp) throw new IllegalArgumentException("The hypotenuse cannot be smaller than a shorter side!");
		double cs = hyp * hyp;
		double as = a * a;
		double bs = cs - as;
		return Math.sqrt(bs);
	}
	
	/**
	 * Gets the side length of a square.
	 * This works because in a square, both shorter sides are exactly the same length.
	 * @param hyp the hypotenuse. This is the line between two opposite vertices.
	 * @return the side length of the square.
	 */
	public double getSideLengthOfSquare(double hyp){
		double cs = hyp * hyp;
		double ls = cs / 2;
		double sqrt = Math.sqrt(ls);
		return sqrt;
	}
	
}
