package Exceptions;

public class TimerException extends Exception {

	private String message;
	
	/**
	 * Create a TimerException
	 * @param s the string to print.
	 */
	public TimerException(String s) {
		message = s;
	}

	private static final long serialVersionUID = 7404490930219185485L;

	public String getMessage(){
		return message;
	}
	
}
