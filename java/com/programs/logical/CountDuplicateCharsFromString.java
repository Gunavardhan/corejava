package com.programs.logical;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountDuplicateCharsFromString {

	public static void main(String[] args) {
		countDuplicateCharsGivenString("hydgvkvrghansidin");
	}
	
	public static void countDuplicateCharsGivenString(String inputStr){
		int count = 0;
		char c;
		Map<Character,Integer> map = new HashMap<>();
		for(int i = 0; i < inputStr.length(); i++){
			c = inputStr.charAt(i);
			if(map.containsKey(c)){
				count = map.get(c);
				map.put(c, ++count);
			} else{
				map.put(c, 1);
			}
		}
		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		for (Entry<Character, Integer> key : entrySet) {
			System.out.println(key.getKey() + " : " + key.getValue());
		}
		//System.out.println(map);
	}
	
}
