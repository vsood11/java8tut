package com.varun.gfg.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PrintAllAnagramTogether {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("cat", "dog", "tac", "god", "act");
		getAnagrams(words);
	}

	private static Map<List<Character>,List<String>> getAnagrams(List<String> words) {

		Map<List<Character> , List<String>> charMap = new HashMap<>();
		List<Character> chars;

		for(String word : words) {
			chars = getChars(word);
			List<String> eles = charMap.get(chars);
			if(eles == null) {
				eles = new ArrayList<>();
			}
			eles.add(word);
			charMap.put(chars, eles);
		}

		for(Map.Entry<List<Character>, List<String>> entry : charMap.entrySet()) {
			System.out.println((entry.getKey()) + " : " + entry.getValue());
		}

		return charMap;
	}

	private static List<Character> getChars(String word) {
		List<Character> chars = new ArrayList<>();

		for(int i = 0; i < word.length(); i++) {
			chars.add(word.charAt(i));
		}

		Collections.sort(chars);
		return chars;
	}
}
