package week3.day2;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class MissingElementInArray  {

	public static void main(String[] args) {
		int i;
		// Here is the input
		Integer[] arr = {1,2,3,4,7,6,8};

		// Sort the array	
		Arrays.sort(arr);
		//System.out.println(arr);
		
		
		ArrayList<Integer> check = new ArrayList<Integer>() ;
		check.addAll(Arrays.asList(arr));
		//System.out.println("" "+);
		
		for (i=1;i<check.size();i++) {
			//check.addAll(Arrays.asList(arr));
			
			if(i != check.get(i-1)) // if(5 !=check.get())
			{				
					System.out.println("The Missing no is :"+" "+i+" ");
					break;
			}
			
		}
	}
}
		// loop through the array (start i from arr[0] till the length of the array)

			// check if the iterator variable is not equal to the array values respectively
			
				// print the number
				
				// once printed break the iteration
				
				
		

	





