package com.practice.basics;

public class Student {
	public String stdId;
	public String stdName;
	
	public Student(String stdId, String stdName){
		this.stdId = stdId;
		this.stdName = stdName;
	}
	public Student(){
		System.out.println("0 arg constructor executed");
	}
	public static void main(String[] args) {
		//creating object for Student class
		Student std = new Student();
		//accessing properties threw object reference(i.e std)
		std.stdId = "100";
		Integer.parseInt(std.stdId);
		std.stdName="Guna";
		System.out.println("Below Output Is Direct From Varibales");
		System.out.println(std.stdId);
		System.out.println(std.stdName);
		System.out.println("Below Output Is Getting From Constructor Parameters");
		Student student = new Student("1","Guna");
		System.out.println("STD ID: " +Integer.parseInt(student.stdId));
		System.out.println("STD Name: "+student.stdName);
	}
}
