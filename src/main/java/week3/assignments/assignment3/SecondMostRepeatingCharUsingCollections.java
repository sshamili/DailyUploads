package week3.assignments.assignment3;

import java.util.*;
import java.util.Map.Entry;

/*
 * Print only the Second most repeating character in the String  "PayPal India"
 * IP : "PayPal India"
 * OP: "P"
 */



public class SecondMostRepeatingCharUsingCollections {

	public static void main(String[] args) {
		// Input String
		String input = "PayPal IndiaPPP";
		
		// Replace 
				input = input.replaceAll("\\s", "");
			// Convert to char Array
		char[] Array = input.toCharArray();
		
		// Created Map Collection
		Map<Character, Integer> map = new HashMap<>();
		
		// Loop through the array
		for (char c : Array) {
		// Check the character is in Map
			if (map.containsKey(c)) {
				// Use get() to get the Character Key value and increment by 1
				Integer integer = map.get(c)+1;
				// Add incremented values for respective character Key
				map.put(c, integer);
			}else {
				// Add character in Map and assign value as 1
			map.put(c, 1);
		}
		}
		// Print map values
		System.out.println(map);
		
		//sort the map values
		Set<Character> keySet = map.keySet();
		System.out.println(keySet);
		Set<Entry<Character, Integer>> set = map.entrySet();
		
		List<Entry<Character, Integer>> list = new ArrayList<Entry<Character, Integer>>(set);
		System.out.println(list);
		//Collections.sort((List<Entry<Character, Integer>>));
	}

}
