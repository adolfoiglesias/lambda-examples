/**
 * 
 */
package com.calarix.lambda.example.interfaces;

/**
 * @author Adolfo Miguel Iglesias
 *
 */
@FunctionalInterface
public interface Finder<T, R> {
	
	R findAll(T param1); 

}
