package com.practice.collections;

import java.util.Comparator;
import java.util.TreeSet;

/*http://wiki.eclipse.org/EGit/User_Guide#GitHub_Tutorial
*/
public class TestTreeSet {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>(new MyOwnComparator());
		ts.add(10);
		ts.add(20);
		ts.add(30);
		ts.add(10);
		ts.add(40);
		ts.add(-40);
		System.out.println(ts.size());
		System.out.println(ts);
	}

}
class MyOwnComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return (o1 < o2) ? 1 :  (o1 > o2) ? -1 : 0;
		/*if(o1 < o2) return 1;
		else if(o1 > o2) return -1;
		else return 0;*/
	}
	
}
