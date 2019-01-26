/**
 * 
 */
package io.github.hu2di.memento;

/**
 * @author hu2di
 *
 */
public class Memento {

	private String state;

	public Memento(String state) {
		this.state = state;
	}

	public String getState() {
		return this.state;
	}
}
