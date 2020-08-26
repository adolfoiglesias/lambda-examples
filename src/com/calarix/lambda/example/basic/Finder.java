/**
 * 
 */
package com.calarix.lambda.example.basic;

/**
 * @author Adolfo Miguel Iglesias
 *
 */
@FunctionalInterface
public interface Finder<T, R> {
	
	R findAll(T param1); 

}
