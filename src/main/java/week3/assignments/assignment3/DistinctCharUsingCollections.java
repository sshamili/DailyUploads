package week3.assignments.assignment3;

/*
 * In a given String print only distinct characters.
 * 
 * Input: Amazon India Private Limited
 * 
 * Output: AmazonIdiPrvteL
 * 
 */

import java.util.LinkedHashSet;
import java.util.Set;

public class DistinctCharUsingCollections {

public static void main(String[] args) {
		
		// Input String
		String input = "Amazon India Private Limited";
		
		System.out.println("Input: "+input);
		
		// Replace 
		input = input.replaceAll("\\s", "");
		
		// Convert String to CharArray
		char[] Array = input.toCharArray();
		
		// Declare Set in Collection
		Set<Character> uniqueValues = new LinkedHashSet<>();
		
		// Loop through array
		for (Character c : Array) {
			uniqueValues.add(c);
		}
			
		System.out.print("Output: ");
		for (Character c : uniqueValues) {
			
			System.out.print(c);
		}
	}
}
