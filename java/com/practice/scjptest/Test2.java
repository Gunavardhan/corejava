package com.practice.scjptest;

public class Test2 {     
    int a = 10;
    
    public void doStuff(int a) {
        a += 1;
        System.out.println(++a);
    }
    public static void main(String args[]) {
        Test2 t = new Test2();
        t.doStuff(3);
    }
}