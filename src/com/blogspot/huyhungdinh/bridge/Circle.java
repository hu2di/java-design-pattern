/**
 * 
 */
package com.blogspot.huyhungdinh.bridge;

/**
 * @author hu2di
 *
 */
public class Circle extends Shape {

	private int radius, x, y;

	/**
	 * @param drawAPI
	 */
	public Circle(DrawAPI drawAPI, int radius, int x, int y) {
		super(drawAPI);
		// TODO Auto-generated constructor stub
		this.radius = radius;
		this.x = x;
		this.y = y;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.blogspot.huyhungdinh.bridge.Shape#draw()
	 */
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		drawAPI.drawCircle(radius, x, y);
	}

}
