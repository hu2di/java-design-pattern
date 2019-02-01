/**
 * 
 */
package io.github.hu2di.strategy;

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
		Context context = new Context(new OperationAdd());
		System.out.println("100 + 20 = " + context.executeStrategy(100, 20));
		
		context = new Context(new OperationSubstract());
		System.out.println("100 - 20 = " + context.executeStrategy(100, 20));
		
		context = new Context(new OperationMultiply());
		System.out.println("100 * 20 = " + context.executeStrategy(100, 20));
	}

}
