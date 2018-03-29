package com.blogspot.huyhungdinh.singleton;

import java.util.Random;

public class Database {

	private static Database instance = new Database();
	private int name;

	private Database() {
		this.name = new Random().nextInt(100);
		System.out.println("Create " + this.name);
	}

	public static Database getInstance() {
		return instance;
	}

	public void connection() {
		System.out.println("Connect to " + name);
	}
}
