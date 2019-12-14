package programs.practice;

/*To Print each character count in String*/

public class CharacterCountInString {

	public static void main(String[] args) {
		// Input String
		String name = "Shamiliiii";

		// Convert to Character Array
		char[] Array = name.toCharArray();

		// Declare the count variable
		int count = 1;

		// Loop through Array
		for (int i = 0; i < Array.length; i++) {
			
			for (int j = i+1; j < Array.length; j++) {

				if (Array[i] == Array[j]) {
					count++;
				}
			}
			System.out.println(" Count of "+Array[i]+ " : "+count);
			count = 1;
		}

	}

}
