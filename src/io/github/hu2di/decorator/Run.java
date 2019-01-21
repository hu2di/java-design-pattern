/**
 * 
 */
package io.github.hu2di.decorator;

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
		Shape circle = new Circle();
		Shape redCircle = new RedShapeDecorator(new Circle());
		Shape redRectangle = new RedShapeDecorator(new Rectangle());
		
		System.out.println("Circle with normal border!");
		circle.draw();
		
		System.out.println("\nCircle with RED border!");
		redCircle.draw();
		
		System.out.println("\nRectangle with RED border!");
		redRectangle.draw();
	}

}
