package com.blogspot.huyhungdinh.mediator;

public class Run {

	public static void main(String[] args) {
		Page page = new Welcome();
		page.goToStore();
		page.goToWelcome();
		page.goToPurchase();
	}
}
