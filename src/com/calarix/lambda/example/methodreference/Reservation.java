/**
 * 
 */
package com.calarix.lambda.example.methodreference;

import java.util.UUID;

/**
 * @author Adolfo Miguel Iglesias
 *
 */
public class Reservation {
	
	public Long id;
	public String uuid;
	public double price;
	public String contact;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public Reservation(Long id, double price, String contact) {
		super();
		this.id = id;
		this.price = price;
		this.contact = contact;
		this.uuid = UUID.randomUUID().toString();
	}
	
	@Override
	public String toString() {
		return "id:" + this.id +  " , uuid: " + this.uuid + " , contact: " + this.contact + " , price: " + this.price;
	}

}
