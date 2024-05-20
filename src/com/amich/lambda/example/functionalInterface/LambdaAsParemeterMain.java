/**
 * 
 */
package com.amich.lambda.example.functionalInterface;

import java.util.Arrays;
import java.util.List;

/**
 * @author Adolfo Miguel Iglesias
 *
 */
public class LambdaAsParemeterMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Finder<String, String> finder = value -> {
			StringBuilder builder = new StringBuilder(); 
			
			for (int i = 0; i < value.length(); i++) {
				char v = value.charAt(i);
				if(Character.isUpperCase(v)) {
					builder.append(v);
				}
			}
			return builder.toString();
		};
		
		// find all uppercase
		String value = "Adolfo Miguel Iglesias Chaviano";
		System.out.println(finder.findAll(value));
		
		
		// Using functionalInterface as a param
		value = "Aurea Chaviano Rodgriguez";
		System.out.println(findAllUppercase(finder, value));	
		
		
		// Redefining functionalInterface 
		Finder<List<Integer>, Integer> finderMoreThan10 = list -> {
			for (Integer num: list) {
				if(num > 10) {
					return num;
				}
			}
			return null;
		};
		
		List<Integer> list = Arrays.asList(2,8,2,20);
		
		System.out.println(finderMoreThan10.findAll(list));	
				
		
	}
	
	private static String findAllUppercase(Finder<String, String> finder, String value) {
		return finder.findAll(value);
	}	
	
	
}
