/**
 * 
 */
package com.amich.lambda.example.methodreference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author amich
 *
 */
public class SorterMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<String>(Arrays.asList("adolfo", "aurea", "analia", "analina"));
		
		Sorter sorter = Collections::sort;
		
		sorter.sort(list1);
		System.out.println(list1);
		
		
		List<String> list2 = new ArrayList<String>(Arrays.asList("adolfo", "aurea", "analia", "analina"));
		SorterImpl sorterImpl = new SorterImpl();
		
		Sorter sorter2 = sorterImpl::sort;
		
		sorter2.sort(list2);
		System.out.println(list1);
		

	}

}
