/**
 * 
 */
package io.github.hu2di.composite;

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
		Employee CEO = new Employee("Hung", "CEO", 100000);
		
		Employee headMarketing = new Employee("Supertramp", "Head Marketing", 50000);
		Employee headSales = new Employee("Henry", "Head Sales", 50000);
		
		Employee clerk1 = new Employee("Chuck", "Marketing", 1000);
		Employee clerk2 = new Employee("Norris", "Marketing", 1000);
		
		Employee salesExecutive1 = new Employee("Jon Snow", "Sales", 1000);
		Employee salesExecutive2 = new Employee("John Cena", "Sales", 1000);
				
		CEO.addEmployee(headMarketing);
		CEO.addEmployee(headSales);
		
		headMarketing.addEmployee(clerk1);
		headMarketing.addEmployee(clerk2);
		
		headSales.addEmployee(salesExecutive1);
		headSales.addEmployee(salesExecutive2);
		
		System.out.println(CEO);
		for (Employee headEmployee : CEO.getSubordinates()) {
			System.out.println(headEmployee);
			for (Employee employee : headEmployee.getSubordinates()) {
				System.out.println(employee);
			}
		}
	}

}
