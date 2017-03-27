package com.blogspot.huyhungdinh.singleton;

public class Run {
	public static void main(String[] args) {
		Database dbMysql = Database.getInstance("Mysql");
		dbMysql.connection();
		Database dbOracle = Database.getInstance("Oracle");
		dbOracle.connection();
	}
}
