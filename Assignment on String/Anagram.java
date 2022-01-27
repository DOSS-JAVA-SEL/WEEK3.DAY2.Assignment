package week3.day2;

import java.util.Arrays;

public class Anagram {
	
	public static void main(String[] args) {
		// Pseudo Code
		  
		 //Declare a String 
			String text1 = "stops";
		
			
		 //Declare another String
			String text2 = "potss"; 
			
		// a) Check length of the strings are same then (Use A Condition)
			if(text1.length()==text2.length()) {
				char[] new1 = text1.toCharArray();// b) Convert both Strings in to characters
				char[] new2 = text2.toCharArray();
				Arrays.sort(new1);// c) Sort Both the arrays
				Arrays.sort(new2);
				if(Arrays.equals(new1,new2)) {// d) Check both the arrays has same value
					System.out.println("Yes, both the arrays have same value");
					}
			}
			else {
				System.out.println("The length of the Strings were not same");
				System.out.println("No, both the arrays dont have same value");
			}
		 		
		
			
			


	}

}
