package TestSharedPackages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import Converter.ListConverter;
import Converter.SetConverter;

/**
 * The built-in tester for testing the Converter package.
 */
public class ConverterTester {

	public static void main(String[] args) {
		boolean error = false;
		boolean error11 = false;
		boolean error12 = false;
		boolean error21 = false;
		boolean error22 = false;
		
		System.out.println("Testing Converter package!");
		System.out.println("Commencing test 1 of 4: Converting a simple list to a set");
		int length = 0;
		int bLength = 0;
		ArrayList<String> ls = new ArrayList<String>();
		ls.add("hi");
		ls.add("bye");
		length = ls.size();
		ListConverter<String> lcon = new ListConverter<String>(ls);
		Set<String> set = lcon.toSet();
		if(set.size() == length) System.out.println("Converting a simple list to a set complete!");
		else{
			System.out.println("FAILURE! Cannot convert a simple list to a set");
			error11 = true;
			error = true;
			bLength = set.size();
		}
		
		System.out.println("Commencing test 2 of 4: Converting a simple set to a list");
		SetConverter<String> scon = new SetConverter<String>(set);
		List<String> list = scon.toList();
		if(list.size() == length && !error11) System.out.println("Converting a simple set to a list complete!");
		else if(list.size() == bLength && error11) System.out.println("Converting a simple set to a list complete!");
		else{
			System.out.println("FAILURE! Cannot convert a simple set to a list");
			error12 = true;
			error = true;
		}
		
		System.out.println("Commencing test 3 of 4: Converting a list with duplicates into a set (where no duplicates are allowed)");
		ls.add("hi");
		ls.add("hello");
		ls.add("bye");
		ls.add("goodbye");
		length = ls.size();
		lcon = new ListConverter<String>(ls);
		set = lcon.toSet();
		if(set.size() == length -2) System.out.println("Converting a list with duplicates into a set complete!");
		else{
			System.out.println("FAILURE! Cannot convert a list with duplicates into a set");
			error21 = true;
			error = true;
			bLength = set.size();
		}
		
		System.out.println("Commencing test 4 of 4: Converting a set (which filtered duplicates) into a list");
		scon = new SetConverter<String>(set);
		list = scon.toList();
		if(list.size() == length - 2 && !error21) System.out.println("Converting a set into a list complete!");
		else if(list.size() == bLength && error21) System.out.println("Converting a set into a list complete!");
		else{
			System.out.println("FAILURE! Cannot convert a set into a list");
			error22 = true;
			error = true;
		}
		if(!error) System.out.println("No errors!");
		else{
			if(error11) System.err.println("Error with ListConverter, cannot convert a simple list to a set");
			if(error12) System.err.println("Error with SetConverter, cannot convert a simple set to a list");
			if(error21) System.err.println("Error with ListConverter, cannot convert a list with duplicates into a set");
			if(error22) System.err.println("Error with SetConverter, cannot convert a set into a list");
		}
	}

}
