/**
 * 
 */
package io.github.hu2di.interceptingfilter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hu2di
 *
 */
public class FilterChain {

	private List<Filter> filters = new ArrayList<Filter>();
	private Target target;
	
	public void addFilter(Filter filter) {
		filters.add(filter);
	}
	
	public void setTarget(Target target) {
		this.target = target;
	}
	
	public void execute(String request) {
		for (Filter filter : filters) {
			filter.execute(request);
		}
		target.execute(request);
	}
}
