/**
 * 
 */
package io.github.hu2di.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hu2di
 *
 */
public class CareTaker {

	private List<Memento> mementoList = new ArrayList<Memento>();
	
	public void add(Memento memento) {
		mementoList.add(memento);
	}
	
	public Memento get(int index) {
		return mementoList.get(index);
	}
}
