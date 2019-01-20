package io.github.hu2di.singleton;

public class LazySingleton {

	private static volatile LazySingleton instance = null;

	private LazySingleton() {

	}

	public static LazySingleton getInstance() {
		if (instance == null) {
			synchronized (LazySingleton.class) {
				if (instance == null) {
					instance = new LazySingleton();
				}
			}
		}

		return instance;
	}
}
