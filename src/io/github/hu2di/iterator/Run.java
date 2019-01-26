/**
 * 
 */
package io.github.hu2di.iterator;

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
		NameRepository nameRepository = new NameRepository();
		for (Iterator iter = nameRepository.getIterator(); iter.hasNext();) {
			String name = (String)iter.next();
			System.out.println("Name: " + name);
		}
	}

}
