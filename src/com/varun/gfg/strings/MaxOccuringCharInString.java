package com.varun.gfg.strings;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Varun_Sudan on 1/31/2017.
 */
public class MaxOccuringCharInString {

	public static void main(String[] args) {

		char val = maxOccuringChar("geeksforgeeeks");
		System.out.println(val);
	}

	private static char maxOccuringChar(String org) {

		Map<Character, Integer> charCount = new HashMap<>();
		org  = org.toLowerCase();

		for(int i = 0; i < org.length(); i++) {
			char currChar = org.charAt(i);
			Integer currCount = charCount.get(currChar);

			if(currCount != null) {
				charCount.put(currChar, currCount + 1);
			} else {
				charCount.put(currChar, 1);
			}
		}

		int maxCount = 0;
		char charWithMaxCount = ' ';

		for(Map.Entry<Character,Integer> entry : charCount.entrySet()) {
			if(entry.getValue() > maxCount) {
				charWithMaxCount = entry.getKey();
				maxCount = entry.getValue();
				System.out.println(entry.getKey() + "  = " + entry.getValue());
			}
		}

		return charWithMaxCount;
	}
}
