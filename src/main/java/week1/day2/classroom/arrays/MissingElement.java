package week1.day2.classroom.arrays;

import java.util.Arrays;

public class MissingElement {

	
	public static void main(String[] args) {

		// Here is the input
		int[] data = {3,2,4,6,7,8};

		/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Traverse through each array item
		 3) Compare consecutive items -> 
		 		the next one should be = previous one + 1
		 4) If the following one is not +1 -> Print as missing
		 */
		
		Arrays.sort(data);
			
		  for(int i=0; i<data.length-1;i++) {
		 // System.out.println(data[i]);
			int next= data[i+1]-data[i];
			//System.out.println(next); 
			if(next!=1) { 
				int misssingno=data[i]+1; 
				//System.out.println("text"+data[i-1]);
				System.out.println("The missing elememt: "+misssingno);
				break;
				}
			 
		  }
		 
		
	}

}
