package com.practice.set;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {

	public static void main(String[] args) {
		Employee emp1=new Employee(10, "geetha", "modeln");
		Employee emp2=new Employee(10, "geetha", "modeln");
		Employee emp3=new Employee(30, "cnu112", "modeln");
		/*Employee emp3=new Employee(20, "gautham", "modeln");
		Employee emp4=new Employee(30, "shiva", "adp");
		*/
		//System.out.println(emp1.hashCode());//10
		//System.out.println(emp2.hashCode());//10
	/*	System.out.println(emp3.hashCode());//20
		System.out.println(emp4.hashCode());//30
	*/	
		Set<Employee> set=new HashSet<>();
		set.add(emp1);
		set.add(emp2);
		set.add(emp3);
		/*set.add(emp3);
		set.add(emp4);
			*/
		System.out.println(set);
	
		
	}
}
class Employee{
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return empId+" "+empName+" "+empCompany;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 1000;//empId.hashCode()+empName.hashCode()+empCompany.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
	System.out.println("hello, Java institute-- I'm in equals");
		Employee employee=(Employee) obj;
		if(this.empId.equals(employee.empId) && this.empName.equals(employee.empName) && this.empCompany.equals(employee.empCompany)){
			return true;
		}else{
			return false;
		}
	}
	public Employee(Integer empId, String empName, String empCompany) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empCompany = empCompany;
	}
	private Integer empId;
	private String empName;
	private String empCompany;
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpCompany() {
		return empCompany;
	}
	public void setEmpCompany(String empCompany) {
		this.empCompany = empCompany;
	}
}