package com.customize.equalsandhascode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class StdTestExce {

	public static void main(String[] args) {
		Student s1 = new Student("VG234","Guna");
		Student s2 = new Student("VG239","Dinesh");
		Student s3 = new Student("VG234","Guna");
		Student s4 = new Student("VG567","Dhoni");
		HashSet<Student> hashSet = new HashSet<>();
		hashSet.add(s1);
		hashSet.add(s2);
		hashSet.add(s3);
		hashSet.add(s4);
		//System.out.println(s1.equals(s3));
		
		HashMap<Student, ReportCard> hashMap = new HashMap<>();
		hashMap.put(s1, new ReportCard("Poor",40));
		hashMap.put(s2, new ReportCard("Good",70));
		hashMap.put(s3, new ReportCard("AVerage",60));//Over ride -> s1
		hashMap.put(s4, new ReportCard("Poor", 45));
		//System.out.println(hashMap);
		System.out.println(hashMap.size());
		Set<Entry<Student, ReportCard>> entrySet = hashMap.entrySet();
		System.out.println("STDUENT ID :    " +" STUDENT NAME   :     " + "Maths Marks   :  " + "    WeeK Report");
		System.out.println("-------------------------------------------------------------------------------------");
		for (Entry<Student, ReportCard> getStdInfo : entrySet) {
			System.out.println(getStdInfo.getKey().getStdNumber() + "            " + getStdInfo.getKey().getStdName() + "             "+ getStdInfo.getValue().getStdMathsmarks() + "                      " + getStdInfo.getValue().getWeekReport());
		}
		
	}
}
