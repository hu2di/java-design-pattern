/**
 * 
 */
package io.github.hu2di.compositeentity;

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
		Client client = new Client();
		client.setData("OK", "Durex");
		client.printData();
		client.setData("cocacola", "pepsi");
		client.printData();
	}

}
