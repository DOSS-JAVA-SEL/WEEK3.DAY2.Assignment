package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Intersection {

	
	

	public static void main(String[] args) {
		// Pseudo Code
			
		 // a) Declare An array for {3,2,11,4,6,7};	 
		// b) Declare another array for {1,2,8,4,9,7};
		 // c) Declare for loop iterator from 0 to array length
		// d) Declare a nested for another array from 0 to array length
		// e) Compare Both the arrays using a condition statement
		 
		//  f) Print the first array (shoud match item in both arrays)
		
		Integer [] array1= {3,2,11,4,6,7};
		
	//List<String>array11 = Arrays.asList(array1);
		Integer[] array2= {1,2,8,4,9,7};
	//List<String>array22 = Arrays.asList(array2);	
	
		ArrayList<Integer> array3 = new ArrayList<Integer>();
		//HashSet<Integer> array4 = new HashSet<Integer>();
		ArrayList<Integer> array4 = new ArrayList<Integer>();
		array3.addAll(Arrays.asList(array1));
		array4.addAll(Arrays.asList(array2));
		
		array3.retainAll(array4);
		System.out.println(array3);
	}
}
	
