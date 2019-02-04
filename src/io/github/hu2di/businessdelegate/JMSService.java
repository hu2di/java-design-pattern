/**
 * 
 */
package io.github.hu2di.businessdelegate;

/**
 * @author hu2di
 *
 */
public class JMSService implements BusinessService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see io.github.hu2di.businessdelegate.BusinessService#doProcessing()
	 */
	@Override
	public void doProcessing() {
		// TODO Auto-generated method stub
		System.out.println("Processing task by invoking JMS Service");
	}

}
