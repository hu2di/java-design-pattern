package io.github.hu2di.proxy;

public class ProxyBike implements Bike{

	private RealBike realBike = null;
	private String bikeName  = null;
	
	public ProxyBike(String bikeName) {
		this.bikeName = bikeName;
	}
	
	@Override
	public void driving() {
		// TODO Auto-generated method stub
		if (realBike == null) {
			realBike = new RealBike(this.bikeName);
		}
		realBike.driving();
	}
}
