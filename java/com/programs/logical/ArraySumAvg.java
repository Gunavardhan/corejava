package com.programs.logical;

public class ArraySumAvg {

	public static float sumAndAvgOfArrray(float[] inputArr){
		float sum = 0.0f;
		float avg = 0.0f;
		for(int i = 0; i < inputArr.length; i++ ){
			sum = sum+inputArr[i];
		}
		avg = sum / inputArr.length;
		System.out.println("Sum of Array: " +sum);
		System.out.println("Average Of array: " +avg);
		return sum;
	}
	public static void main(String[] args) {
		float[] inputArr = {1,4,6,2,4};
		ArraySumAvg.sumAndAvgOfArrray(inputArr);
	}
}
