package com.customize.equalsandhascode;

public class Student {
	private String stdNumber;
	private String stdName;
	public Student(){}
	
	public Student(String stdNumber, String stdName){
		this.stdNumber = stdNumber;
		this.stdName = stdName;
	}
	
	public String getStdNumber() {
		return stdNumber;
	}

	public void setStdNumber(String stdNumber) {
		this.stdNumber = stdNumber;
	}
	
	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null){
			return false;
		}
		Student s = (Student) obj;
		if(s instanceof Student){
			if(s.stdNumber !=null && this.stdNumber.equals(s.stdNumber) && s.stdName !=null && this.stdName.equals(s.stdName)){
				System.out.println("Entered into equals when only objects are equal");
				return true;
			}else{
				return false;
			}
		}
		return false;
	}
	@Override
	public int hashCode() {
		int hash = 3;
		hash = 53 * hash + (this.stdNumber != null ? this.stdNumber.hashCode() : 0);
		hash = 53 *  hash +(this.stdName != null ? this.stdNumber.hashCode() : 0);
		//hash = 53 * hash + this.no;
		System.out.println("Hashcodes Of objects : " +hash);
		return hash;
	}
	@Override
	public String toString() {
		return "Student [stdNumber=" + stdNumber + ", stdName=" + stdName + "]";
	}
	
}
