/**
 * 
 */
package io.github.hu2di.visitor;

/**
 * @author hu2di
 *
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * io.github.hu2di.visitor.ComputerPartVisitor#visit(io.github.hu2di.visitor.
	 * Computer)
	 */
	@Override
	public void visit(Computer computer) {
		// TODO Auto-generated method stub
		System.out.println("Displaying Computer!");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * io.github.hu2di.visitor.ComputerPartVisitor#visit(io.github.hu2di.visitor.
	 * Mouse)
	 */
	@Override
	public void visit(Mouse mouse) {
		// TODO Auto-generated method stub
		System.out.println("Displaying Mouse!");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * io.github.hu2di.visitor.ComputerPartVisitor#visit(io.github.hu2di.visitor.
	 * Keyboard)
	 */
	@Override
	public void visit(Keyboard keyboard) {
		// TODO Auto-generated method stub
		System.out.println("Displaying Keyboard!");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * io.github.hu2di.visitor.ComputerPartVisitor#visit(io.github.hu2di.visitor.
	 * Monitor)
	 */
	@Override
	public void visit(Monitor monitor) {
		// TODO Auto-generated method stub
		System.out.println("Displaying Monitor!");
	}

}
