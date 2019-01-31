/**
 * 
 */
package io.github.hu2di.nullobject;

/**
 * @author hu2di
 *
 */
public class RealCustomer extends AbstractCustomer {

	public RealCustomer(String name) {
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see io.github.hu2di.nullobject.AbstractCustomer#isNil()
	 */
	@Override
	public boolean isNil() {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see io.github.hu2di.nullobject.AbstractCustomer#getName()
	 */
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
