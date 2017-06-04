package Encoder;

public class UnknownCharacterException extends Exception {

	private static final long serialVersionUID = 5626634958192024372L;
	private String mes;
	
	/**
	 * Creates an UnknownCharacterException with the message provided
	 * @param message the message to print
	 */
	public UnknownCharacterException(String message){
		mes = message;
	}
	
	/**
	 * Creates an UnknownCharacterException with the problem character
	 * @param c the problem character
	 */
	public UnknownCharacterException(char c){
		mes = "Unable to recognize character:" + c;
	}

	public String getMessage(){
		return mes;
	}
	
}
