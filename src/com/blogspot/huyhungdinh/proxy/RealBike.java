package com.blogspot.huyhungdinh.proxy;

public class RealBike implements Bike {

	private String bikeName = null;

	public RealBike(String bikeName) {
		this.bikeName = bikeName;
		gettingABike();
	}

	public void gettingABike() {
		System.out.println("Getting a " + this.bikeName + " bike");
	}

	@Override
	public void driving() {
		// TODO Auto-generated method stub
		System.out.println("Driving a " + this.bikeName + " bike");
	}
}
