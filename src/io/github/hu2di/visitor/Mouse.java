/**
 * 
 */
package io.github.hu2di.visitor;

/**
 * @author hu2di
 *
 */
public class Mouse implements ComputerPart {

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
	}
}
