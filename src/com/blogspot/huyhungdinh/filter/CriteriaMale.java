/**
 * 
 */
package com.blogspot.huyhungdinh.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hu2di
 *
 */
public class CriteriaMale implements Criteria {

	/* (non-Javadoc)
	 * @see com.blogspot.huyhungdinh.filter.Criteria#meetCriteria(java.util.List)
	 */
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		// TODO Auto-generated method stub
		List<Person> malePersons = new ArrayList<Person>();
		for (Person person : persons) {
			if (person.getGender().equalsIgnoreCase("MALE")) {
				malePersons.add(person);
			}
		}
		return malePersons;
	}

}
