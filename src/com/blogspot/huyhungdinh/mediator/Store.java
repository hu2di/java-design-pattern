package com.blogspot.huyhungdinh.mediator;

public class Store implements Page{

	private Mediator mediator;
	
	public Store() {
		System.out.println("Create Store");
		mediator = new Mediator();
	}
	
	@Override
	public void showName() {
		// TODO Auto-generated method stub
		System.out.println("We are in Store");
	}
	
	public void goToWelcome() {
		mediator.goToWelcome();
	}
	
	public void goToStore() {
		mediator.goToStore();
	}
	
	public void goToPurchase() {
		mediator.goToPurchase();
	}
}