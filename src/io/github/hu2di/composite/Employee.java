/**
 * 
 */
package io.github.hu2di.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hu2di
 *
 */
public class Employee {

	private String name;
	private String dept;
	private int salary;
	private List<Employee> subordinates;

	public Employee(String name, String dept, int salary) {
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		subordinates = new ArrayList<Employee>();
	}

	public void addEmployee(Employee e) {
		subordinates.add(e);
	}

	public void removeEmployee(Employee e) {
		subordinates.remove(e);
	}

	public List<Employee> getSubordinates() {
		return subordinates;
	}

	public String toString() {
		return "Employee: " + "[" + "name: " + name + ", dept: " + dept + ", salary: " + salary + "]";
	}
}
