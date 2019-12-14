package week3.day2;

import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
	public static void main(String[] args) {
		// Syntax to create String array of size 5
		// String[] name = new String[5];
		
		Set<String> browsers = new TreeSet<>();
		System.out.println(browsers.isEmpty());
		browsers.add("IE");
		boolean add = browsers.add("Chrome");
		System.out.println("1st time: "+add);
		browsers.add("FireFox");
		boolean add1 = browsers.add("Chrome");
		System.out.println("2nd Time "+add1);
		System.out.println("Size "+browsers.size());
		
		
		
		for (String eachBrowser : browsers) {
			System.out.println(eachBrowser);
		}
		
		
		
		
		
		
		
		
		
		
	}

}
