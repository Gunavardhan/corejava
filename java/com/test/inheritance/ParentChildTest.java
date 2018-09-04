package com.test.inheritance;

public class ParentChildTest {

	public static void main(String[] args) {
		ParentP p = new ParentP();
		p.assets();
		p.marraige();
		ChildC c = new ChildC();
		c.assets();
		c.marraige();
		ParentP p1 = new ChildC();
		p1.assets();
		p1.marraige();
		
	}
}
