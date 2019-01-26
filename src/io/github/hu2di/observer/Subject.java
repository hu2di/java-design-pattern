/**
 * 
 */
package io.github.hu2di.observer;

import java.util.List;
import java.util.ArrayList;;

/**
 * @author hu2di
 *
 */
public class Subject {

	private List<Observer> observers = new ArrayList<Observer>();
	private int state;

	public int getState() {
		return this.state;
	}

	public void setState(int state) {
		this.state = state;
		notifyAllObservers();
	}
	
	public void attach(Observer observer) {
		observers.add(observer);
	}

	public void notifyAllObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}
}
