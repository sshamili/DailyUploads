package week3.assignments.assignment3;

import java.util.HashSet;
import java.util.Set;

public class Trial {

	
	public static String removeDuplicates(String input){
	    Set<Character> set = new HashSet<Character>();
	    for (char c : input.toCharArray()) {
	        set.add(c);
	    }
	    StringBuilder sb = new StringBuilder();
	    for (Character c : set) {
	        sb.append(c);
	    }
	    return sb.toString();
	}
	
	public static void main(String[] args) {
	String input = "PayPal";
	System.out.println(removeDuplicates(input));
			
	}

}
