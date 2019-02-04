/**
 * 
 */
package io.github.hu2di.businessdelegate;

/**
 * @author hu2di
 *
 */
public class Client {
	
	BusinessDelegate businessService;
	
	public Client(BusinessDelegate businessService) {
		this.businessService = businessService;
	}
	
	public void doTask() {
		businessService.doTask();
	}
}
