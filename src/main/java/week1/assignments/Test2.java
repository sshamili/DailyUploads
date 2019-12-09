package week1.assignments;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Here is the input
				String test="I am a software tester";
				
				//Build a logic to reverse the even position words (output: I ma a erawtfos tester)
				
				/* Pseudo Code:
				a) split the words and have it in an array
				b) Traverse through each word (using loop)
				c) find the odd index within the loop (use mod operator)
				d) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
				e) print the even position words in reverse order using another loop (nested loop)
				 
			*/
				String[] split = test.split(" ");
				for (int i = 0; i < split.length; i++) {
					if(i%2 != 0) {
						char[] charArray = split[i].toCharArray();
						for (int j = charArray.length-1; j >=0 ; j--) {
							System.out.print(split[i].charAt(j));
							
						}
						System.out.print(" ");
					}
					else {
						System.out.print(split[i] + " ");
					}
					
				}
				

	}

}
