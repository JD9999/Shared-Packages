package Reading;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class ProfanitySource {

	private List<String> profanities = new ArrayList<String>();

	/**
	 * Constructs a ProfanitySource object.
	 * Each word must be on a separate line. 
	 * If there is a different separator, use {@link #ProfanitySource(File, String)}
	 * @param f the file to read from
	 * @throws IOException if there is an error reading the file
	 */
	public ProfanitySource(File f) throws IOException{
		this(f, System.getProperty("line.separator"));
	}

	/**
	 * Constructs a ProfanitySource object.
	 * It separates the words by the split.
	 * E.g. the phrase "apples, bananas, oranges" with the separator ", " will result in a list with the three elements.
	 * @param f the file to read from
	 * @param split the way to split the string into the words
	 * @throws IOException if there is an error reading the file
	 */
	public ProfanitySource(File f, String split) throws IOException{
		profanities = readProfanities(f, split);
	}

	/**
	 * Constructs a ProfanitySource object.
	 * It separates the words by the split.
	 * E.g. the phrase "apples,bananas,oranges" with the separator ',' will result in a list with the three elements.
	 * @param f the file to read from
	 * @param split the way to split the string into the words
	 * @throws IOException if there is an error reading the file
	 */
	public ProfanitySource(File f, char split) throws IOException{
		this(f, String.valueOf(split));
	}

	/**
	 * Constructs a ProfanitySource object.
	 * Each word must be on a separate line. 
	 * If there is a different separator, use {@link #ProfanitySource(InputStream, String)}
	 * @param stream the InputStream to read from
	 * @throws IOException if there is an error reading the InputStream
	 */
	public ProfanitySource(InputStream stream) throws IOException{
		this(stream, System.getProperty("line.separator"));
	}

	/**
	 * Constructs a ProfanitySource object.
	 * It separates the words by the split.
	 * E.g. the phrase "apples, bananas, oranges" with the separator ", " will result in a list with the three elements.
	 * @param stream the InputStream to read from
	 * @param split the way to split the string into the words
	 * @throws IOException if there is an error reading the InputStream
	 */
	public ProfanitySource(InputStream stream, String split) throws IOException{
		profanities = readProfanities(stream, split);
	}

	/**
	 * Constructs a ProfanitySource object.
	 * It separates the words by the split.
	 * E.g. the phrase "apples,bananas,oranges" with the separator ',' will result in a list with the three elements.
	 * @param stream the InputStream to read from
	 * @param split the way to split the string into the words
	 * @throws IOException if there is an error reading the InputStream
	 */
	public ProfanitySource(InputStream stream, char split) throws IOException{
		this(stream, String.valueOf(split));
	}

	/**
	 * Constructs a ProfanitySource object.
	 * Each word must be on a separate line. 
	 * If there is a different separator, use {@link #ProfanitySource(URI, String)}
	 * @param uri the URI to read from
	 * @throws IOException if there is an error reading the URI
	 */
	public ProfanitySource(URI uri) throws IOException{
		this(uri, System.getProperty("line.separator"));
	}

	/**
	 * Constructs a ProfanitySource object.
	 * It separates the words by the split.
	 * E.g. the phrase "apples, bananas, oranges" with the separator ", " will result in a list with the three elements.
	 * @param uri the URI to read from
	 * @param split the way to split the string into the words
	 * @throws IOException if there is an error reading the URI
	 */
	public ProfanitySource(URI uri, String split) throws IOException{
		profanities = readProfanities(uri.toURL().openStream(), split);
	}

	/**
	 * Constructs a ProfanitySource object.
	 * It separates the words by the split.
	 * E.g. the phrase "apples,bananas,oranges" with the separator ',' will result in a list with the three elements.
	 * @param uri the URI to read from
	 * @param split the way to split the string into the words
	 * @throws IOException if there is an error reading the URI
	 */
	public ProfanitySource(URI uri, char split) throws IOException{
		this(uri, String.valueOf(split));
	}

	/**
	 * Constructs a ProfanitySource with the default profanities.
	 * The list is mostly copied of DIW's default list in his censor plugin.
	 * They are: shit, fuck, damn, bitch, crap, piss, dick, pussy, ass, fag, bastard, slut, douche, anyádat, malacca, retard, freak
	 */
	public ProfanitySource(){
		profanities = defaultProfanities();
	}

	/**
	 * Constrcuts a ProfanitySource with the profanities listed
	 * @param profanities the list of strings to remove
	 */
	public ProfanitySource(List<String> profanities){
		this.profanities = profanities;
	}

	private List<String> readProfanities(File file, String split) throws IOException {
		List<String> profanities = new ArrayList<String>();
		String contents = new String(Files.readAllBytes(file.toPath()));
		String[] array = contents.split(split);
		for(String word : array) profanities.add(word);
		return profanities;
	}

	private List<String> readProfanities(InputStream stream, String split) throws IOException {
		List<String> ls = new ArrayList<String>();
		String line = null;
		InputStreamReader inReader = new InputStreamReader(stream);
		BufferedReader reader = new BufferedReader(inReader);
		while((line = reader.readLine())!=null){
			for(String s : line.split(split))ls.add(s);
		}
		return ls;
	}

	/**
	 * Get all the profanities
	 * @return the profanities
	 */
	public List<String> getAllProfanities() {
		return profanities;
	}

	/**
	 * Add a profanity to the list
	 * @param profanity the profanity to add
	 */
	public void addProfanity(String profanity){
		profanities.add(profanity);
	}

	/**
	 * Remove a profanity from the list
	 * @param profanity the profanity to remove
	 */
	public void removeProfanity(String profanity){
		profanities.remove(profanity);
	}

	/**
	 * Set all the profanities in the list.
	 * @param profanities the new list of profanities
	 */
	public void setProfanities(List<String> profanities){
		this.profanities = profanities;
	}

	/**
	 * Gets all the default profanities as listed at {@link #ProfanitySource()}
	 * @return the list of defaults.
	 */
	public static List<String> defaultProfanities(){
		List<String> ls = new ArrayList<String>();
		//If a word starts with this, CANCEL IT!
		ls.add("shit");
		ls.add("fuck");
		ls.add("damn");
		ls.add("bitch");
		ls.add("crap");
		ls.add("piss");
		ls.add("dick");
		ls.add("pussy");
		ls.add("ass");
		ls.add("fag");
		ls.add("bastard");
		ls.add("slut");
		ls.add("douche");
		ls.add("anyádat");
		ls.add("malacca");
		ls.add("retard");
		ls.add("freak");

		return ls;
	}

	/**
	 * Creates an empty ProfanitySource
	 * @return an empty ProfanitySource
	 */
	public static ProfanitySource emptyProfanitySource(){
		return new ProfanitySource(new ArrayList<String>());
	}

	/**
	 * Filter each line with the profanities in the file.
	 * This method removes them. Using the ProfanitySource in the MessagePurpose class, they get replaced with "****" instead.
	 * @param line the line to filter out
	 * @return a clean line
	 */
	public String filter(String line) {
		String filtered = line;
		for(String s : profanities){
			filtered = filtered.replace(s, "");
		}
		filtered = filtered.replace("  ", " ");
		return filtered;
	}

}
