package com.programs.logical;

import java.util.Arrays;

public class PrintGivenAarrayElements {

	public static int[] printArrayOfElemnts(int[] inputArr){
		int [] x= inputArr;
		System.out.print("Input array: " +Arrays.toString(inputArr)+ " "+"\n");
		System.out.print("Given Array Elements : ");
		for(int i = 0; i < inputArr.length; i++){
			int j = inputArr[i];
			System.out.print(j + " ");
		}
		
		return x;
	}
	public static void main(String[] args) {
		
		int[] inputArr = {1,4,5,6,7,8,88};
		int[] printArrayOfElemnts = PrintGivenAarrayElements.printArrayOfElemnts(inputArr );
		System.out.println("\n"+Arrays.toString(printArrayOfElemnts));
	}
}
