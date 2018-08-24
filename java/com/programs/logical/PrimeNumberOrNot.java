package com.programs.logical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumberOrNot { 
	public static boolean isPrimeOrNot(int number){
		int temp;
		boolean isPrime = true;
		for(int i = 2; i <= number/2; i++){ 
			temp = number % i;
			if(temp == 0){
				isPrime = false;
				break;
			}
		}
		if(isPrime){
			System.out.println("Is Prime");
		}else{
			System.out.println("Not prime");
		}
		return isPrime;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter ANy number: ");
		int number = Integer.parseInt(br.readLine());
		PrimeNumberOrNot.isPrimeOrNot(number);
	}
}
