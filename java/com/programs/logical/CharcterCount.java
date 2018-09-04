package com.programs.logical;

public class CharcterCount {

	public static void main(String[] args) {
		String inputStr = "hello elle";
		char inputChar = 'e';
		int charcountGivenString = charcountGivenString(inputStr, inputChar);
		System.out.println("Repeated Charcter count :- " + inputChar + " - "+ charcountGivenString);
	}
	public static int charcountGivenString(String str,char givenChar){
		Integer counter = 0;
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) == givenChar){
				counter++;
			}
		}
		return counter;
	}
}
