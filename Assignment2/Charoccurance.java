package week3.day2;

import com.google.common.primitives.Chars;

public class Charoccurance {

	public static void main(String[] args) {
		// Check number of occurrences of a char (eg 'e') in a String
		
					String str = "welcome to chennai";
		            str=str.trim();

					// declare and initialize a variable count to store the number of occurrences
					int count=0;
					int i,j;
					char w='n';
		
					
					// convert the string into char array
					char[] str1 = str.toCharArray();
						
					//get the length of the array
				
					System.out.println(str1.length);
						
					// traverse from 0 till the array length 
					for(i=0;i<=str1.length-1; i++) {
						System.out.print(str1[i]);
						if(str.charAt(i)== w) {
							count++;// if is has increment the count
							
							}
	
						
				
}
					System.out.println(" \n\n"	+ ""+"The letter n present"+"  "+count+" times");	// print the count out of the loop
				// Check the char array has the particular char in it          	System.out.println(count);
			
				
					
				}

	
	}