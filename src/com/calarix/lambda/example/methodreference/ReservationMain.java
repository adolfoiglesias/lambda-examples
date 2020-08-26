/**
 * 
 */
package com.calarix.lambda.example.methodreference;

import java.util.Arrays;
import java.util.List;

/**
 * @author Adolfo Miguel Iglesias
 * 
 *  Method Referencie: Constructor and mehtod non static of a Class
 */
public class ReservationMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Constructor method reference
		ReservationBuilder builder = Reservation::new;
		
		List<Reservation> list = Arrays.asList(
				builder.build(1l, 100d, "Adolfo Miguel Iglesias"),
				builder.build(2l, 200d, "Santos Kelrmith Ravell"),
				builder.build(3l, 300d, "Juana Carrazco"));
		
		// Method reference of a Class
		ReservationProjection<Reservation, String> reservationProjection = Reservation::toString;
		list.forEach(rx -> System.out.println(reservationProjection.getValue(rx)));
	}

}
