/**
 * 
 */
package io.github.hu2di.visitor;

/**
 * @author hu2di
 *
 */
public interface ComputerPartVisitor {

	public void visit(Computer computer);

	public void visit(Mouse mouse);

	public void visit(Keyboard keyboard);

	public void visit(Monitor monitor);
}
