/**
 * 
 */
package io.github.hu2di.visitor;

/**
 * @author hu2di
 *
 */
public class Monitor implements ComputerPart {

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
	}
}
