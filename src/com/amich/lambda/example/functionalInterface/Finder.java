/**
 * 
 */
package com.amich.lambda.example.functionalInterface;

/**
 * @author Adolfo Miguel Iglesias
 *
 */
@FunctionalInterface
public interface Finder<T, R> {
	
	R findAll(T param1); 

}
