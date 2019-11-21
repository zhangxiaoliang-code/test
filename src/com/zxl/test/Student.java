package com.zxl.test;

public class Student {

	private int id;
	
	private String name;
	
	private Integer age;
	
	private String other;

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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getOther() {
		return other;
	}

	public void setOther(String other) {
		this.other = other;
	}

	public Student(int id, String name, Integer age, String other) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.other = other;
	}
	
}
