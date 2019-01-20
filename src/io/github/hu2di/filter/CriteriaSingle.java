/**
 * 
 */
package io.github.hu2di.filter;

import java.util.List;
import java.util.ArrayList;

/**
 * @author hu2di
 *
 */
public class CriteriaSingle implements Criteria {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.blogspot.huyhungdinh.filter.Criteria#meetCriteria(java.util.List)
	 */
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		// TODO Auto-generated method stub
		List<Person> singlePersons = new ArrayList<Person>();
		for (Person person : persons) {
			if (person.getMaritalStatus().equalsIgnoreCase("SINGLE")) {
				singlePersons.add(person);
			}
		}
		return singlePersons;
	}

}
