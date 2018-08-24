package com.programs.logical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenOrOdd {

	public static boolean isEvenOrOdd(int number){
		if(number % 2 == 0){
			System.out.println("evenr nubmer");
			return true;
		}else{	
			System.out.println("odd");
			return false;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter any number:  ");
		int input  = Integer.parseInt(br.readLine());
		boolean evenOrOdd = EvenOrOdd.isEvenOrOdd(input);
		System.out.println(evenOrOdd);
	}
}
