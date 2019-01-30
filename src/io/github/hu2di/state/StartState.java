/**
 * 
 */
package io.github.hu2di.state;

/**
 * @author hu2di
 *
 */
public class StartState implements State {

	@Override
	public void doAction(Context context) {
		System.out.println("Player is in start state");
		context.setState(this);
	}
	
	public String toString() {
		return "Start State";
	}
}
