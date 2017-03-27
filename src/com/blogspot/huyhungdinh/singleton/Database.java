package com.blogspot.huyhungdinh.singleton;

public class Database {
	private String name;
	private static Database instance;
	//private static Database instance = new Database("x");

	private Database(String name) {
		this.name = name;
		System.out.println("Create " + this.name);
	}

	public static synchronized Database getInstance(String name) {
		if (instance == null) {
			instance = new Database(name);
		}
		return instance;
	}

	public void connection() {
		System.out.println("Connect to " + name);
	}
}
