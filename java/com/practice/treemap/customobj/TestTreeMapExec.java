package com.practice.treemap.customobj;

import java.util.Set;
import java.util.TreeMap;

public class TestTreeMapExec {

	public static void main(String[] args) {
		//By Using name comparator (string comparison)
		TreeMap<Employee, String> treeMap = new TreeMap<>(new MyOwnEmpNameComp());
		treeMap.put(new Employee(1, "Guna", 35000f), "Gunavardhan");
		treeMap.put(new Employee(2, "Pawan", 55000f), "Pawan");
		treeMap.put(new Employee(3, "Dhoni", 65000f), "Dhoni");
		Set<Employee> keys = treeMap.keySet();
		System.out.println("=========SORTING BY NAME ASC=======");
		for (Employee key : keys) {
			System.out.println(key+ " =>"+ treeMap.get(key));
		}
		
		//By using salary comparator (Float Comparison)
		System.out.println("=========SORTING BY SALARY DESC=============");
		TreeMap<Employee, String> treeMap1 = new TreeMap<>(new MyOwnSalaryComparator());
		treeMap1.put(new Employee(1, "Guna", 35000f), "Gunavardhan");
		treeMap1.put(new Employee(2, "Pawan", 55000f), "Pawan");
		treeMap1.put(new Employee(3, "Dhoni", 65000f), "Dhoni");
		Set<Employee> ks = treeMap1.keySet();
		for (Employee key : ks) {
			System.out.println(key + " => " + treeMap1.get(key));
		}
	}
}
