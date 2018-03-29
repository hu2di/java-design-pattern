package com.blogspot.huyhungdinh.adapter;

public class OldPerson implements OldPersonInterface{
	
	 private String name;
	 
	 @Override
	 public void setName(String name) {
		 this.name = name;
	 }
	 
	 @Override
	 public String getName() {
		 return this.name;
	 }
}
