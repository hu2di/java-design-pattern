/**
 * 
 */
package io.github.hu2di.servicelocator;

/**
 * @author hu2di
 *
 */
public class Service1 implements Service {

	/*
	 * (non-Javadoc)
	 * 
	 * @see io.github.hu2di.servicelocator.Service#getName()
	 */
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Service1";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see io.github.hu2di.servicelocator.Service#execute()
	 */
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("Executing Service1");
	}

}
