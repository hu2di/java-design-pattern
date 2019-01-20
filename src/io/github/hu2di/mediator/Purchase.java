package io.github.hu2di.mediator;

public class Purchase implements Page{

	private Mediator mediator;
	
	public Purchase() {
		System.out.println("Create Purchase");
		mediator = new Mediator();
	}

	@Override
	public void showName() {
		// TODO Auto-generated method stub
		System.out.println("We are in Purchase");
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
