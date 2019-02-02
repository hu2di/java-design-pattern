/**
 * 
 */
package io.github.hu2di.template;

/**
 * @author hu2di
 *
 */
public class Cricket extends Game {

	/*
	 * (non-Javadoc)
	 * 
	 * @see io.github.hu2di.template.Game#initialize()
	 */
	@Override
	void initialize() {
		// TODO Auto-generated method stub
		System.out.println("Cricket game initialized. Start playing!");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see io.github.hu2di.template.Game#startPlay()
	 */
	@Override
	void startPlay() {
		// TODO Auto-generated method stub
		System.out.println("Cricket game started. Enjoy the game!");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see io.github.hu2di.template.Game#endPlay()
	 */
	@Override
	void endPlay() {
		// TODO Auto-generated method stub
		System.out.println("Cricket game finished!");
	}

}
