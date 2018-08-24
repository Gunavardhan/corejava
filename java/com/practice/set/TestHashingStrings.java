package com.practice.set;

import java.util.HashSet;

import java.util.Set;
/**
 * 
 * @author Dell
 *
 */
public class TestHashingStrings {

	public static void main(String[] args) {
		System.out.println("Hi");
		Set<String> set = new HashSet<>();
		set.add("Hi");
		set.add("hello");
		set.add("how");
		set.add("Gvr");
		set.add("sag");
		set.add("abc");
		set.add("Guna");
		set.add("xyz");
		set.add("pse");
		set.add("zebra");
		set.add("USA");
		System.out.println(set.size());
	}
}
