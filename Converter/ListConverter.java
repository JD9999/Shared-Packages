package Converter;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Converts a list to different collections.
 * @param <T> The type of list
 */
public class ListConverter<T> {

	/**
	 * The list stored from the constructor
	 */
	private List<T> ls = new ArrayList<>();

	/**
	 * Constructs a ListConverter
	 * @param list the list to convert
	 */
	public ListConverter(List<T> list){
		ls = list;
	}
	
	/**
	 * Converts the list to a string, such as for two list entries aa and bb: String s = "aa bb"; 
	 * Uses the {@link #toString(String)} method with the " " split.
	 * @return the list in the default String representation.
	 */
	public String toString(){
		return toString(" ");
	}
	
	/**
	 * Converts the list to a string, separating each entry by the split.
	 * WARNING: To convert properly, your object should have implemented the toString() method. If it has not, it will not show properly!
	 * @param split the string to split the entries by. Can be "" if no split is wanted.
	 * @return the list in the requested String representation.
	 */
	public String toString(String split){
		String s = "";
		if(ls.size() == 0) s = split;
		for(T element : ls){
			String ob = element.toString();
			s = s + ob + split;
		}
		s = s.substring(0, s.length() - split.length());
		return s;
	}
	
	/**
	 * Converts the list to a set.
	 * Uses the TreeSet class
	 * WARNING: In sets duplicate elements are removed.
	 * @return a Set representing the list.
	 */
	public Set<T> toSet(){
		Set<T> s = new TreeSet<T>();
		s.addAll(ls);
		return s;
	}
	
}
