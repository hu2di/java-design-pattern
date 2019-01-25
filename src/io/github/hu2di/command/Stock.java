/**
 * 
 */
package io.github.hu2di.command;

/**
 * @author hu2di
 *
 */
public class Stock {

	private String name = "ABC";
	private int quantity = 10;
	
	public void buy() {
		System.out.println("Stock [name: " + name + ", quantity: " + quantity + "] bought");
	}
	
	public void sell() {
		System.out.println("Stock [name: " + name + ", quantity: " + quantity + "] sold");
	}
}
