package Reading;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Reading.FilterReader;
import Reading.ProfanitySource;
import Reading.Purpose;

/**
 * A Purpose for strings and, more specifically, formatted messages.
 */
public class MessagePurpose extends Purpose{

	private PurposeFormat format;
	private ProfanitySource profSource;
	
	/**
	 * Creates a MessagePurpose object.
	 * @param text an example string.
	 */
	public MessagePurpose(String text){
		this(text, 2, new ProfanitySource(new ArrayList<String>()));
	}

	/**
	 * Creates a MessagePurpose object.
	 * The key will be used to determine whether to replace variables or check for inaccurate dates.
	 * @param text an example string.
	 * @param key the key representing the {@link PurposeFormat} for the string to be formatted in
	 */
	public MessagePurpose(String text, int key){
		this(text, new PurposeFormat(key), new ProfanitySource(new ArrayList<String>()));
	}
	
	/**
	 * Creates a MessagePurpose object.
	 * @param text an example string.
	 * @param source the list of strings to asterisk out.
	 */
	public MessagePurpose(String text, ProfanitySource source){
		this(text, 2, source);
	}
	
	/**
	 * Creates a MessagePurpose object.
	 * @param text an example string.
	 * @param key the key to create the PurposeFormat with
	 * @param source the ProfanitySource to asterisk words by.
	 */
	public MessagePurpose(String text, int key, ProfanitySource source){
		this(text, new PurposeFormat(key), source);
	}
	
	/**
	 * Creates a MessagePurpose object.
	 * @param text an example string.
	 * @param format the PurposeFormat to format with
	 */
	public MessagePurpose(String text, PurposeFormat format){
		this(text, format, new ProfanitySource(new ArrayList<String>()));
	}
	
	/**
	 * Creates a MessagePurpose object.
	 * @param text an example string.
	 * @param purposeFormat the format to filter with
	 * @param source the ProfanitySource to asterisk words by.
	 */
	public MessagePurpose(String text, PurposeFormat purposeFormat,
			ProfanitySource source) {
		super(text);
		format = purposeFormat;
		profSource = source;
	}

	/**
	 * Get the associated PurposeFormat object
	 * @return the PurposeFormat.
	 */
	public PurposeFormat obtainFormat(){
		return format;
	}

	/**
	 * Handles formatting and filtering the string for the required purpose.
	 * 
	 * If the string has a format then it will do formatting checks.
	 * 
	 * The first formatting check is whether to replace variables or not.
	 * If so, the variables that are found are replaced. The variables are as follows:
	 * 	- %DATE% - get the current date in dd/mm/yy format
	 * 	- %TIME% - get the current time in hh:mm:ss format
	 * 	- %VERSION% - get the current java version, represented in 1.majorversion.minorversion_build or in JRE9+ majorversion.minorversion_build
	 * 
	 * The next formatting check is whether the string may contain a date
	 * If so, the date will be replaced with the current date, in the format specified above.
	 * Your date placeholder must also be in the format specified above.
	 */
	public String perform(){
		String string = text;
		if(!format.hasNoFormat()){
			if(format.containsVariables()) string = locateAndReplaceVariables(text);
			if(format.containsDate()) string = checkDateIndex(string);
		}
		if(profSource.getAllProfanities().size() > 0)replaceAllProfanities(profSource, string);
		return string;
	}
	
	/**
	 * Creates a MessagePurpose object based off the parsed properties of the string
	 * @param s the string to parse
	 * @param profCheck whether to include a default ProfanitySource or not
	 * @return the MessagePurpose object
	 */
	public static MessagePurpose forString(String s, boolean profCheck){
		PurposeFormat format;
		boolean args = !locateAndReplaceVariables(s).equals(s);
		boolean containsDate = !checkDateIndex(s).equals(s);
		if(containsDate){
			if(args){
				format = new PurposeFormat(PurposeFormat.CONTAINS_DATE_AND_OTHER_VARIABLES);
			}else{
				format = new PurposeFormat(PurposeFormat.CONTAINS_DATE);
			}
		}else{
			if(args){
				format = new PurposeFormat(PurposeFormat.CONTAINS_VARIABLES);
			}else{
				format = new PurposeFormat(PurposeFormat.PLAIN_TEXT);
			}
		}
		ProfanitySource source = profCheck ? new ProfanitySource() : new ProfanitySource(new ArrayList<String>());
		return new MessagePurpose(s, format, source);
	}

	private static String locateAndReplaceVariables(String mes) {
		String r = "";
		if(!mes.contains("&") && !mes.contains("%")) return mes;
		else{
			String[] keywords = {"date", "time", "version"};
			for(String word : keywords){
				r.replaceAll("%" + word + "%", key(word));
				r.replaceAll("&" + word + "&", key(word));
			}
		}
		return r;
	}

	private static String key(String word) {
		Date date = new Date();
		if(word.equalsIgnoreCase("date")){
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
			String dateString = formatter.format(new Date());
			return dateString;
		}else if(word.equalsIgnoreCase("time")){
			int hour = date.getHours();
			int min = date.getMinutes();
			int sec = date.getSeconds();
			return String.valueOf(hour) + ":" + String.valueOf(min) + ":" + String.valueOf(sec);
		}else if(word.equalsIgnoreCase("version")){
			return Runtime.class.getPackage().getSpecificationVersion();
		}else return word;
	}

	private static String replaceAllProfanities(ProfanitySource profanitySource,
			String mes) {
		List<String> profanities = profanitySource.getAllProfanities();
		return FilterReader.asterikWordsFromString(mes, profanities);
	}

	private static String checkDateIndex(String t) {
		StringBuilder builder = new StringBuilder(t.length());
		int advance = 0;
		int storea = 0;
		int storeb = 0;
		for(int i = 0; i < t.length(); i++){
			if(advance > 0){
				advance--;
				continue;
			}
			char ch = t.charAt(i);
			builder.append(ch);
			if(ch == '/'){
				if(storea == 0) storea = i;
				else if(storeb == 0){
					storeb = i;
					int storec = storea;
					if(((storec + 2) == storeb) || ((storec + 3) == storeb)){
						int st = storea - 2;
						int en = storeb + 3;
						String potential = t.substring(st, en);
						if(isPotentionallyDate(potential)) {
							SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
							String date = formatter.format(new Date());
							//Build the other characters into the builder and then devance them
							builder.append(t.charAt(i + 1));
							builder.append(t.charAt(i + 2));
							advance = 2;
							builder = builder.replace(st, en, date);
							storea = 0;
							storeb = 0;
						}
						storea = i;
						storeb = 0;
					}
					storea = i;
					storeb = 0;
				}else{
					storea = i;
					storeb = 0;
				}
			}
		}
		return builder.toString();
	}

	private static boolean isPotentionallyDate(String potential) {
		char[] array = potential.toCharArray();
		for(char c : array){
			if(c != '/') {
				if(Character.isDigit(c)) continue;
				else return false;
			}else continue;
		}
		return true;
	}

	/**
	 * Get the ProfanitySource related with the MessagePurpose
	 * @return the PRofanitySource
	 */
	public ProfanitySource obtainSource() {
		return profSource;
	}
	
}
