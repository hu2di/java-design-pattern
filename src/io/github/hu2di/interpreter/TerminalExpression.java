/**
 * 
 */
package io.github.hu2di.interpreter;

/**
 * @author hu2di
 *
 */
public class TerminalExpression implements Expression {

	private String data;

	public TerminalExpression(String data) {
		this.data = data;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see io.github.hu2di.interpreter.Expression#interpret(java.lang.String)
	 */
	@Override
	public boolean interpret(String context) {
		// TODO Auto-generated method stub
		if (context.contains(data)) {
			return true;
		}
		return false;
	}
}
