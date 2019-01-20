/**
 * 
 */
package io.github.hu2di.prototype;

import java.util.Hashtable;

/**
 * @author hu2di
 *
 */
public class ShapeCache {

	private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

	public static Shape getShape(String shapeId) {
		Shape cachedShape = shapeMap.get(shapeId);
		return (Shape) cachedShape.clone();
	}

	// for each shape run database query and create shape
	// shapeMap.put(shapeKey, shape);
	// for example, we are adding three shapes

	public static void loadCache() {
		Rectangle rectangle = new Rectangle();
		rectangle.setId("1");
		shapeMap.put(rectangle.getId(), rectangle);

		Square square = new Square();
		square.setId("2");
		shapeMap.put(square.getId(), square);

		Circle circle = new Circle();
		circle.setId("3");
		shapeMap.put(circle.getId(), circle);
	}
}
