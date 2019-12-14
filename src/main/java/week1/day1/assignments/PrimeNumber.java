package week1.day1.assignments;

public class PrimeNumber {
	
	/*
	 * Goal: To find whether a number is a Prime number or not
	 * 
	 * input: 13
	 * output: 13 is a Prime Number
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
	 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1) Learned about the mod operator
	 * 2)
	 * 3) 
	 * 
	 */
	
	public static void main(String[] args) {

		// Declare an int Input and assign a value
		int input = 2;
		// Declare a boolean input as flag
		boolean flag = false;
		
		// Iterate from 1 to half of the input
		for (int i = 2; i < 6; i++) {
			
			// Divide the input with each for loop variable and check the remainder
			
			int temp= input%i;
			if (temp==0) {
				// Set the flag as true when there is no remainder
				flag=true;
				
				// break the iterator
				break;
			}
			
		}
				
		// Check the flag (Provide a condition)
		if (flag==true) {
			// Print 'Prime' when the condition matches
			System.out.println(input+" its not a Prime Number");
		}
		else
		{
			// Print 'Not a Prime' when the condition doesn't match 
			System.out.println(input+" its a Prime Number");
		}

	}

}
