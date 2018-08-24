package com.test.performance;

import java.util.Iterator;
import java.util.Vector;

public class TestIterator {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		v.add(10);
		v.add(20);
		v.add(30);
		Iterator<Integer> iterator = v.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
			iterator.remove();
			//v.remove(new Integer(20));
		}
		System.out.println(v);
	}
}
