/**
 * 
 */
package com.blogspot.huyhungdinh.filter;

import java.util.List;
import java.util.ArrayList;

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
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Robert", "Male", "Single"));
		persons.add(new Person("John", "Male", "Married"));
		persons.add(new Person("Laura", "Female", "Married"));
		persons.add(new Person("Diana", "Female", "Single"));
		persons.add(new Person("Mike", "Male", "Single"));
		persons.add(new Person("Bob", "Male", "Single"));

		Criteria male = new CriteriaMale();
		Criteria female = new CriteriaFemale();
		Criteria single = new CriteriaSingle();
		Criteria singleMale = new AndCriteria(male, single);
		Criteria singleOrFemale = new OrCriteria(single, female);
		
		System.out.println("\nMALES: ");
		printPersons(male.meetCriteria(persons));
		
		System.out.println("\nFEMALES: ");
		printPersons(female.meetCriteria(persons));
		
		System.out.println("\nSINGLES: ");
		printPersons(single.meetCriteria(persons));
		
		System.out.println("\nSINGLE MALES: ");
		printPersons(singleMale.meetCriteria(persons));
		
		System.out.println("\nSINGLE OR FEMALES: ");
		printPersons(singleOrFemale.meetCriteria(persons));
	}

	public static void printPersons(List<Person> persons) {
		for (Person person : persons) {
			System.out.println("Person: " + "[name: " + person.getName() + "; gender: " + person.getGender()
					+ "; maritalStatus: " + person.getMaritalStatus() + "]");
		}
	}
}
