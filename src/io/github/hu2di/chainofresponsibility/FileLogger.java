/**
 * 
 */
package io.github.hu2di.chainofresponsibility;

/**
 * @author hu2di
 *
 */
public class FileLogger extends AbstractLogger {

	public FileLogger(int level) {
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
		System.out.println("File:: Logger: " + message);
	}
}
