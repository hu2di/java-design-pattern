package com.blogspot.huyhungdinh.adapter;

public class NewPerson implements NewPersonInterface{

	private String firstName;
	private String lastName;
	
	@Override
	public String getFirstName() {
		return this.firstName;
	}
	
	@Override
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@Override
	public String getLastName() {
		return this.lastName;
	}
	
	@Override
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
