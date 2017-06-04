package TestSharedPackages;

import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;

import Reading.Purpose;

/**
 * The entry point for the executable.
 * It sets up the GUI and launches all of the testers that are asked for.
 */
public class Entry {

	public static File file1 = new File("file.txt");
	public static ByteArrayOutputStream stream;
	private static JTextArea outputArea;
	private static JTextArea errorArea;
	private static String s = "";

	public static void main(String[] args) {
		buildFrame();
		TextPrintStream outStream = new TextPrintStream(false, outputArea);
		Purpose p = new Purpose("Random testing text!");
		p.redirectOutTo(outStream);
		System.setOut(outStream);
		p.sendInfo("Information should be on the LEFT!");
		TextPrintStream errorStream = new TextPrintStream(true, errorArea);
		p.redirectErrTo(errorStream);
		System.setErr(errorStream);
		p.sendError("Errors should be on the RIGHT!");
		System.setOut(outStream);
		System.setErr(errorStream);
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(file1));
			writer.write("TestString.make90");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		if(requestInput("Converter")) ConverterTester.main(args);
		if(requestInput("Date")) DateTester.main(args);
		if(requestInput("Encoder"))	EncoderTester.main(args);
		if(requestInput("Math")) MathTester.main(args);
		if(requestInput("Readandwrite")) ReadandwriteTester.main(args);
		if(requestInput("Reading")) ReadingTester.main(args);
		if(requestInput("Timers")) TimersTester.main(args);
		System.out.println("------------------------------------------------------------");
		System.out.println("End of tester. Copy what you want and then close the tester.");
		System.out.println("------------------------------------------------------------");
	}

	private static void buildFrame() {
		JFrame frame = new JFrame();
		JSplitPane pane = new JSplitPane();
		JTextArea outputArea = new JTextArea();
		JTextArea errorArea = new JTextArea();
		Entry.outputArea = outputArea;
		Entry.errorArea = errorArea;
		Entry.outputArea.addKeyListener(getKeyListener());
		outputArea.setName("output");
		errorArea.setName("error");
		JScrollPane outPane = new JScrollPane(outputArea);
		JScrollPane errPane = new JScrollPane(errorArea);
		pane.setLeftComponent(outPane);
		pane.setRightComponent(errPane);
		frame.add(pane);
		frame.setSize(800, 600);
		frame.setPreferredSize(new Dimension(800, 600));
		frame.pack();
		pane.setDividerLocation(0.5);
		frame.setTitle("SharedPackages testing frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	private static KeyListener getKeyListener() {
		return new KeyListener(){

			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_Y){
					s = "Y";
				}else if(e.getKeyCode() == KeyEvent.VK_N){
					s = "N";
				}else if(e.getKeyCode() == KeyEvent.VK_Q){
					s = "Q";
				}else if(e.getKeyCode() == KeyEvent.VK_ENTER || e.getKeyCode() == KeyEvent.VK_SHIFT){
					
				}else System.out.println("Please type Y to continue, N to skip or Q to quit");
			}

			@Override
			public void keyReleased(KeyEvent e) {
			}

			@Override
			public void keyTyped(KeyEvent e) {
			}
			
		};
	}

	private static boolean requestInput(String tester) {
		System.out.println("Type 'y' to continue, 'n' to skip or 'q' to quit");
		System.out.println("Next tester in cue: " + tester);
		while(s.equals("")){
			outputArea.append("");
		}
		if(s.equals("Y")){
			s = "";
			return true;
		}else if(s.equals("N")){
			s = "";
			return false;
		}else if(s.equals("Q")){
			System.exit(0);
			s = "";
			return false;
		}else{
			s = "";
			return requestInput(tester);
		}
	}

	/**
	 * Gets the last line in the output area.
	 * @return the last line.
	 */
	public static String readLastLineInStream() {
		String text = outputArea.getText();
		String[] lines = text.split(System.getProperty("line.separator"));
		String line = lines[lines.length - 1];
		return line;
	}

	/**
	 * Add this to the output area.
	 * @param output the string to add to the console.
	 */
	public static void addOutput(String output) {
		outputArea.append(output);
	}
	
	/**
	 * Make the user press "y" before continuing.
	 */
	public static void requestApproval(){
		System.out.println("Type y when ready!");
		while(s.equals("")){
			outputArea.append("");
		}
		if(s.equals("Y")){
			s = "";
			return;
		}else{
			s = "";
			requestApproval();
		}
	}

}
