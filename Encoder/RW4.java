package Encoder;

/**
 * A proposal of the file encoding for Rainbow Welcome's preference file in V4.0+
 * That is, if it ever gets updated.
 */
public class RW4 implements InvertEncoder{

	/**
	 * Creates an RW4 object.
	 */
	public RW4(){
		
	}
	
	/**
	 * Encodes a string.
	 * First, it inverts the character using the {@link #invert(char)} method.
	 * Then, it gets all the numbers and, using an unchangeable offset of 2, moves all the numbers along.
	 * Each other character is automatically appended to the string.
	 * The string is then returned.
	 * @param input the string to encode
	 * @throws UnknownCharacterException if the {@link #invert(char)} method finds a problem with one of the characters.
	 */
	@Override
	public String encode(String input) throws UnknownCharacterException {
		String fullencode = "";
		String halfencode = "";
		for(int i = 0; i < input.length(); i++){
			char c = input.charAt(i);
			char[] d = invert(c);
			halfencode = halfencode + String.valueOf(d);
		}
		for(int i = 0; i < halfencode.length(); i++){
			char c = halfencode.charAt(i);
			if(c == '0') fullencode = fullencode + "2";
			else if(c == '1') fullencode = fullencode + "3";
			else if(c == '2') fullencode = fullencode + "4";
			else if(c == '3') fullencode = fullencode + "5";
			else if(c == '4') fullencode = fullencode + "6";
			else if(c == '5') fullencode = fullencode + "7";
			else if(c == '6') fullencode = fullencode + "8";
			else if(c == '7') fullencode = fullencode + "9";
			else if(c == '8') fullencode = fullencode + "0";
			else if(c == '9') fullencode = fullencode + "1";
			else fullencode = fullencode + String.valueOf(c);
		}
		return fullencode;
	}

	/**
	 * Decodes the string, doing the opposite of the {@link #encode(String)} method.
	 * @param input the string to decode
	 * @throws UnknownCharacterException if the {@link #invert(char)} method has a problem with one of the characters.
	 */
	@Override
	public String decode(String input) throws UnknownCharacterException {
		String fullencode = "";
		String halfencode = "";
		for(int i = 0; i < input.length(); i++){
			char c = input.charAt(i);
			if(c == '0') halfencode = halfencode + "8";
			else if(c == '1') halfencode = halfencode + "9";
			else if(c == '2') halfencode = halfencode + "0";
			else if(c == '3') halfencode = halfencode + "1";
			else if(c == '4') halfencode = halfencode + "2";
			else if(c == '5') halfencode = halfencode + "3";
			else if(c == '6') halfencode = halfencode + "4";
			else if(c == '7') halfencode = halfencode + "5";
			else if(c == '8') halfencode = halfencode + "6";
			else if(c == '9') halfencode = halfencode + "7";
			else halfencode = halfencode + String.valueOf(c);
		}
		for(int i = 0; i < halfencode.length(); i++){
			char c = halfencode.charAt(i);
			char[] d = invert(c);
			fullencode = fullencode + String.valueOf(d);
		}
		return fullencode;
	}

	/**
	 * Inverts the character code to form an entirely different character. For example, a code "0456" will become "0654"
	 * @param code the code to change
	 * @throws UnknownCharacterException if the code contains a character that is not a number, or it does not lead with a 0
	 */
	@Override
	public int invert(int code) throws UnknownCharacterException {
		String invert = "";
		String c = String.valueOf(code);		
		for(int i = 0; i < c.length(); i++){
			char ch = c.charAt(i);
			if(i == 0){
				invert = invert + ch;
			}else if(Character.isDigit(ch)){
				if(ch == '0') invert = invert + "0";
				else if(ch == '1') invert = invert + "9";
				else if(ch == '2') invert = invert + "8";
				else if(ch == '3') invert = invert + "7";
				else if(ch == '4') invert = invert + "6";
				else if(ch == '5') invert = invert + "5";
				else if(ch == '6') invert = invert + "4";
				else if(ch == '7') invert = invert + "3";
				else if(ch == '8') invert = invert + "2";
				else if(ch == '9') invert = invert + "1";
			}else throw new UnknownCharacterException("Character code is not entirely numbers!");
		}
		int type = Integer.parseInt(invert);
		if(Integer.numberOfLeadingZeros(type) != 0) return type;
		else throw new UnknownCharacterException("Does not lead with a 0!");
	}

	/**
	 * Gets the character code for the character and inverts using the {@link #invert(int)} method.
	 * @param ch the character to invert
	 * @throws UnknownCharacterException see {@link #invert(int)} method for details.
	 */
	@Override
	public char[] invert(char ch) throws UnknownCharacterException {
		int code = invert(Character.codePointAt(new char[]{ch}, 0));
		return Character.toChars(code);
	}

	/**
	 * Returns 0 because RW4 does not use an offset.
	 */
	@Override
	public int getOffset() {
		return 0;
	}

	/**
	 * Sends an error to the console because RW4 does not use an offset.
	 */
	@Override
	public void setOffset(int offset) {
		System.err.println("Error! RW4 encoding does not use an offset!");
	}

	/**
	 * Returns false because RW4 does not use an offset.
	 */
	@Override
	public boolean usesOffset() {
		return false;
	}

}
