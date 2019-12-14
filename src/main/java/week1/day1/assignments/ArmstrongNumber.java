package week1.day1.assignments;

public class ArmstrongNumber {
	
	/*
	 * Goal: To find whether a number is an Armstrong number or not
	 * 
	 * inputs: 153
	 * output: (1*1*1)+(5*5*5)+(3*3*3) = 153
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a While loop, type 'while' followed by: ctrl + space + down arrow + enter
	 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1) Learned to use the While loop 
	 * 2) Learned what is an Armstrong number
	 * 3) 
	 * 
	 */
	
	public static void main(String[] args) {
		
		// Declare your input
		int number=53;
		
		// Declare 3 more int variables as calculated, remainder, original (Tip: Initialize calculated alone)
		int calculated=0, reminder, original;
		
		// Assign input into variable original 
		original=number;
		
		// Use loop to calculate: which loop to use until the number greater than 0??
		while(number>0)
		{
			// Within loop: get the remainder when done by 10 (Tip: Use Mod operator)
			reminder = number%10;
			// Within loop: get the quotient when done by 10 (Tip: Assign the result to input)
			number = number/10;
			// Within loop: Add calculated with the cube of remainder & assign it to calculated
			calculated = calculated + reminder*reminder*reminder;
		}
		
			
		// Check whether calculated and original are same
		if (calculated == original) {
			//When it matches print it as Armstrong number
			System.out.println(original + " Its an Armstrong number ");
			
		}else
		{
			System.out.println(original + " Its not an Armstrong number ");
		}
		 
	}
}
		
