package week3.assignments.assignment3;

/*
 * In a Given String Print all the duplicate characters.
 * input: Infosys Limited
 * output: s,i
 * 
 */

import java.util.LinkedHashSet;
import java.util.Set;

public class AllDuplicateCharUsingCollections {

	public static void main(String[] args) {
		// Input String
		String input = "Infosys Limited";

		System.out.println("Input: "+input);

		// Replace 
		input = input.replaceAll("\\s", "");

		// Convert String to CharArray
		char[] Array = input.toCharArray();

		// Declare Set in Collection
		Set<Character> uniqueValues = new LinkedHashSet<>();

		//Print Duplicate character alone 
		System.out.print("\nOutput: ");
		
		// Loop through array
		for (Character c : Array) {
			
			// Character contains in Set
			if(!uniqueValues.contains(c)) {

				// Add to Set
				uniqueValues.add(c);

			}else {
				
				//Remove the repeating character from set
				uniqueValues.remove(c);
				
				//Prints the Repeating Characters
				System.out.print(c+" , ");
			}

		}

	}

}
