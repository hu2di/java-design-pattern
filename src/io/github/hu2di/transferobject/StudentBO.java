/**
 * 
 */
package io.github.hu2di.transferobject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hu2di
 *
 */
public class StudentBO {

	List<StudentVO> students;

	public StudentBO() {
		students = new ArrayList<StudentVO>();
		StudentVO student1 = new StudentVO("John", 0);
		StudentVO student2 = new StudentVO("Henry", 1);
		students.add(student1);
		students.add(student2);
	}

	public List<StudentVO> getAllStudents() {
		return students;
	}

	public void deleteStudent(StudentVO student) {
		students.remove(student.getRollNo());
		System.out.println("Student rollNo: " + student.getRollNo() + " deleted");
	}

	public void updateStudent(StudentVO student) {
		students.get(student.getRollNo()).setName(student.getName());
		System.out.println("Student rollNo: " + student.getRollNo() + " updated");
	}
}
