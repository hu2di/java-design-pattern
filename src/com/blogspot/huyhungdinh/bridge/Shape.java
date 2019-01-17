/**
 * 
 */
package com.blogspot.huyhungdinh.bridge;

/**
 * @author hu2di
 *
 */
public abstract class Shape {
	
	protected DrawAPI drawAPI;
	
	protected Shape(DrawAPI drawAPI) {
		this.drawAPI = drawAPI;
	}
	
	public abstract void draw();
}
