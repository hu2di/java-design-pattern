/**
 * 
 */
package io.github.hu2di.interceptingfilter;

/**
 * @author hu2di
 *
 */
public class DebugFilter implements Filter {

	@Override
	public void execute(String request) {
		System.out.println("Request log: " + request);
	}
}
