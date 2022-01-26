package week3.day2;

public class Palindrome {

	public static void main(String[] args) {
		
			//Build a logic to find the given string is palindrome or not
		     
		
			 // Pseudo Code
			
			// a) Declare A String value as"madam"
			   String a=  "madam";
			   int i;
			 String original  = "madam";
			 
			 
			 // b) Declare another String rev value as ""
			   String rev = "";
			   
			 //c) Iterate over the String in reverse order
			 for(i=a.length()-1; i>=0 ; i--){
			  rev =rev + a.charAt(i);
			
			 }
			 
			 //d) Add the char into rev
			 System.out.println(rev);
			 
			// e) Compare the original String with the reversed String, if it is same then print palinDrome 
			 
			 if(rev.equals(a)) {
				 System.out.println("The were same hence its Palindrome");
			 }
			 else {
				 System.out.println("They were not same hence not Palindrome");
			 }
			 
			 // Hint: Use .equals or .equalsIgnoreCase when you compare a String 
			

		}

	}


