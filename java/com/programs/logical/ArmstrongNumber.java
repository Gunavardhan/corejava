package com.programs.logical;

public class ArmstrongNumber {
	
	public static void isArmstrongOrNot(int number){
		int rem = 0;int sum = 0;int temp = 0; 
		temp = number;
		while(number != 0 ){
			rem = number % 10;
			number = number /10;
			sum = sum+(rem*rem*rem);
		}
		if(temp == sum){
			System.out.println("Is Armstrong");
		}else{
			System.out.println("Not armstrong");
			/*https://javatutoring.com/armstrong-number-in-java/
*/		}
	}
	public static void main(String[] args) {
		ArmstrongNumber.isArmstrongOrNot(329);
	}
}
