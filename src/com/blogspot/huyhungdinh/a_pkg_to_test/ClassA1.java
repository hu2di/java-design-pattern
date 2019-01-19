/**
 * 
 */
package com.blogspot.huyhungdinh.a_pkg_to_test;

import com.blogspot.huyhungdinh.a_pkg_to_test.child.ClassA;

/**
 * @author hu2di
 *
 */
public class ClassA1 extends ClassA {

	public ClassA1() {
		System.out.println("Class A1 extends A Constructor");
		System.out.println(pubS + "   " + proS);
	}
}
