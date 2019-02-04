/**
 * 
 */
package io.github.hu2di.businessdelegate;

/**
 * @author hu2di
 *
 */
public class BusinessLookUp {

	public BusinessService getBusinessService(String serviceType) {
		if (serviceType.equalsIgnoreCase("EJB")) {
			return new EJBService();
		} else {
			return new JMSService();
		}
	}
}
