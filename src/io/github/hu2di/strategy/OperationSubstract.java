/**
 * 
 */
package io.github.hu2di.strategy;

/**
 * @author hu2di
 *
 */
public class OperationSubstract implements Strategy {

	/*
	 * (non-Javadoc)
	 * 
	 * @see io.github.hu2di.strategy.Strategy#doOperation(int, int)
	 */
	@Override
	public int doOperation(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 - num2;
	}

}
