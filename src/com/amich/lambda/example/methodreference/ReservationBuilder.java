/**
 * 
 */
package com.amich.lambda.example.methodreference;

/**
 * @author Adolfo Miguel Iglesias
 *
 */

@FunctionalInterface
public interface ReservationBuilder {
	
	 Reservation build(Long id, double price, String contact);

}
