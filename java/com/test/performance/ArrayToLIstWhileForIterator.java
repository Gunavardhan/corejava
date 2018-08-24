package com.test.performance;

import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ArrayToLIstWhileForIterator {

	public static void main(String[] args) {
		//String[] createArray = ArrayToLIstWhileForIterator.createArray();
		//System.out.println(Arrays.toString(createArray));
		String[] createArray = createArray();
		List<String> list = Arrays.asList(createArray);
		System.out.println("\n-----Iterator Loop-----\n");
		Long lIteratorStartTime = new Date().getTime();
		//iterator loop
		Iterator<String> lIterate = list.iterator();
		while(lIterate.hasNext()){
			String next = lIterate.next();
		}
		Long lIteratorEndTime = new Date().getTime();
		Long lIteratorDiff = lIteratorEndTime - lIteratorStartTime;
		System.out.println("Iteraror - Elapsed time in milliseconds : " + lIteratorDiff);
	}
	public static String[] createArray(){
		String array[] = new String[15000000];
		for (int i = 0; i < array.length; i++) {
			array[i] = "Array" +i; 
		}
		return array;
	}
}
