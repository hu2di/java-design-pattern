package com.blogspot.huyhungdinh.adapter;

public class Adapter implements NewPersonInterface {

	private OldPerson oldPerson;
	
	private String firstName;
	private String lastName;

	public Adapter(OldPerson oldPerson) {
		this.oldPerson = oldPerson;
	}
	
	public void convertOldToNewPerson() {
		String fullName = oldPerson.getName();
		int index = fullName.lastIndexOf(" ");

		this.firstName = fullName.substring(0, index);
		this.lastName = fullName.substring(index + 1);
	}

	@Override
	public void setFirstName(String firstName) {
		// TODO Auto-generated method stub
		this.firstName = firstName;
	}

	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return this.firstName;
	}

	@Override
	public void setLastName(String lastName) {
		// TODO Auto-generated method stub
		this.lastName = lastName;
	}

	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return this.lastName;
	}
}
