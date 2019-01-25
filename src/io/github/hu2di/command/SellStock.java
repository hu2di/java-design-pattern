/**
 * 
 */
package io.github.hu2di.command;

/**
 * @author hu2di
 *
 */
public class SellStock implements Order {

	private Stock abcStock;

	public SellStock(Stock abcStock) {
		this.abcStock = abcStock;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see io.github.hu2di.command.Order#executive()
	 */
	@Override
	public void executive() {
		// TODO Auto-generated method stub
		abcStock.sell();
	}

}
