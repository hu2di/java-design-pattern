package io.github.hu2di.adapter;

public class Run {

	public static void main(String[] args) {
		
		OldPerson oldPerson = new OldPerson();
		oldPerson.setName("HuyHung Dinh");
		
		Adapter adapter = new Adapter(oldPerson);
		adapter.convertOldToNewPerson();
		
		System.out.println("First name: " + adapter.getFirstName());
		System.out.println("Last name: " + adapter.getLastName());
	}
}
