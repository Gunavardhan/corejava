package com.practice.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EmpTestExec {
	public static void main(String[] args) {
		Map<EmployeeKey,String> hm = new HashMap<>();
		EmployeeKey e1 = new EmployeeKey(1, "Guna");
		EmployeeKey e2 = new EmployeeKey(2, "Dinnu");
		EmployeeKey e3 = new EmployeeKey(4, "Ram");
		EmployeeKey e4 = new EmployeeKey(4, "Ram");
		EmployeeKey e5 = new EmployeeKey(1, "Guna");
		hm.put(e1, "CTS");
		hm.put(e2, "JDA");
		hm.put(e3, "META");
		hm.put(e4, "TCS");
		hm.put(e5, "JDA");
		System.out.println(hm.size());
		Set<Entry<EmployeeKey, String>> entry = hm.entrySet();
		for (Entry<EmployeeKey, String> key : entry) {
			System.out.println(key.getKey().getEmpId() + " : " + key.getValue());
		}
		System.out.println(hm);
	}
}
