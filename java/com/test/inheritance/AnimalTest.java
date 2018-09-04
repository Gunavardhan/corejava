package com.test.inheritance;

public class AnimalTest {
	
	public void method2(Cat cat){
		System.out.println("This is Cat Arg");
	}
	public void method1(Animal aniDog){
		System.out.println("This is Dog arg");
	}
	
	public static void main(String[] args) {
		AnimalTest at = new AnimalTest();
		Animal aniDog = new Dog();
		aniDog.setName("Labra");
		System.out.println(aniDog.getName());
		at.method1(aniDog);
	}
}
