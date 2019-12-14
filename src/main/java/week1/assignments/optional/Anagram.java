package week1.assignments.optional;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		       //Declare a String 
				String text1 = "stop";
				//Declare another String
				String text2 = "pots";
				
				//build logic to check the given words are anagram or not
				
				/*
				 * Pseudo Code
				 * a) Check length of the strings are same then
				 * b) Convert both Strings in to characters
				 * c) Sort Both the arrays
				 * d) Check both the arrays has same value
				 * 
				 */
if (text1.length()==text2.length()) {
	char[] charArray1 = text1.toCharArray();
	Arrays.sort(charArray1);
	char[] charArray2 = text2.toCharArray();
	Arrays.sort(charArray2);
	for (int i = 0; i < charArray1.length; i++) {
		if (charArray1[i]==charArray2[i]) {
			System.out.println(charArray1[i]+ " "+charArray2[i]);
		}
			
		}
		
	}
}
	}


