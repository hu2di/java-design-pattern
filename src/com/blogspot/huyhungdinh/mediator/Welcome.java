package com.blogspot.huyhungdinh.mediator;

public class Welcome implements Page{
	
	private Mediator mediator;
	
	public Welcome() {
		System.out.println("Create Welcome");
		mediator = new Mediator();
	}
	
	@Override
	public void showName() {
		// TODO Auto-generated method stub
		System.out.println("We are in Welcome");
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
