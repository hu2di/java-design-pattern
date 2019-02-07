/**
 * 
 */
package io.github.hu2di.dataaccessobject;

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
		StudentDao studentDao = new StudentDaoImpl();

		// print all students
		printAllStudent(studentDao);

		// update a student
		Student student = studentDao.getStudent(0);
		student.setName("Max");
		studentDao.updateStudent(student);
		printAllStudent(studentDao);
		
		// delete a student
		studentDao.deleteStudent(student);
		printAllStudent(studentDao);
	}

	// print all students
	private static void printAllStudent(StudentDao studentDao) {
		for (Student student : studentDao.getAllStudents()) {
			System.out.println("Student: rollNo: " + student.getRollNo() + ", name: " + student.getName());
		}
		System.out.println();
	}
}
