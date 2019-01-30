/**
 * 
 */
package io.github.hu2di.state;

/**
 * @author hu2di
 *
 */
public class StopState implements State {

	@Override
	public void doAction(Context context) {
		System.out.println("Player is in stop state");
		context.setState(this);
	}
	
	public String toString() {
		return "Stop State";
	}
}
