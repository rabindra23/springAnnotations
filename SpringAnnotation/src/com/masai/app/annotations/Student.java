package com.masai.app.annotations;

import java.util.List;

public class Student {
	
	private int roll;
	private String name;
	private int marks;
	private List <String> call_name;
	
	
    public Student () {}


	public Student(int roll, String name, int marks, List<String> call_name) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.call_name = call_name;
	}


	public int getRoll() {
		return roll;
	}


	public void setRoll(int roll) {
		this.roll = roll;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	public List<String> getCall_name() {
		return call_name;
	}


	public void setCall_name(List<String> call_name) {
		this.call_name = call_name;
	}


	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", call_name=" + call_name + "]";
	}


}