package com.practice.collections;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;

public class FIndArrayListCapacity {

	public static void main(String[] args) throws Exception{
		ArrayList<Integer> list = new ArrayList<>(10);
		System.out.println("ArrayList Capacity : " + getArrayListCapcity(list));
		list.add(8);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		
		System.out.println("ArrayList MinValue Index At : " + list.indexOf(Collections.min(list)));
		
		System.out.println("ArrayLIst Size : " + list.size());
		System.out.println("==========================");
		list.add(11);
		System.out.println("New Size : " + list.size());
		System.out.println("New Capcity  : " + getArrayListCapcity(list));
	}
	
	public static int getArrayListCapcity(ArrayList<Integer> list) throws Exception{
		Field arrayField = ArrayList.class.getDeclaredField("elementData");
		arrayField.setAccessible(true);
		Object[] internalArray = (Object[])arrayField.get(list);
		return internalArray.length;
	}
}
