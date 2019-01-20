/**
 * 
 */
package io.github.hu2di.bridge;

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
		Shape redCircle = new Circle(new RedCircle(), 10, 100, 100);
		Shape greenCircle = new Circle(new GreenCircle(), 10, 100, 100);
		
		redCircle.draw();
		greenCircle.draw();
	}

}
