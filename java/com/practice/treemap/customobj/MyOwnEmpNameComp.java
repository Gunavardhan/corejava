package com.practice.treemap.customobj;

import java.util.Comparator;

public class MyOwnEmpNameComp implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		int res = -e1.getEmpName().compareTo(e2.getEmpName());
		return res;
	}

}
