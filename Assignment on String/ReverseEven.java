package week3.day2;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class ReverseEven {
	public static void main(String[] args) {
	int i,j,newlength;	

	String  splittedarray;
	
//	 Declare the input as Follow
		String test = "I am a software tester"; 
		
//a) split the words and have it in an array
		String[] test1 = test.split(" "); // test1 = I  am  a  software tester
		                                  //   (j)   0  1   2  3        4  
//b) Traverse through each word (using loop)
		for(i=0; i<test1.length;i++) {
		 newlength = test1[i].length();  //length of splitted individual array length
			splittedarray = test1[i];      //new name for splitted array
			
			//c) find the odd index within the loop (use mod operator)
			if(i%2!=0) {
				for(j=(newlength-1) ; j>=0 ;j--) {
					System.out.print(test1[i].charAt(j));// I m , I ma
				}
			}
			else {
				System.out.print(splittedarray);
			}
			System.out.print(" "); // for space after printing odd words
		}
//

//d)split the words and have it in an array

//e)print the even position words in reverse order using another loop (nested loop)
//f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
}
}
