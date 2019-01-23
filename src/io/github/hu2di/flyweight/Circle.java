/**
 * 
 */
package io.github.hu2di.flyweight;

/**
 * @author hu2di
 *
 */
public class Circle implements Shape {

	private int x, y, radius;
	private String color;

	public Circle(String color) {
		this.color = color;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("Draw Circle: [" + "x: " + x + ", y: " + y + ", radius: " + radius + ", color: " + color);
	}
}
