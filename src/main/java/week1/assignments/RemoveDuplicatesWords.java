package week1.assignments;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		// Use the declared String text as input
		String text = "We learnt java12* basics as part of java12* sessions sessions in week1 in week1";
		// Initialise an integer variable as count
		int count = 0;
			/*
			 * Pseudo code 
			 * a) Split the String into array and iterate over it 
			 * b) Initialise another loop to check whether the word is there in the array 
			 * c) if it is available then increase and count by 1. 
			 * d) if the count > 1 then replace the word as "" 
			 * e) print the each word
			 */

		String[] str = text.split(" ");
		for(int i=0; i<str.length; i++)
		{
		for(int j=i+1; j<str.length; j++)
		{
		if(str[i].equals(str[j]))
		{
		count++;
		System.out.println( "Repeated Word: "+str[i]);
		
		//code to remove all duplicate occurrences including the source. eg. java is java => is 
		if(count>=1) {
						
			text = text.replace(str[j], ""); 
		  //System.out.println("Text after replace: "+text);
			
		}
		}
		count=0;
		}
		}
		/*
		   code to remove only duplicate occurrences and not the source word. eg. java is java => java is
		 */
		for (int i = 0; i < text.length(); i++) {
			System.out.print(text.charAt(i));
		}
	}
	}


