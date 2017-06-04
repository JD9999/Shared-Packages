package Encoder;

/**
 * An enum representing a few possible encoding arrays for TwentySixLetterEncoder, or for your own encoder.
 * If there is something here you want that isn't here, please ask me for it!
 */
public enum LetterEncodings {;

	/**
	 * Represent the order of letters on a keyboard e.g. q-w-e-r-t-y-u-i-o-p...
	 * The letters are lowercase
	 */
	public static char[] LOWER_KEYBOARD = new char[]{'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm'};
	
	/**
	 * Represents a reverse alphabet e.g. z-y-x-w-v-u...
	 * The letters are lowercase
	 */
	public static char[] LOWER_ALPHABETICAL_REVERSE = new char[]{'z', 'y', 'x', 'w', 'v', 'u', 't', 's', 'r', 'q', 'p', 'o', 'n', 'm', 'l', 'k', 'j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a'};
	
	/**
	 * Represents alphabetical order e.g. a-b-c-d-e-f-g-h...
	 * The letters are lowercase
	 */
	public static char[] LOWER_ALPHABETICAL = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
	
	/**
	 * Represent the order of scrabble letters starting with those worth one point finishing to those worth 10 points. In alphabetical order when multiple letters equal the same amount of points.
	 * The letters are lowercase
	 */
	public static char[] LOWER_SCRABBLE_ONETOTEN = new char[]{'a', 'e', 'i','o', 'u', 'l', 'n', 's', 't', 'r', 'd', 'g', 'b', 'c', 'm', 'p', 'f', 'h', 'v', 'w', 'y', 'k', 'j', 'x', 'q', 'z'};
	
	/**
	 * Represent the order of letters on a keyboard e.g. q-w-e-r-t-y-u-i-o-p...
	 * The letters are uppercase
	 */
	
	public static char[] UPPER_KEYBOARD = new char[]{'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P', 'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'Z', 'X', 'C', 'V', 'B', 'N', 'M'};
	/**
	 * Represents a reverse alphabet e.g. z-y-x-w-v-u...
	 * The letters are uppercase
	 */
	
	public static char[] UPPER_ALPHABETICAL_REVERSE = new char[]{'Z', 'Y', 'X', 'W', 'V', 'U', 'T', 'S', 'R', 'Q', 'P', 'O', 'N', 'M', 'L', 'K', 'J', 'I', 'H', 'G', 'F', 'E', 'D', 'C', 'B', 'A'};
	
	/**
	 * Represents alphabetical order e.g. a-b-c-d-e-f-g-h...
	 * The letters are uppercase
	 */
	public static char[] UPPER_ALPHABETICAL = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
	
	/**
	 * Represent the order of scrabble letters starting with those worth one point finishing to those worth 10 points. In alphabetical order when multiple letters equal the same amount of points.
	 * The letters are uppercase
	 */
	public static char[] UPPER_SCRABBLE_ONETOTEN = new char[]{'A', 'E', 'I','O', 'U', 'L', 'N', 'S', 'T', 'R', 'D', 'G', 'B', 'C', 'M', 'P', 'F', 'H', 'V', 'W', 'Y', 'K', 'J', 'X', 'Q', 'Z'};
	
}
