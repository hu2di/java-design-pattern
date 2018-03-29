package com.blogspot.huyhungdinh.singleton;

public class Run {
	public static void main(String[] args) {
		Database db1 = Database.getInstance();
		db1.connection();
		Database db2 = Database.getInstance();
		db2.connection();
	}
}
