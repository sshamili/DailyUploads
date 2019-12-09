package week3.assignments.assignment3;

import java.util.*;
/*
 * Remove duplicate characters in the given String  "PayPal India"
 * IP: PayPal India
 * OP: ylindi
*/

public class RemoveDuplicateCharUsingCollections {

	public static void main(String[] args) {
		
		// Input String
		String input = "PayPal India";
		
		System.out.println("Input: "+input);
		
		// Replace 
		input = input.replaceAll("\\s", "");
		
		// Convert String to CharArray
		char[] Array = input.toCharArray();
		
		// Declare Set in Collection
		Set<Character> uniqueValues = new LinkedHashSet<>();
		
		// Loop through array
		for (Character c : Array) {
			// Character contains in Set
			if(!uniqueValues.contains(c)) {
			
		// Add to Set
		uniqueValues.add(c);
		
		}else {
			//Remove the repeating character from set
			uniqueValues.remove(c);
		}
		
		}
		//Print Set 
		System.out.print("Output: ");
		
		//Loop through to print without ','
		for (Character op : uniqueValues) {
			System.out.print(op);
		}
		
	}

}
