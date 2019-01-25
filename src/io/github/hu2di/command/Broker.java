/**
 * 
 */
package io.github.hu2di.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hu2di
 *
 */
public class Broker {
	
	private List<Order> orderList = new ArrayList<Order>();
	
	public void takeOrder(Order order) {
		orderList.add(order);
	}
	
	public void placeOrders() {
		for (Order order : orderList) {
			order.executive();
		}
		orderList.clear();
	}
}
