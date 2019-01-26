/**
 * 
 */
package io.github.hu2di.observer;

/**
 * @author hu2di
 *
 */
public abstract class Observer {

	protected Subject subject;
	public abstract void update();
}
