/**
 * 
 */
package io.github.hu2di.filter;

import java.util.List;

/**
 * @author hu2di
 *
 */
public interface Criteria {

	public List<Person> meetCriteria(List<Person> persons);
}
