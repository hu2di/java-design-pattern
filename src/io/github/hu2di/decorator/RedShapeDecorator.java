/**
 * 
 */
package io.github.hu2di.decorator;

/**
 * @author hu2di
 *
 */
public class RedShapeDecorator extends ShapeDecorator {

	/**
	 * @param decoratedShape
	 */
	public RedShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		decoratedShape.draw();
		setRedBorder(decoratedShape);
	}
	
	public void setRedBorder(Shape decoratedShape) {
		System.out.println("Border Color: RED");
	}
}
