package com.varun.gfg.strings;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Varun_Sudan on 1/31/2017.
 */
public class CheckAnagram {

	public static void main(String[] args) {
		String s1 = "listen";
		String s2 = "silent";
		System.out.println(isAnagram(s1, s2));
	}

	private static boolean isAnagram(String str1, String str2) {

		Map<Character, Integer> firstStringMap = new HashMap<>();

		for(int i = 0; i < str1.length(); i++) {

			char currChar = str1.charAt(i);
			Integer currCount = firstStringMap.get(currChar);

			if(currCount != null) {
				firstStringMap.put(currChar, currCount + 1);
			} else {
				firstStringMap.put(currChar, 1);
			}
		}

		for(int i = 0; i < str2.length(); i++) {

			char currChar = str2.charAt(i);
			Integer currCount = firstStringMap.get(currChar);

			if(currCount != null && currCount > 1) {
				firstStringMap.put(currChar, currCount - 1);
			} else if(currCount != null && currCount == 1) {
				firstStringMap.remove(currChar);
			} else {
				return false;
			}
		}

		if(firstStringMap.size() == 0) {
			return true;
		}

		return false;
	}
}
