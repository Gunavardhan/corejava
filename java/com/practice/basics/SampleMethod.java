package com.practice.basics;

public class SampleMethod {
	
	int id;
	String name;
	String email;
	
	public void store(int id, String name1,String email1){
		this.id = id;
		name = name1;
		email= email1;
	}
	void retrive(){
		System.out.println(id +" "+name+" "+email );
	}
	int calculateRect(int width,int height){		
		return width*height;
	}
	
	public static void main(String[] args) {
		SampleMethod sm = new SampleMethod();
		SampleMethod sm1 = new SampleMethod();
		sm.store(1,"Guna", "gvr@gmail.com");
		sm1.store(2, "dhoni", "dhoni@gmail.com");
		System.out.println("Rectanle Area: " + sm.calculateRect(10, 10));
		sm.retrive();
		sm1.retrive();
	}
}
