/**
 * 
 */
package io.github.hu2di.interceptingfilter;

/**
 * @author hu2di
 *
 */
public class Client {

	FilterManager filterManager;
	
	public void setFilterManager(FilterManager filterManager) {
		this.filterManager = filterManager;
	}
	
	public void sendRequest(String request) {
		filterManager.filterRequest(request);
	}
}
