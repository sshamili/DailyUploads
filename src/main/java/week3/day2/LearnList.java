package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {
	public static void main(String[] args) {
		// Syntax to create String array of size 5
		// String[] name = new String[5];
		
		List<String> browsers = new ArrayList<>();
		System.out.println(browsers.isEmpty());
		browsers.add("IE");
		browsers.add("Chrome");
		browsers.add("FireFox");
		browsers.add("Chrome");
		browsers.add(0, "Safari");
		System.out.println("Size "+browsers.size());
		
		//To Sort a List
		Collections.sort(browsers);
		//To reverse a List, but has to be used after sort
		Collections.reverse(browsers);
		
		for (String eachBrowser : browsers) {
			System.out.println(eachBrowser);
		}
		
		
		
		
		
		
		
		
		
		
	}

}
