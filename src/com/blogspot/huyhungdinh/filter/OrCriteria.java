/**
 * 
 */
package com.blogspot.huyhungdinh.filter;

import java.util.List;

/**
 * @author hu2di
 *
 */
public class OrCriteria implements Criteria {

	private Criteria criteria;
	private Criteria otherCriteria;

	/**
	 * @param criteria
	 * @param otherCriteria
	 */
	public OrCriteria(Criteria criteria, Criteria otherCriteria) {
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.blogspot.huyhungdinh.filter.Criteria#meetCriteria(java.util.List)
	 */
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		// TODO Auto-generated method stub
		List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
		List<Person> otherCriteriaItems = otherCriteria.meetCriteria(persons);
		for (Person person : otherCriteriaItems) {
			if (!firstCriteriaItems.contains(person)) {
				firstCriteriaItems.add(person);
			}
		}
		return firstCriteriaItems;
	}

}
