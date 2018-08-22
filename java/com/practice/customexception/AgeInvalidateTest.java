package com.practice.customexception;

import java.util.Scanner;

public class AgeInvalidateTest {
	static Scanner sc = null;
	public static void main(String[] args) throws AgeIsNegativeInvalid {
		System.out.println("Enter Age Of person :: ");
		sc = new Scanner(System.in);
		int inputAge = sc.nextInt();
		AgeInvalidateTest.ageOfPerson(inputAge);
	}
	public static void ageOfPerson(int age) throws AgeIsNegativeInvalid{
		try{
			if(age <= 0){
				throw new AgeIsNegativeInvalid("Age Shoould not be negative OR zero");
			}else{
				System.out.println("USER AGE IS : " + age);
			}
		}catch(AgeIsNegativeInvalid e){
			e.printStackTrace();
			//System.out.println(e);
		}
	}
}
