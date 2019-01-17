/**
 * 
 */
package com.blogspot.huyhungdinh.bridge;

/**
 * @author hu2di
 *
 */
public class RedCircle implements DrawAPI {

	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Draw Red Circle: " + "radius: " + radius + ", x: " + x + ", y:" + y);
	}
}
