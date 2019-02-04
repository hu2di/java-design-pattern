/**
 * 
 */
package io.github.hu2di.businessdelegate;

/**
 * @author hu2di
 *
 */
public class BusinessDelegate {

	private BusinessLookUp lookUpService = new BusinessLookUp();
	private BusinessService businessService;
	private String serviceType;
	
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	
	public void doTask() {
		businessService = lookUpService.getBusinessService(this.serviceType);
		businessService.doProcessing();
	}
}
