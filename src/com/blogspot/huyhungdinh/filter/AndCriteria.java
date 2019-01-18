/**
 * 
 */
package com.blogspot.huyhungdinh.filter;

import java.util.List;

/**
 * @author hu2di
 *
 */
public class AndCriteria implements Criteria {

	private Criteria criteria;
	private Criteria otherCriteria;

	public AndCriteria(Criteria criteria, Criteria otherCriteria) {
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
		List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
		return otherCriteria.meetCriteria(firstCriteriaPersons);
	}

}
