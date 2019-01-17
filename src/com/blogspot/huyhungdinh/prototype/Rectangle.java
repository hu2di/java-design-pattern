package com.blogspot.huyhungdinh.prototype;

/**
 * @author hu2di
 *
 */
public class Rectangle extends Shape {

	public Rectangle() {
		type = "Rectangle";
	}
	
	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method."); 
	}
}
