package com.example.demo;

import org.springframework.stereotype.Component;

@Component("addr")
public class Address {

	public Address() {
		super();
		System.out.println("Inside Address constructor");
	}
	private String addressLine;
	public String getAddressLine() {
		return addressLine;
	}
	@Override
	public String toString() {
		return "Address [addressLine=" + addressLine + ", state=" + state + ", city=" + city + ", zipCode=" + zipCode
				+ "]";
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	private String state;
	private String city;
	private int zipCode;
	
	public void showAddress()
	{
		System.out.println(" Inside show address");
	}
	
}
