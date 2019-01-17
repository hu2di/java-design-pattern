/**
 * 
 */
package com.blogspot.huyhungdinh.prototype;

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
		ShapeCache.loadCache();

		Shape clonedShape1 = (Shape) ShapeCache.getShape("1");
		System.out.println("Shape: " + clonedShape1.getType());
		
		Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
		System.out.println("Shape: " + clonedShape2.getType());
		
		Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
		System.out.println("Shape: " + clonedShape3.getType());
	}

}
