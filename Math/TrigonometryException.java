package Math;

/**
 * The exception related to trigonometry errors
 */
public class TrigonometryException extends Exception {

	String message;
	
	/**
	 * The constructor
	 * @param string the message to come up
	 */
	public TrigonometryException(String string) {
		message = string;
	}

	private static final long serialVersionUID = 4916560792104825371L;

	public String getMessage(){
		return message;
	}
	
}
