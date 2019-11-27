package day1.classroom;

public class SwitchOperator {

	/*
	 * Goal: Perform calculation based on the user input operations
	 * 
	 * inputs: 2,3 and "add"
	 * output: added value: 5
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a Switch case: type 'switch', followed by: ctrl + space + down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1) learnt the switch case use
	 * 2)
	 * 3) 
	 * 
	 */	
	
	public static void main(String[] args) {
		
		// Declare 2 integer numbers
		int a=2,b=3;
		

		// Declare a String variable with input as operations (Tip:
		String operation="add1";

		// Initiate switch case for operations
		switch (operation) {
		
		// Within switch, include as case for add operation
		case "add":
			System.out.println("Addition of "+a+" and "+b+ " : "+(a+b));
			break;
			
		// Within switch, include as case for sub operation
		case "Sub":
			System.out.println("Subtraction of "+a+" and "+b+ " : "+(a-b));
			break;
			
			// Within switch, include as case for mul operation
		case "Mul":
			
			System.out.println("multiplication of "+a+" and "+b+ " : "+(a*b));
			break;
			
			// Within switch, include as case for div operation
		case "Div":
			
			System.out.println("Division of "+a+" and "+b+ " : "+(a/b));
			break;
			
			// Within switch, include 'default' to handle other operations
		default:
			System.out.println("invalid operation");
			break;
		
		}
		//end of switch case
	}
	
}
		
		
		
		
		
		
		
		
		
		
		
		
