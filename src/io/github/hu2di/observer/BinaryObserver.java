/**
 * 
 */
package io.github.hu2di.observer;

/**
 * @author hu2di
 *
 */
public class BinaryObserver extends Observer {
	
	public BinaryObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	/* (non-Javadoc)
	 * @see io.github.hu2di.observer.Observer#update()
	 */
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
	}

}
