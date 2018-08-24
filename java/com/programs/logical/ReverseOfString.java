package com.programs.logical;

public class ReverseOfString {

	public static String reverseOfString(String inputStr){
		String outputString = "";
		for(int i = inputStr.length()-1; i>=0; i-- ){
			outputString = outputString+inputStr.charAt(i);
		}
		return outputString;
	}
	public static void main(String[] args) {
		String inputStr = "gunavardhan";
		String reverseOfString = ReverseOfString.reverseOfString(inputStr);
		System.out.println("Reverse of Given String: " +reverseOfString);
	}
}
