/**
 * 
 */
package com.amich.lambda.example.methodreference;

/**
 * @author Adolfo Miguel Iglesias
 *
 */
@FunctionalInterface
public interface ReservationProjection<T, R> {
	
	R getValue(T t);

}
