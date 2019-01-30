/**
 * 
 */
package io.github.hu2di.state;

/**
 * @author hu2di
 *
 */
public class Context {

	private State state;
	
	public Context() {
		state = null;
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public State getState() {
		return this.state;
	}
}
