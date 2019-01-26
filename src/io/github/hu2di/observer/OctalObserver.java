/**
 * 
 */
package io.github.hu2di.observer;

/**
 * @author hu2di
 *
 */
public class OctalObserver extends Observer {
	
	public OctalObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	/* (non-Javadoc)
	 * @see io.github.hu2di.observer.Observer#update()
	 */
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));
	}

}
