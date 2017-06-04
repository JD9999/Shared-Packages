package Math;

/**
 * Does basic trigonometry functions
 */
public class Trig {

	/**
	 * Creates a Trig object.
	 */
	public Trig(){
		
	}
	
	/**
	 * Gets the length of the side
	 * @param known the TrigValue with a known position and value
	 * @param degrees the size of the angle
	 * @param unknown the TrigValue with a known position, but an unknown value
	 * @return the value of the unknown side (unknown TrigValue)
	 * @throws TrigonometryException If the TrigValues are not as specified above, if the two positions are the same, if the two values hold three positions, or if an internal error occurs.
	 */
	public double getSideLength(TrigValue known, int degrees, TrigValue unknown) throws TrigonometryException{
		//Create and set our variables
		boolean sine = true;
		boolean cosine = true;
		boolean tangent = true;
		int knownLength = known.getValue();
		int unknownLength = unknown.getValue();
		String knownPos = known.getPosition();
		String unknownPos = unknown.getPosition();
		
		//We need to run some tests to make sure that the values and positions are valid.
		if(knownLength == 0) throw new TrigonometryException("Known side must have a value!");
		if(unknownLength != 0) throw new TrigonometryException("Unknown side must not have a value!");
		//Just setting a few values here, but it's in this section because of the if -else if- else throw statement.
		if(knownPos.equals("hypotenuse") || unknownPos.equals("hypotenuse")) tangent = false;
		if(knownPos.equals("opposite") || unknownPos.equals("opposite")) cosine = false;
		if(knownPos.equals("adjacent") || unknownPos.equals("adjacent")) sine = false;
		if(knownPos.equals(unknownPos)) throw new TrigonometryException("Both values cannot be on the same side!");
		if(tangent && cosine) throw new TrigonometryException("Both tangent and cosine are true, and yet the positions are not the same. Please report!");
		if(tangent && sine) throw new TrigonometryException("Both tangent and sine are true, and yet the positions are not the same. Please report!");
		if(cosine && sine) throw new TrigonometryException("Both cosine and sine are true, and yet the positions are not the same. Please report!");
		
		//There's one more exception thrown here, but for the same reason as before.
		//Calculate the side's length.
		double rads = Math.PI /180 * degrees;
		if(sine){
			if(unknownPos.equals("opposite")) return knownLength * Math.sin(rads);
			else{
				return knownLength / Math.sin(rads);
			}
		}
		else if(cosine){
			if(unknownPos.equals("adjacent")) return knownLength * Math.cos(rads);
			else{
				return knownLength / Math.cos(rads);
			}
		}
		else if(tangent){
			if(unknownPos.equals("opposite")) return knownLength * Math.tan(rads);
			else{
				return knownLength / Math.tan(rads);
			}
		}
		else throw new TrigonometryException("How can two values have three positions? Please report!");
	} 
	
	/**
	 * Gets the size of the angle
	 * @param a the TrigValue which holds the position and value of a side
	 * @param b the other TrigValue which holds the position and value of a side
	 * @return the size of the angle
	 * @throws TrigonometryException if either side does not have a value, if the values represent the same size, or if an internal error occurs.
	 */
	public double getAngleSize(TrigValue a, TrigValue b) throws TrigonometryException{
		//Create and set our variables
		boolean sine = true;
		boolean cosine = true;
		boolean tangent = true;
		double aLength = a.getValue();
		double bLength = b.getValue();
		String aPos = a.getPosition();
		String bPos = b.getPosition();
		
		//We need to run some tests to make sure that the values and positions are valid.
		if(aLength == 0 || bLength == 0) throw new TrigonometryException("Both sides must have a value!");
		//Just setting a few values here, but it's in this section because of the if -else if- else throw statement.
		if(aPos.equals("hypotenuse") || bPos.equals("hypotenuse")) tangent = false;
		if(aPos.equals("opposite") || bPos.equals("opposite")) cosine = false;
		if(aPos.equals("adjacent") || bPos.equals("adjacent")) sine = false;
		if(aPos.equals(bPos)) throw new TrigonometryException("Both values cannot be on the same side!");
		if(tangent && cosine) throw new TrigonometryException("Both tangent and cosine are true, and yet the positions are not the same. Please report!");
		if(tangent && sine) throw new TrigonometryException("Both tangent and sine are true, and yet the positions are not the same. Please report!");
		if(cosine && sine) throw new TrigonometryException("Both cosine and sine are true, and yet the positions are not the same. Please report!");
				
		//Work out the angle
		if(sine){
			double sin;
			if(aPos.equalsIgnoreCase("hypotenuse")) sin = bLength / aLength;
			else if(bPos.equalsIgnoreCase("hypotenuse")) sin = aLength / bLength;
			else throw new TrigonometryException("Sine requires one of the two variables to be a hypotenuse!");
			return Math.asin(sin);
		}else if(cosine){
			double cos;
			if(aPos.equalsIgnoreCase("hypotenuse")) cos = bLength / aLength;
			else if(bPos.equalsIgnoreCase("hypotenuse")) cos = aLength / bLength;
			else throw new TrigonometryException("Cosine requires one of the two variables to be a hypotenuse!");
			return Math.acos(cos);
		}else if(tangent){
			double tan;
			if(aPos.equalsIgnoreCase("adjacent")) tan = bLength / aLength;
			else if(bPos.equalsIgnoreCase("adjacent")) tan = aLength / bLength;
			else throw new TrigonometryException("Tangent requires one of the two variables to be the adjacent side!");
			return Math.atan(tan);
		}else throw new TrigonometryException("How can two values have three positions? Please report!");
	}
	
}
