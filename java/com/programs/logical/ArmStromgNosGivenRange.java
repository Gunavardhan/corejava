package com.programs.logical;

import java.util.Scanner;

public class ArmStromgNosGivenRange {
	static Scanner sc = new Scanner(System.in);
	public static void printArmStrongsGivenRange(int startLimit, int endLimit){
		int num,rem; int sum = 0;
		System.out.println("Enter start : " + startLimit);
		System.out.println("Enter start : " + endLimit);
		System.out.println("Armstrong numbers between given range : ");
		for(int i = startLimit; i <= endLimit; i++){
			num = i;
			while(num != 0){
				rem = num % 10;
				sum = sum + (rem * rem * rem);
				num = num/10;
			}
			if(sum == i){
				System.out.println(i + " ");
			}
			sum = 0;
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter Start & End Number ");
		int start = sc.nextInt();
		int end = sc.nextInt();
		//ArmStromgNosGivenRange armStromgNosGivenRange = new ArmStromgNosGivenRange();
		ArmStromgNosGivenRange.printArmStrongsGivenRange(start, end);
	}
}
