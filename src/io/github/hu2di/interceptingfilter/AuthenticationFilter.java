/**
 * 
 */
package io.github.hu2di.interceptingfilter;

/**
 * @author hu2di
 *
 */
public class AuthenticationFilter implements Filter {

	@Override
	public void execute(String request) {
		System.out.println("Authenticating request: " + request);
	}
}
