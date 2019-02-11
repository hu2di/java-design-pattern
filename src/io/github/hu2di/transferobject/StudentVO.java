/**
 * 
 */
package io.github.hu2di.transferobject;

/**
 * @author hu2di
 *
 */
public class StudentVO {

	private String name;
	private int rollNo;
	
	public StudentVO(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public int getRollNo() {
		return this.rollNo;
	}
}
