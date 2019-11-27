package day2.classroom.str;

public class ReverseStr {

	public static void main(String[] args) {
		
		// Here is the input
		String test = "feeling good";

		// Build the logic to find the count of each
		/* Pseudo Code: 1
			a) Convert the String to character array
			b) Traverse through each character (using loop in reverse direction)
			c) Print the character (without newline -> like below
			   System.out.print(ch);
		*/

		
		char[] array = test.toCharArray();
		System.out.print("Reverse of the given string using char property: ");
		for (int i = array.length-1; i >= 0; i--) {
			System.out.print(array[i]);
		}
		
		/* Pseudo Code: 2
		a) Find the length of the string
		b) Traverse through each index from length-1 -> 0 (using loop in reverse direction)
		c) Find the character of the String using its index
		*/
		
		System.out.println("\nLength of the given String is: "+test.length());
		System.out.print("\nReverse of the given string using string methods: ");
		for (int i = test.length()-1; i >= 0; i--) {
			System.out.print(test.charAt(i));
		}
		
	}

}
