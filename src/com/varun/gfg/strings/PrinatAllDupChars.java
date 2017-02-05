package com.varun.gfg.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

/**
 * Created by Varun_Sudan on 1/31/2017.
 */
public class PrinatAllDupChars {

	public static void main(String[] args) {
		String inp = "test string";
		printDup(inp);
	}

	private static void printDup(String org){
		Map<Character, Integer> charCount = new HashMap<>();

		for(int i = 0; i < org.length(); i++) {
			char currChar = org.charAt(i);
			Integer currCount = charCount.get(currChar);
			if( currCount != null) {
				charCount.put(currChar, currCount + 1);
			} else {
				charCount.put(currChar, 1);
			}
		}

		for(Map.Entry<Character, Integer> entry : charCount.entrySet()) {
			System.out.println(entry.getKey() +" = "+ entry.getValue());
		}
	}
}
