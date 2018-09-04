package com.programs.logical;

import java.util.Arrays;

public class StringSplit {

	public static void main(String[] args) {
		String inputStr = "gunavardhan @gmail.com";
		String[] splitString = splitString(inputStr);
		for (String splitStrAsWords : splitString) {
			System.out.println(splitStrAsWords);
		}
		
		String[] arraOfStrs = {"hello this is java","this is .Net","It's Python"};
		for (String sentence : arraOfStrs) {
			String[] splitWords = splitString(sentence);
			System.out.println("Words --" +Arrays.toString(splitWords));
		}
	}
	public static String[] splitString(String inputStr){
		if(inputStr == null || inputStr.equals("")){
			return new String[0];
		}
		String[] splitStr = inputStr.split("\\s");
		return splitStr;
	}
}
