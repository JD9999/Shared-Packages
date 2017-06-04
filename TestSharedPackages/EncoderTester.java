package TestSharedPackages;

import java.io.File;
import java.io.IOException;

import Encoder.AllEncoderBasic;
import Encoder.LetterEncodings;
import Encoder.RW4;
import Encoder.TwentySixLetterEncoder;
import Encoder.UnknownCharacterException;

/**
 * The built-in tester for testing the Encoder package.
 */
public class EncoderTester {

	public static void main(String[] args) {
		boolean error = false;
		boolean error11 = false;
		boolean error12 = false;
		boolean error13 = false;
		boolean error21 = false;
		boolean error22 = false;
		boolean error31 = false;
		boolean error32 = false;
		boolean error33 = false;
		boolean error34 = false;
		boolean error35 = false;
		System.out.println("Testing Encoder package!");
		File output = new File("output.aeb");
		AllEncoderBasic all = null;
		try {
			if(!output.exists()) output.createNewFile();
			all = new AllEncoderBasic(output);
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		RW4 rw4 = new RW4();
		TwentySixLetterEncoder letter = new TwentySixLetterEncoder(4);

		System.out.println("Testing class 1 of 3: AllEncoderBasic");
		System.out.println("Commencing test 1 of 3: Encoding and decoding a basic sentence");
		try {
			String codeall = all.encode("This is a sentence");
			String decode = all.decode(codeall);
			if(decode.equals("This is a sentence")) System.out.println("Encoding and decoding a basic sentence complete!");
			else{
				System.out.println("FAILURE! Unable to encode and decode a basic sentence");
				error11 = true;
				error = true;
			}
		} catch (UnknownCharacterException e) {
			e.printStackTrace();
		}
		System.out.println("Commencing test 2 of 3: Encoding and decoding with a high offset");
		all.setOffset(200);
		try {
			String codeall = all.encode("This is a sentence;");
			String decode = all.decode(codeall);
			if(decode.equals("This is a sentence;")) System.out.println("Encoding and decoding with a high offset complete!");
			else{
				System.out.println("FAILURE! Unable to encode and decode with a high offset");
				error12 = true;
				error = true;
			}
		} catch (UnknownCharacterException e) {
			e.printStackTrace();
		}
		System.out.println("Commencing test 3 of 3: Encoding and decoding externally with normal offset");
		all.setOffset(2);
		try {
			String codeall = all.encodeTo("This is a SENTENCE!", new File("encodeto.txt"));
			String decode = all.decodeTo(codeall, new File("decodeto.txt"));
			if(decode.equals("This is a SENTENCE!")) System.out.println("Encoding and decoding externally with normal offset complete!");
			else{
				System.out.println("FAILURE! Unable to encode and decode externally with normal offset");
				error13 = true;
				error = true;
			}
		} catch (IOException | UnknownCharacterException e) {
			e.printStackTrace();
		}

		System.out.println("Testing class 2 of 3: RW4");
		System.out.println("Commencing test 1 of 2: Encoding and decoding a basic sentence");
		try {
			String codeall = rw4.encode("This is a sentence");
			String decode = rw4.decode(codeall);
			if(decode.equals("This is a sentence")) System.out.println("Encoding and decoding a basic sentence complete!");
			else{
				System.out.println("FAILURE! Unable to encode and decode a basic sentence");
				error21 = true;
				error = true;
			}
		} catch (UnknownCharacterException e) {
			e.printStackTrace();
		}
		System.out.println("Commencing test 2 of 2: Encoding and decoding externally with normal offset");
		try {
			String codeall = rw4.encodeTo("This is a SENTENCE!", new File("encodeto.txt"));
			String decode = rw4.decodeTo(codeall, new File("decodeto.txt"));
			if(decode.equals("This is a SENTENCE!")) System.out.println("Encoding and decoding externally with normal offset complete!");
			else{
				System.out.println("FAILURE! Unable to endcode and decode externally with normal offset");
				error22 = true;
				error = true;
			}
		} catch (IOException | UnknownCharacterException e) {
			e.printStackTrace();
		}
		//-----
		System.out.println("Testing class 3 of 3: TwentySixLetterEncoder");
		System.out.println("Commencing test 1 of 5: Encoding and decoding a basic sentence");
		try {
			String codeall = letter.encode("This is a sentence");
			String decode = letter.decode(codeall);
			if(decode.equals("This is a sentence")) System.out.println("Encoding and decoding a basic sentence complete!");
			else{
				System.out.println("FAILURE! Unable to encode and decode a basic sentence");
				error31 = true;
				error = true;
			}
		} catch (UnknownCharacterException e) {
			e.printStackTrace();
		}
		System.out.println("Commencing test 2 of 5: Getting and setting the array to encode by");
		try {
			letter.setLowerCharset(LetterEncodings.LOWER_KEYBOARD);
			letter.setUpperCharset(LetterEncodings.UPPER_KEYBOARD);
			if(letter.getLowerCharset() == LetterEncodings.LOWER_KEYBOARD && letter.getUpperCharset() == LetterEncodings.UPPER_KEYBOARD) System.out.println("Getting and setting the array to encode by complete!");
			else{
				System.out.println("FAILURE! Unable to get and set the array to encode by");
				error32 = true;
				error = true;
			}
		} catch (UnknownCharacterException e1) {
			e1.printStackTrace();
		}
		System.out.println("Commencing test 3 of 5: Checking whether a character is a letter or not");
		boolean l = letter.isLetter('a');
		boolean nl = letter.isLetter('.');
		if(l && !nl) System.out.println("Checking whether a character is a letter or not complete!");
		else{
			System.out.println("FAILURE! Unable to check whether a character is a letter or not");
			error33 = true;
			error = true;
		}
		System.out.println("Commencing test 4 of 5: Overruling the offset");
		letter.setOverruleOffset(false);
		letter.setOffset(2);
		try {
			String encoding = letter.encode("Pq");
			letter.setOffset(22);
			String code = letter.encode(encoding);
			if(code.equals("No")){
				letter.setOverruleOffset(true);
				letter.setOffset(5);
				letter.setLowerCharset(LetterEncodings.LOWER_ALPHABETICAL);
				letter.setUpperCharset(LetterEncodings.UPPER_ALPHABETICAL);
				String code2 = letter.encode(code);
				if(code2.equals("No")) System.out.println("Overruling the offset complete!");
				else{
					System.out.println("FAILURE! Unable to overrule the offset");
					error34 = true;
					error = true;
				}
			}else{
				System.out.println("FAILURE! Unable to overrule the offset");
				error34 = true;
				error = true;
			}

		} catch (UnknownCharacterException e1) {
			e1.printStackTrace();
		}
		letter.setOverruleOffset(false);
		letter.setOffset(4);
		System.out.println("Commencing test 5 of 5: Encoding and decoding externally with normal offset");
		try {
			String codeall = letter.encodeTo("This is a SENTENCE!", new File("encodeto.txt"));
			String decode = letter.decodeTo(codeall, new File("decodeto.txt"));
			if(decode.equals("This is a SENTENCE!")) System.out.println("Encoding and decoding externally with normal offset complete!");
			else{
				System.out.println("FAILURE! Unable to encode and decode externally with normal offset");
				error35 = true;
				error = true;
			}
		} catch (IOException | UnknownCharacterException e) {
			e.printStackTrace();
		}

		if(!error) System.out.println("No errors!");
		else{
			if(error11) System.err.println("Failure with AllEncoderBasic, unable to encode and decode a basic sentence");
			if(error12) System.err.println("Failure with AllEncoderBasic, unable to encode and decode with a high offset");
			if(error13) System.err.println("Failure with AllEncoderBasic, unable to encode and decode externally with normal offset");
			if(error21) System.err.println("Failure with RW4, unable to encode and decode a basic sentence");
			if(error22) System.err.println("Failure with RW4, unable to encode and decode externally with normal offset");
			if(error31) System.err.println("Failure with TwentySixLetterEncoder, unable to encode and decode a basic sentence");
			if(error32) System.err.println("Failure with TwentySixLetterEncoder, unable to get and set the array to encode by");
			if(error33) System.err.println("Failure with TwentySixLetterEncoder, unable to check whether a character is a letter or not");
			if(error34) System.err.println("Failure with TwentySixLetterEncoder, unable to overrule the offset");
			if(error35) System.err.println("Failure with TwentySixLetterEncoder, unable to encode and decode externally with normal offset");
		}
	}

}
