package com.blogspot.huyhungdinh.prototype;

public class Circle extends Shape {

	public Circle() {
		// TODO Auto-generated constructor stub
		type = "Circle";
	}

	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}
}
