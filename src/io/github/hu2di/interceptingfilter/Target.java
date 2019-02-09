/**
 * 
 */
package io.github.hu2di.interceptingfilter;

/**
 * @author hu2di
 *
 */
public class Target {

	public void execute(String request) {
		System.out.println("Executing request: " + request);
	}
}
