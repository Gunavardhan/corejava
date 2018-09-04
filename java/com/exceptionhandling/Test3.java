package com.exceptionhandling;


public class Test3 {
	public void m1(int a){
		System.out.println("int arg : " + a);
	}
	public void m1(Integer a){
		System.out.println("Integer arg - " + a);
	}
	public void m1(Character c){
		System.out.println("Charcter arg - " + c);
	}
	
	public static int m1(){
		try{
			int i = 1;
			int j = 0;
			int c = i/j;
			System.out.println(c);
			//throw new ArithmeticException();
		}catch(Exception e){
			return 0;
		}finally{
			System.out.println("finally");
		}
		return 10;
	}

	public static void main(String[] args) {			
		int m1 = m1();
		System.out.println(m1);
		Test3 t3 = new Test3();
		t3.m1(10);
		t3.m1(new Integer(10));
		//t3.m1(null);
		t3.m1('a');
	}
}
