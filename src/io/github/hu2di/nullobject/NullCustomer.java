/**
 * 
 */
package io.github.hu2di.nullobject;

/**
 * @author hu2di
 *
 */
public class NullCustomer extends AbstractCustomer {

	/* (non-Javadoc)
	 * @see io.github.hu2di.nullobject.AbstractCustomer#isNil()
	 */
	@Override
	public boolean isNil() {
		// TODO Auto-generated method stub
		return true;
	}

	/* (non-Javadoc)
	 * @see io.github.hu2di.nullobject.AbstractCustomer#getName()
	 */
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Not Available in Customer Database";
	}

}
