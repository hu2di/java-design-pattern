/**
 * 
 */
package io.github.hu2di.visitor;

/**
 * @author hu2di
 *
 */
public interface ComputerPart {

	public void accept(ComputerPartVisitor computerPartVisitor);
}
