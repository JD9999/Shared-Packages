package Reading;

import java.io.PrintStream;

/**
 * A basic Purpose class.
 * Use this class to write extensions of this method where a Purpose class is required.
 */
public class Purpose {

	/**
	 * The text to store in the class
	 */
	protected String text;
	
	/**
	 * The PrintStream to output to. Default is System.out
	 */
	protected PrintStream out;
	
	/**
	 * The PrintStream to send errors to. Default is System.err
	 */
	protected PrintStream error;
	
	/**
	 * Creates a Purpose class, given the text to store
	 * @param text the text to store
	 */
	public Purpose(String text){
		this.out = System.out;
		this.error = System.err;
		this.text = text;
	}
	
	/**
	 * Creates a Purpose class, setting the text, the error stream to print to and the output stream to print to
	 * @param text the text to store
	 * @param errorStream the PrintStream to send errors to
	 * @param outStream the PrintStream to send output to
	 */
	public Purpose(String text, PrintStream errorStream, PrintStream outStream){
		this.out = outStream;
		this.error = errorStream;
		this.text = text;
	}
	
	/**
	 * Redirect the output stream
	 * @param stream the PrintStream to redirect the output to.
	 */
	public void redirectOutTo(PrintStream stream){
		this.out = stream;
	}

	/**
	 * Rdeirect the error stream
	 * @param stream the PrintStream to redirect the errors to.
	 */
	public void redirectErrTo(PrintStream stream){
		this.error = stream;
	}
	
	/**
	 * Does stuff.
	 * In the case of this class, it just prints the text to the output stream.
	 * This is where other implementations of the class would do dofferent things.
	 * @return the text provided.
	 */
	public String perform(){
		this.out.println(text);
		return text;
	}
	
	/**
	 * Prints an error to the error stream
	 * @param error the error
	 */
	public void sendError(String error){
		this.error.println(error);
	}
	
	/**
	 * Prints output to the output stream
	 * @param info the output
	 */
	public void sendInfo(String info){
		this.out.println(info);
	}
	
	/**
	 * Sets the text stored in the purpose
	 * @param text the new text.
	 */
	public void setText(String text){
		this.text = text;
	}
	
}
