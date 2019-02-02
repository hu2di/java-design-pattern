/**
 * 
 */
package io.github.hu2di.template;

/**
 * @author hu2di
 *
 */
public class Run {

	public static void main(String[] args) {
		Game game = new Cricket();
		game.play();
		System.out.println();
		game = new Football();
		game.play();
	}
}
