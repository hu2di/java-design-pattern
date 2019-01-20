/**
 * 
 */
package io.github.hu2di.bridge;

/**
 * @author hu2di
 *
 */
public class GreenCircle implements DrawAPI {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.blogspot.huyhungdinh.bridge.DrawAPI#drawCircle(int, int, int)
	 */
	@Override
	public void drawCircle(int radius, int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Draw Green Circle: " + "radius: " + radius + ", x: " + x + ", y: " + y);
	}

}
