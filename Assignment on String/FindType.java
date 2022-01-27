package week3.day2;

public class FindType {

	public static void main(String[] args) {
	
		// Here is the input
				String test = "$$ Welcome to 2nd Class of Automation $$ ";
			//	String test1 = test.trim();

				// Here is what the count you need to find
				int  letter = 0, space = 0, num = 0, specialChar = 0;

				// Build the logic to find the count of each
				// Pseudo Code:
			//		a) Convert the String to character array
				char[] test1 = test.toCharArray();
				
				
			//		b) Traverse through each character (using loop)
				for(int i=0; i<test1.length;i++) {
					System.out.print(test1[i]);
					if(Character.isLetter(test1[i])) {
						letter++;
					}
					else if(Character.isDigit(test1[i])) {
						num++;
					}
					else if(Character.isSpaceChar(test1[i])) {
						space++;
					}
					else {
						specialChar++;
					}
				}
					
			//	c) Find if the given character is what type using (if)

			//				i)  Character.isLetter
			//				ii) Character.isDigit
			//				iii)Character.isSpaceChar
			//				iv) else -> consider as special character
				

				// Print the count here
			//	System.out.println("letter: " + letter);
				System.out.print("\n\nThe count of letters were"+" "+letter);
				
//				System.out.println("number: " + num);
				System.out.print("\n\nThe count of Digits were"+"  "+num);
				
//				System.out.println("space: " + space);
				System.out.print("\n\nThe count of space were"+"   "+space++);
				
			//	System.out.println("specialCharcter: " + specialChar);
				System.out.print("\n\nThe count of specialcharacters were"+"   "+specialChar++);
	}

}
