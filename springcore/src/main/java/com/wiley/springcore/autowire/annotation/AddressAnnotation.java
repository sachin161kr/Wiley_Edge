package com.wiley.springcore.autowire.annotation;

public class AddressAnnotation {
	
	private String street;
	
	private String city;

	
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public AddressAnnotation(String street, String city) {
		super();
		this.street = street;
		this.city = city;
	}

	public AddressAnnotation() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}
	
	
	
	

}
