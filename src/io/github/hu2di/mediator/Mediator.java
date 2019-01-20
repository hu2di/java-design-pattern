package io.github.hu2di.mediator;

public class Mediator {

	private Page page;

	public void goToWelcome() {
		System.out.println("Go to Welcome");
		page = new Welcome();
		page.showName();
	}

	public void goToStore() {
		System.out.println("Go to Store");
		page = new Store();
		page.showName();
	}

	public void goToPurchase() {
		System.out.println("Go to Purchase");
		page = new Purchase();
		page.showName();
	}
}
