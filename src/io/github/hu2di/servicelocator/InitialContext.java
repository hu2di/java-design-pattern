/**
 * 
 */
package io.github.hu2di.servicelocator;

/**
 * @author hu2di
 *
 */
public class InitialContext {

	public Object lookup(String jndiName) {
		if (jndiName.equalsIgnoreCase("SERVICE1")) {
			System.out.println("Looking up and creating a new Service1 object");
			return new Service1();
		}
		if (jndiName.equalsIgnoreCase("SERVICE2")) {
			System.out.println("Looking up and creating a new Service2 object");
			return new Service2();
		}
		return null;
	}
}
