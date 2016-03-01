package com.song.ranname.domain;

import java.io.Serializable;
import java.util.Random;

public class Student implements Serializable{

	 private int id;
	 private String name;
	 
	 private int createId(){
		 return new Random().nextInt(100)+1;
	 }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student() {
		 this.id=this.createId();
	}

	public Student(String name) {
		this();
		this.name = name;
	}
	 
	 
}
