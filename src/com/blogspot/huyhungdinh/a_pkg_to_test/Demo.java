/**
 * 
 */
package com.blogspot.huyhungdinh.a_pkg_to_test;

import com.blogspot.huyhungdinh.a_pkg_to_test.child.ClassA;

/**
 * @author hu2di
 *
 */
public class Demo extends ClassA1 {

	public static void main(String[] args) {
		ClassA a = new ClassA();
		System.out.println(a.pubS);

		System.out.println("--------------");
		
		ClassA1 a1 = new ClassA1();

		System.out.println("--------------");
		
		ClassB b = new ClassB();
		System.out.println(b.nonS + "   " + b.pubS + "   " + b.proS);
	}
}
