package week3.day2;

public class ReverseEvenWords{

	public static void main(String[] args) {
		//Build a logic to reverse the even position words (output: I ma a erawtfos tester)

		int i,odd;

		// Pseudo Code:
		 
		// Declare the input as Follow
	      		String test = "I am a software tester"; 
	      		
		//a) split the words and have it in an array
	      String[]	test1=	test.split("");

	      
		//b) Traverse through each word (using loop)
	      for(i=0; i<test1.length; i++) {
	    	  System.out.print(test1[i]);
	      }
	      
		//c) find the odd index within the loop (use mod operator)
	      i=i%2;
		
		//d)split the words and have it in an array
		
		//e)print the even position words in reverse order using another loop (nested loop)
		//f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
		
	}

}
