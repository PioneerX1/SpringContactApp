package com.pioneerx1.spring_test_6;

public class Address {

	private String street;
	private String postalcode;
	
	public Address() {
		
	}
	
	public Address(String street, String postalcode) {
		super();
		this.street = street;
		this.postalcode = postalcode;
	}
	
	@Override
	public String toString() {
		return "Address [street=" + street + ", postalcode=" + postalcode + "]";
	}
	
}
