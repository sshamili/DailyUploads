package week3.assignments.assignment3;

import java.util.*;
/*
 * Sort the given company in reverse order (HCL, Aspire Systems, CTS )
 * output: HCL , CTS, Aspire Systems
*/

public class ReverseOrderUsingCollections {
	
	public static void main(String[] args) {
	// Creating a List Collections
	List <String> companyNames = new ArrayList<>();
	
	// Add values to List
	companyNames.add("HCL");
	companyNames.add("Aspire Systems");
	companyNames.add("CTS");
	
	System.out.println("Input Order: "+companyNames);
	
	// Sort List to Ascending order
	Collections.sort(companyNames);
	
	// Reverse Order the List - Descending order
	Collections.reverse(companyNames);
	
	System.out.println("Company Names Reverse order: "+companyNames);
	

	}

}
