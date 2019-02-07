/**
 * 
 */
package io.github.hu2di.dataaccessobject;

import java.util.List;

/**
 * @author hu2di
 *
 */
public interface StudentDao {

	public List<Student> getAllStudents();
	public Student getStudent(int rollNo);
	public void updateStudent(Student student);
	public void deleteStudent(Student student);
}
