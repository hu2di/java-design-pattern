/**
 * 
 */
package io.github.hu2di.transferobject;

/**
 * @author hu2di
 *
 */
public class Run {

	public static void main(String[] args) {
		StudentBO studentBusinessObject = new StudentBO();

		// print all students
		for (StudentVO student : studentBusinessObject.getAllStudents()) {
			System.out.println("Student rollNo: " + student.getRollNo() + ", name: " + student.getName());
		}

		// update a student
		StudentVO studentCu = studentBusinessObject.getAllStudents().get(0);
		studentCu.setName("Mike");
		studentBusinessObject.updateStudent(studentCu);

		// print all students
		for (StudentVO student : studentBusinessObject.getAllStudents()) {
			System.out.println("Student rollNo: " + student.getRollNo() + ", name: " + student.getName());
		}

		// delete a student
		studentBusinessObject.deleteStudent(studentCu);
		
		// print all students
		for (StudentVO student : studentBusinessObject.getAllStudents()) {
			System.out.println("Student rollNo: " + student.getRollNo() + ", name: " + student.getName());
		}
	}
}
