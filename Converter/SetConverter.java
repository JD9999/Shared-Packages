package Converter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Converts a set to different collections.
 * @param <T> The type of set
 */
public class SetConverter<T> {
	
	/**
	 * The set stored from the constructor
	 */
	private Set<T> set;

	/**
	 * Constructs a SetConverter
	 * @param s the set to convert
	 */
	public SetConverter(Set<T> s){
		set = s;
	}
	
	/**
	 * Converts the set to a list.
	 * @return A list representing the set
	 */
	public List<T> toList(){
		List<T> list = new ArrayList<T>();
		list.addAll(set);
		return list;
	}
	
	/**
	 * Converts the list to a string, such as for two list entries aa and bb: String s = "aa bb"; 
	 * Uses the {@link #toString(String)} method with the " " split.
	 * @return the set in the default String representation.
	 */
	public String toString(){
		return toString(" ");
	}
	
	/**
	 * Converts the set to a string, separating each entry by the split.
	 * WARNING: To convert properly, your object should have implemented the toString() method. If it has not, it will not show properly!
	 * @param split the string to split the entries by. Can be "" if no split is wanted.
	 * @return the set in the requested String representation.
	 */
	public String toString(String split){
		String s = "";
		if(set.size() == 0) s = split;
		Iterator<T> it = set.iterator();
		while(it.hasNext()) {
	        T f = it.next();
	        s = s + f.toString() + split;
	    }
		s = s.substring(0, s.length() - split.length());
		return s;
	}
	
}
