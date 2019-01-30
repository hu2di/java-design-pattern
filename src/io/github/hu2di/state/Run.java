/**
 * 
 */
package io.github.hu2di.state;

/**
 * @author hu2di
 *
 */
public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context context = new Context();
		
		StartState startState = new StartState();
		startState.doAction(context);
		System.out.println(context.getState().toString());
		
		StopState stopState = new StopState();
		stopState.doAction(context);
		System.out.println(context.getState().toString());
	}

}
