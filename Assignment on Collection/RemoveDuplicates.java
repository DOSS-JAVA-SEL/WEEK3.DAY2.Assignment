package week3.day2;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int i,newlength;
		//String splittedtext = null;
		// b) Initialize an integer variable as count	
		int count = 0;	
			 // Pseudo code 
		
			 // a) Use the declared String text as input
				String text = "We learn java basics as part of java sessions in java week1";		
				
		  // c) Split the String into array and iterate over it 
				String[] test1 = text.split(" ");
							
				for(i=0;i<=test1.length-1;i++) {
					String splittedarray = test1[i];
					newlength = test1.length;
					System.out.print(" "+splittedarray+" ");
				}
				
				Set<String> check = new LinkedHashSet<String>(); // to remove duplicate setarray prefered, linkedHashSet follows index based
				
				// d) Initialize another loop to check whether the word is there in the array
				for(String aa : test1) {
					check.add(aa);
					
				//e) if it is available then increase and count by 1. 
					if(count>1) {
						aa.replace(" aa " , " ");  //f) if the count > 1 then replace the word as "" 
						
				}
				// g) Displaying the String without duplicate words	
				}System.out.print("\n "+check+" ");
			//	String newone = check.toString();
			//	char[] nw = aa.toCharArray();
			//	System.out.print("\n"+nw);
			
			
			 
		




	}

}

