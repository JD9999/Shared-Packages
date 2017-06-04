package Reading;

import java.nio.charset.Charset;

public class PurposeFormat {

	private int key;
	
	/**
	 * Creates a PurposeFormat object with the key provided
	 * The keys are all the public static variables located inside the class.
	 * @param key the key to create it with
	 */
	public PurposeFormat(int key) {
		this.key = key;
	}

	/**
	 * Returns whether formatting is required.
	 * @return whether formatting is required.
	 */
	public boolean hasNoFormat(){
		return key == 2;
	}

	/**
	 * Gets the Charset that is wanted.
	 * If {@link #hasNoFormat()} returns true, this is UTF-8
	 * Otherwise, it is the default charset.
	 * @return the charset to use.
	 */
	public Charset getDesiredCharset() {
		if(key == 2) return Charset.forName("UTF-8");
		else return Charset.defaultCharset();
	}
	
	/**
	 * Whether there is a date to change
	 * @return whether there is a date to change.
	 */
	public boolean containsDate(){
		return key == 1 || key == 8;
	}
	
	/**
	 * Whether it contains variables
	 * @return whether it contains variables
	 */
	public boolean containsVariables(){
		return key == 1 || key == 5;
	}
	
	/**
	 * The key to a PurposeFormat that contains both a date and variables to change
	 */
	public static int CONTAINS_DATE_AND_OTHER_VARIABLES = 1;
	
	/**
	 * The key to a PurposeFormat that contains nothing
	 */
	public static int PLAIN_TEXT = 2;
	
	/**
	 * The key to a PurposeFormat that contains variables to change
	 */
	public static int CONTAINS_VARIABLES = 5;
	
	/**
	 * The key to a PurposeFormat that contains a date
	 */
	public static int CONTAINS_DATE = 8;
	
}
