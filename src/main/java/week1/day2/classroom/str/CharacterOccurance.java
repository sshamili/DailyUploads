package week1.day2.classroom.str;

public class CharacterOccurance {


	public static void main(String[] args) {

		// Here is the input
		String test = "I am getting better with Java";

		// Here is what the count you need to find
		char ch = 'a';
		int totalCount = 0;
		
		// Build the logic to find the count of each
		/* Pseudo Code:
			a) Convert the String to character array
			b) Traverse through each character (using loop)
			c) If the given character matches the expected character (ch),
			   Then, increment totalCount
		*/
		
		char[] Array = test.toCharArray();
		for (int i = 0; i < Array.length; i++) {
			if (Array[i] == ch) {
				totalCount++;
			}
		}
		System.out.println("Character "+ch+" occured "+ totalCount);
		
		
		
		
		
		
		
		
		
		// Print the count here
		System.out.println("Total count of character("+ch+"): " + totalCount);
		
	}

}
