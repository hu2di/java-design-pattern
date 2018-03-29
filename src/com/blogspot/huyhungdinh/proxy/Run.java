package com.blogspot.huyhungdinh.proxy;

public class Run {

	public static void main(String[] args) {
		Bike bike1 = new ProxyBike("Porche");
		Bike bike2 = new ProxyBike("Audi");
		
		bike1.driving();
		bike1.driving();
		bike2.driving();
		bike2.driving();
		bike1.driving();
		bike2.driving();
	}
}
