package com.programs.logical;

public class FindDuplicatesFromArray {

	public static void findDuplicatesFromAarray(int[] inputArr){
		for(int i = 0; i < inputArr.length-1; i++){
			for(int j = i+1; i < inputArr.length; j++){
				if((inputArr[i] == inputArr[j]) && (i != j)){
					System.out.println("Duplicate elements : " + inputArr[j]);
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] inputArr = {1,4,5,6,3,6,12,};
		FindDuplicatesFromArray.findDuplicatesFromAarray(inputArr);
	}
	
}
