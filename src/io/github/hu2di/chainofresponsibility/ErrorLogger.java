/**
 * 
 */
package io.github.hu2di.chainofresponsibility;

/**
 * @author hu2di
 *
 */
public class ErrorLogger extends AbstractLogger {

	public ErrorLogger(int level) {
		this.level = level;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * io.github.hu2di.chainofresponsibility.AbstractLogger#write(java.lang.String)
	 */
	@Override
	protected void write(String message) {
		// TODO Auto-generated method stub
		System.out.println("Error Console:: Logger: " + message);
	}

}
