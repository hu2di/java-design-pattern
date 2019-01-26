/**
 * 
 */
package io.github.hu2di.memento;

/**
 * @author hu2di
 *
 */
public class Originator {
	
	private String state;
	
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public Memento saveStateToMemento() {
		return new Memento(this.state);
	}
	
	public void getStateFromMemento(Memento memento) {
		this.state = memento.getState();
	}
}
