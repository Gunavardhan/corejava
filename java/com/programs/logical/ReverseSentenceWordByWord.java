package com.programs.logical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ReverseSentenceWordByWord {
	
	public String reverseSentenceWordByWord(String inputStr){
		String outputStr = "";
		String[] strSplit = inputStr.split("\\s");
		System.out.println("input string split into array: "+ Arrays.toString(strSplit));
		for(int i = strSplit.length-1; i>=0; i--){
			/*System.out.println(Arrays.toString(strSplit));*/
			outputStr = outputStr+strSplit[i]+" ";
		}
		return outputStr;
	}
	
	public static void main(String[] args) throws IOException {
		ReverseSentenceWordByWord rsw = new ReverseSentenceWordByWord();
		System.out.println("Enter input string: ");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String inputStr = br.readLine();
		String reverseSentenceWordByWord = rsw.reverseSentenceWordByWord(inputStr);
		System.out.println("Reverse of Given Sentence: " +reverseSentenceWordByWord);
	}

}
