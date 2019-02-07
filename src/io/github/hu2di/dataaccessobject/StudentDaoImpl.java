/**
 * 
 */
package io.github.hu2di.dataaccessobject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hu2di
 *
 */
public class StudentDaoImpl implements StudentDao {

	List<Student> students;

	/**
	 * 
	 */
	public StudentDaoImpl() {
		// TODO Auto-generated constructor stub
		students = new ArrayList<Student>();
		Student student1 = new Student("John", 0);
		Student student2 = new Student("Bob", 1);
		students.add(student1);
		students.add(student2);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see io.github.hu2di.dataaccessobject.StudentDao#getAllStudents()
	 */
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see io.github.hu2di.dataaccessobject.StudentDao#getStudent(int)
	 */
	@Override
	public Student getStudent(int rollNo) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * io.github.hu2di.dataaccessobject.StudentDao#updateStudent(io.github.hu2di.
	 * dataaccessobject.Student)
	 */
	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * io.github.hu2di.dataaccessobject.StudentDao#deleteStudent(io.github.hu2di.
	 * dataaccessobject.Student)
	 */
	@Override
	public void deleteStudent(Student student) {
		// TODO Auto-generated method stub

	}

}
