package Encoder;

/**
 * Switches letters with other letters, from a 26-letter alphabet.
 * For example, with an offset of 2, a = c and b = d.
 * Uses the Encoder interface, however there is an option to use charset instead of offset.
 * This is specified by the {@link #setOverruleOffset(boolean)} method. 
 * Some examples of charsets are in the {@link LetterEncodings} enum
 */
public class TwentySixLetterEncoder implements Encoder{

	private char[] defaultLowerCharset = LetterEncodings.LOWER_ALPHABETICAL;
	private char[] defaultUpperCharset = LetterEncodings.UPPER_ALPHABETICAL;
	private int offset = 2;
	private char[] lowerSet;
	private char[] upperSet;
	private boolean overrule;

	/**
	 * Creates the default TwentySixLetterEncoder object.
	 * The offset is set to true and overrule is set to false
	 */
	public TwentySixLetterEncoder(){
		this.offset = 2;
		this.overrule = false;
	}


	/**
	 * Creates a TwentySixLetterEncoder object
	 * Overrule is set to false
	 * @param offset the offset to use
	 */
	public TwentySixLetterEncoder(int offset){
		/*
		if(offset < 27 && offset > 0)this.offset = offset;
		else throw new IllegalArgumentException("Offset can only be between 1 and 26 (though 26 does nothing)");
		 */
		while(offset > 25){
			offset = offset - 26;
		}
		while(offset < 0){
			offset = offset + 26;
		}
		this.offset = offset;
		this.overrule = false;
	}

	/**
	 * Creates a TwentySixLetterEncoder object.
	 * Overrule is set to TRUE. This means that offset will be ignored, and it will instead use charsets,
	 * For example, c is the third character in the alphabet. So it will pick the third character in the lowerSet to replace it with.
	 * Examples of charsets are found in the {@link LetterEncodings} enum.
	 * It is conventional to use the same encoding for both sets (e.g. LOWER_ALPHABETICAL and UPPER_ALPHABETICAL)
	 * @param lowerSet the lowercase set to encode with
	 * @param upperSet the uppercase set to encode with
	 * @throws UnknownCharacterException if either sets have characters that are not letters.
	 */
	public TwentySixLetterEncoder(char[] lowerSet, char[] upperSet) throws UnknownCharacterException{
		this.overrule = true;
		setLowerCharset(lowerSet);
		setUpperCharset(upperSet);
	}

	/**
	 * Gets the offset that is being used
	 * @return the offset
	 */
	@Override
	public int getOffset() {
		return offset;
	}

	/**
	 * Sets the offset to use
	 * @param offset the offset to use
	 */
	@Override
	public void setOffset(int offset) {
		while(offset > 25){
			offset = offset - 26;
		}
		while(offset < 0){
			offset = offset + 26;
		}
		this.offset = offset;
	}

	/**
	 * Checks whether an offset is used.
	 * @return whether there is an offset or not
	 */
	@Override
	public boolean usesOffset() {
		return offset != 0;
	}

	/**
	 * Gets the lowercase charset used
	 * @return char[] the charset used.
	 */
	public char[] getLowerCharset(){
		if(lowerSet !=null) return lowerSet;
		else return defaultLowerCharset;
	}

	/**
	 * Sets the lower letter charset.
	 * @param charset the lowercase charset to set
	 * @throws UnknownCharacterException if a character is not a letter
	 */
	public void setLowerCharset(char[] charset) throws UnknownCharacterException{
		for(int i = 0; i < charset.length; i++){
			char c = charset[i];
			if(!Character.isLetter(c)) throw new UnknownCharacterException(c + " Is not a letter!");
		}
		if(charset.length == 26)lowerSet = charset;
		else throw new IllegalArgumentException("charset must be 26 characters long!");
	}

	/**
	 * Gets the uppercase charset used
	 * @return char[] the charset used.
	 */
	public char[] getUpperCharset(){
		if(upperSet !=null) return upperSet;
		else return defaultUpperCharset;
	}

	/**
	 * Sets the upper letter charset.
	 * @param charset the uppercase charset to set
	 * @throws UnknownCharacterException if a character is not a letter
	 */
	public void setUpperCharset(char[] charset) throws UnknownCharacterException{
		for(int i = 0; i < charset.length; i++){
			char c = charset[i];
			if(!Character.isLetter(c)) throw new UnknownCharacterException(c + " is not a letter!");
		}
		if(charset.length == 26)upperSet = charset;
		else throw new IllegalArgumentException("charset must be 26 characters long!");
	}

	/**
	 * Sets whether to use the offset or to use the two charsets.
	 * @param overrule if false, use offset. If true, use charsets.
	 */
	public void setOverruleOffset(boolean overrule){
		this.overrule = overrule;
	}

	/**
	 * Encodes the string.
	 * This works differently whether it is set to overrule or not (see {@link #setOverruleOffset(boolean)} for details).
	 * If overrule is off, the characters will be selected by moving along the alphabet.
	 * For example, with an offset of 2 (the default offset), "a" will become "c" and "j" will become "l".
	 * If overrule is on, the characters will be selected by their alphabetical index (-1) in their specific case from the required charset.
	 * For example, f is the 6th character. So it will go to the lowercase charset and pick out the 6th character (at index 5), and replace it with that character.
	 * @param string the string to encode
	 * @throws UnknownCharacterException if the character is a letter that is not recognised. Note that this is in ENGLISH.
	 */
	@Override
	public String encode(String string) throws UnknownCharacterException {
		String encodedString = "";
		if(overrule){
			for(int i = 0; i < string.length(); i++){
				char d;
				char c = string.charAt(i);
				if(Character.isLetter(c)){
					if(Character.isLowerCase(c)){
						if(c == 'a') d = lowerSet[0];
						else if(c == 'b') d = lowerSet[1];
						else if(c == 'c') d = lowerSet[2];
						else if(c == 'd') d = lowerSet[3];
						else if(c == 'e') d = lowerSet[4];
						else if(c == 'f') d = lowerSet[5];
						else if(c == 'g') d = lowerSet[6];
						else if(c == 'h') d = lowerSet[7];
						else if(c == 'i') d = lowerSet[8];
						else if(c == 'j') d = lowerSet[9];
						else if(c == 'k') d = lowerSet[10];
						else if(c == 'l') d = lowerSet[11];
						else if(c == 'm') d = lowerSet[12];
						else if(c == 'n') d = lowerSet[13];
						else if(c == 'o') d = lowerSet[14];
						else if(c == 'p') d = lowerSet[15];
						else if(c == 'q') d = lowerSet[16];
						else if(c == 'r') d = lowerSet[17];
						else if(c == 's') d = lowerSet[18];
						else if(c == 't') d = lowerSet[19];
						else if(c == 'u') d = lowerSet[20];
						else if(c == 'v') d = lowerSet[21];
						else if(c == 'w') d = lowerSet[22];
						else if(c == 'x') d = lowerSet[23];
						else if(c == 'y') d = lowerSet[24];
						else if(c == 'z') d = lowerSet[25];
						else throw new UnknownCharacterException("Cannot recognize character:" + c);
						encodedString = encodedString + String.valueOf(d);
					}else{
						if(c == 'A') d = upperSet[0];
						else if(c == 'B') d = upperSet[1];
						else if(c == 'C') d = upperSet[2];
						else if(c == 'D') d = upperSet[3];
						else if(c == 'E') d = upperSet[4];
						else if(c == 'F') d = upperSet[5];
						else if(c == 'G') d = upperSet[6];
						else if(c == 'H') d = upperSet[7];
						else if(c == 'I') d = upperSet[8];
						else if(c == 'J') d = upperSet[9];
						else if(c == 'K') d = upperSet[10];
						else if(c == 'L') d = upperSet[11];
						else if(c == 'M') d = upperSet[12];
						else if(c == 'N') d = upperSet[13];
						else if(c == 'O') d = upperSet[14];
						else if(c == 'P') d = upperSet[15];
						else if(c == 'Q') d = upperSet[16];
						else if(c == 'R') d = upperSet[17];
						else if(c == 'S') d = upperSet[18];
						else if(c == 'T') d = upperSet[19];
						else if(c == 'U') d = upperSet[20];
						else if(c == 'V') d = upperSet[21];
						else if(c == 'W') d = upperSet[22];
						else if(c == 'X') d = upperSet[23];
						else if(c == 'Y') d = upperSet[24];
						else if(c == 'Z') d = upperSet[25];
						else throw new UnknownCharacterException("Cannot recognize character:" + c);
						encodedString = encodedString + String.valueOf(d);
					}

				}else encodedString = encodedString + String.valueOf(c);
			}
		}else{
			int d = 0;
			for(int i = 0; i < string.length(); i++){
				char c = string.charAt(i);
				if(Character.isLetter(c)){
					if(Character.isLowerCase(c)){
						if(c == 'a') d = offset;
						else if(c == 'b') d = offset + 1;
						else if(c == 'c') d = offset + 2;
						else if(c == 'd') d = offset + 3;
						else if(c == 'e') d = offset + 4;
						else if(c == 'f') d = offset + 5;
						else if(c == 'g') d = offset + 6;
						else if(c == 'h') d = offset + 7;
						else if(c == 'i') d = offset + 8;
						else if(c == 'j') d = offset + 9;
						else if(c == 'k') d = offset + 10;
						else if(c == 'l') d = offset + 11;
						else if(c == 'm') d = offset + 12;
						else if(c == 'n') d = offset + 13;
						else if(c == 'o') d = offset + 14;
						else if(c == 'p') d = offset + 15;
						else if(c == 'q') d = offset + 16;
						else if(c == 'r') d = offset + 17;
						else if(c == 's') d = offset + 18;
						else if(c == 't') d = offset + 19;
						else if(c == 'u') d = offset + 20;
						else if(c == 'v') d = offset + 21;
						else if(c == 'w') d = offset + 22;
						else if(c == 'x') d = offset + 23;
						else if(c == 'y') d = offset + 24;
						else if(c == 'z') d = offset + 25;
						else throw new UnknownCharacterException("Character should've been decoded before re-encoding it! Cannot recognize character:" + c);
						if(d >= 26) d = d - 26;
						encodedString = encodedString + String.valueOf(defaultLowerCharset[d]);
					}else{
						if(c == 'A') d = offset;
						else if(c == 'B') d = offset + 1;
						else if(c == 'C') d = offset + 2;
						else if(c == 'D') d = offset + 3;
						else if(c == 'E') d = offset + 4;
						else if(c == 'F') d = offset + 5;
						else if(c == 'G') d = offset + 6;
						else if(c == 'H') d = offset + 7;
						else if(c == 'I') d = offset + 8;
						else if(c == 'J') d = offset + 9;
						else if(c == 'K') d = offset + 10;
						else if(c == 'L') d = offset + 11;
						else if(c == 'M') d = offset + 12;
						else if(c == 'N') d = offset + 13;
						else if(c == 'O') d = offset + 14;
						else if(c == 'P') d = offset + 15;
						else if(c == 'Q') d = offset + 16;
						else if(c == 'R') d = offset + 17;
						else if(c == 'S') d = offset + 18;
						else if(c == 'T') d = offset + 19;
						else if(c == 'U') d = offset + 20;
						else if(c == 'V') d = offset + 21;
						else if(c == 'W') d = offset + 22;
						else if(c == 'X') d = offset + 23;
						else if(c == 'Y') d = offset + 24;
						else if(c == 'Z') d = offset + 25;
						else throw new UnknownCharacterException("Character should've been decoded before re-encoding it! Cannot recognize character:" + c);
						if(d >= 26) d = d - 26;
						encodedString = encodedString + String.valueOf(defaultUpperCharset[d]);
					}

				}else encodedString = encodedString + String.valueOf(c);

			}
		}
		return encodedString;
	}

	/**
	 * Decodes a string.
	 * It reverses some private variables.
	 * Then it encodes per the {@link #encode(String)} method.
	 * And finally resets any changed variables.
	 * @param string the string to decode
	 * @throws UnknownCharacterException see {@link #encode(String)} for details.
	 */
	@Override
	public String decode(String string) throws UnknownCharacterException {
		if(overrule){
			char[] d = defaultLowerCharset;
			char[] u = defaultUpperCharset;
			defaultLowerCharset = lowerSet;
			defaultUpperCharset = upperSet;
			String dstring = encode(string);
			defaultLowerCharset = d;
			defaultUpperCharset = u;
			return dstring;
		}else{
			int offset = this.offset;
			setOffset(26 - this.offset);
			String code = encode(string);
			setOffset(offset);
			return code;
		}
	}

	/**
	 * Checks whether the character is a letter or not
	 * @param c the character to check
	 * @return whether it is a letter or not.
	 */
	public boolean isLetter(char c) {
		return Character.isLetter(c);
	}

}
