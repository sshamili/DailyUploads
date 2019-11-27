package day1.classroom;

public class OddNumbers {
	
	/*
	 * Goal: Find the odd numbers in the specific range of numbers
	 * 
	 * Input: range of numbers (starting to end) [1 to 20]
	 * Output: Printing only odd numbers [1,3,5,7,9...,19]
	 * 
	 * Shortcuts:
	 * 1) Print : type 'syso', followed by ctrl + space + enter
	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
	 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter
	 * 
	 * What are my learnings from this code?
	 * 
	 * 1) Learnt the use of mod operator
	 * 2) Used if condition
	 * 3) 
	 * 
	 */

	public static void main(String[] args) {
		
		System.out.println("Printing only the odd numbers within 20");

		//	Iterate from 1 to 20 (tip: using loop concept)
		for (int i = 20; i >=1; i--) {
			int odd=i%2;
			if (odd==1) {
				System.out.print(i+ " ");
			}
		}

		//	Within loop -> check whether the integer is odd (tip: use mod operator)

		//	Within loop -> print the odd integer

	}

}
