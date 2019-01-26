/**
 * 
 */
package io.github.hu2di.interpreter;

/**
 * @author hu2di
 *
 */
public class OrExpression implements Expression {

	private Expression expr1 = null;
	private Expression expr2 = null;

	public OrExpression(Expression expr1, Expression expr2) {
		this.expr1 = expr1;
		this.expr2 = expr2;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see io.github.hu2di.interpreter.Expression#interpret(java.lang.String)
	 */
	@Override
	public boolean interpret(String context) {
		// TODO Auto-generated method stub
		return expr1.interpret(context) || expr2.interpret(context);
	}

}
