package Math;

/**
 * The class that handles values and positions for trigonometry.
 */
public class TrigValue {

	private String position;
	private int value = 0;
	
	/**
	 * Gets the position of the side
	 * @return the position of the side
	 */
	public String getPosition(){
		return position;
	}
	
	/**
	 * Gets the value of the side
	 * @return the value of the side
	 */
	public int getValue(){
		return value;
	}
	
	/**
	 * Creates a TrigValue with a known position, but an unknown value
	 * Used for determining the value of the side in the {@link Trig#getSideLength(TrigValue, int, TrigValue)} method.
	 * @param pos the position of the value. They are defined in the class.
	 * @throws TrigonometryException if the position provided does not match one of the defined positions.
	 */
	public TrigValue(String pos) throws TrigonometryException{
		if(pos.toLowerCase().contains("hyp")) position = "hypotenuse";
		else if(pos.toLowerCase().contains("opp")) position = "opposite";
		else if(pos.toLowerCase().contains("adj")) position = "adjacent";
		else throw new TrigonometryException("Unable to interpret position:" + pos);
	}
	
	/**
	 * Creates a TrigValue with a known position and value
	 * @param pos the position of the value. They are defined in the class.
	 * @param value the value of the side
	 * @throws TrigonometryException If the position provided does not match one of the defined positions, or if the value of the side is negative.
	 */
	public TrigValue(String pos, int value) throws TrigonometryException{
		this(pos);
		if(value > 0) this.value = value;
		else throw new TrigonometryException("Side length cannot be a negative number!");
	}
	
	/**
	 * The position representing the hypotenuse of the triangle.
	 */
	public static String HYPOTENUSE = "hyp";
	
	/**
	 * The position representing the side opposite the angle.
	 */
	public static String OPPOSITE = "opp";
	
	/**
	 * The position representing the side adjacent to the angle.
	 */
	public static String ADJACENT = "adj";
	
}
