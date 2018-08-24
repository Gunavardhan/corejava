package com.inclass.redbus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class InterviewQuestions {
	
	public static void main(String[] args) {
		
		
		
		
		
	final	List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(10);
		list.add(4);
		list.add(15);
		list.add(17);
		list.add(17);
		
		System.out.println(list);
		
		List<Integer> unmodifiableList = Collections.unmodifiableList(list);
		
		System.out.println(unmodifiableList);	
		
		unmodifiableList.add(102);
		
		/*List<Integer> list2=new ArrayList<>();
		
		for (Integer value : list) {
			if(!list2.contains(value)){
				list2.add(value);
			}
		}
		*/
//		TreeSet<Object> treeSet = new TreeSet<>(list);
//		
//		System.out.println(treeSet);
	}

}
