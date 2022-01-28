package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class SecondLargestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] data = {3,2,11,4,6,7};
		ArrayList<Integer> data1 = new ArrayList<Integer>();
		Collections.sort(Arrays.asList(data));
		System.out.println(data1);
		data1.addAll(Arrays.asList(data));

		System.out.println("The length of the list="+" "+data1.size());
		System.out.println("The Second Largest no="+" "+data1.get(4));
		//int second = data1.get(data.length-2) ;
		//System.out.println("The Second Largest no="+" "+second);
		
	}

}
