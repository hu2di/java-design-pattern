/**
 * 
 */
package io.github.hu2di.mvc;

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
		Student model = receiveStudentFromDatabase();
		StudentView view = new StudentView();
		StudentController controller = new StudentController(model, view);
		
		controller.updateView();
		controller.setStudentName("Adam");
		controller.updateView();
	}
	
	private static Student receiveStudentFromDatabase() {
		Student student = new Student();
		student.setName("Lona");
		student.setRollNo("10");
		return student;
	}
}
