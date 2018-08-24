package com.practice.treemap.customobj;

import java.util.Comparator;

public class MyOwnSalaryComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		int result = -e1.getEmpSal().compareTo(e2.getEmpSal());
		return result;
	}
}
