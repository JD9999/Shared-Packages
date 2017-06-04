package Encoder;

/**
 * An encoder that works by "inverting" a character or character code.
 * You can see how this works in the RW4 class, but rather than having a fixed offset, the character changes by what the character is.
 */
public interface InvertEncoder extends Encoder{
	
	/**
	 * Inverts a character code
	 * @param code the code to invert
	 * @return the inverted code
	 * @throws UnknownCharacterException if either the given code or the converted code is not a character.
	 */
	public int invert(int code) throws UnknownCharacterException;
	
	/**
	 * Inverts a character 
	 * @param ch the character to invert
	 * @return the inverted character
	 * @throws UnknownCharacterException if either the given character or the converted character is not a character.
	 */
	public char[] invert(char ch) throws UnknownCharacterException;
	
}
