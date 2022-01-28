package week3.day2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class PrintDuplicate {

	public static void main(String[] args) {
		int i;
		// TODO Auto-generated method stub
            Integer[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
            
            ArrayList<Integer> arr1 = new ArrayList<Integer>();
            arr1.addAll(Arrays.asList(arr));
		     Collections.sort(arr1);
		     
		     HashSet<Integer> arr2 = new HashSet<Integer>();
		     System.out.print("The Duplicate nos were:");
		     for (Integer arr3 : arr1) {
				if(arr2.add(arr3) == false) {
					System.out.print(" "+arr3+" ");
					 
				}
			}
	}

}
