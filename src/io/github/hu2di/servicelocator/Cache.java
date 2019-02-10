/**
 * 
 */
package io.github.hu2di.servicelocator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hu2di
 *
 */
public class Cache {

	private List<Service> services;
	
	public Cache() {
		services = new ArrayList<Service>();
	}
	
	public Service getService(String serviceName) {
		for (Service service : services) {
			if (service.getName().equalsIgnoreCase(serviceName)) {
				System.out.println("Returning cached " + serviceName + " object");
				return service;
			}
		}
		return null;
	}
	
	public void addService(String newService) {
		
	}
}
