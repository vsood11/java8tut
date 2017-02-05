package com.varun.gfg.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by Varun_Sudan on 2/1/2017.
 */
public class ListContainsAllChars {

	public static void main(String[] args) {
		String mask = "sun";
		List<String> words = new ArrayList<>();
		words.add("sunday");
		words.add("utils");
		words.add("SUNTAN");
		words.add("s");
		printList(words, mask);

	}

	private static void printList(List<String> words, String mask) {
		List<Character> chars = new ArrayList<>();

		for(int i = 0; i < mask.length(); i++) {
			chars.add(mask.charAt(i));
		}
		for(String word : words) {
			word = word.toLowerCase();
			if(isPresent(word, chars)) {
				System.out.println("word = " + word);
			}
		}
	}

	private static boolean isPresent(String word, List<Character> chars) {
		int numOfWordsMatched = 0;

		for(int i = 0; i < word.length(); i++) {
			if(chars.contains(word.charAt(i))) {
				numOfWordsMatched++;
			}
		}
		if(chars.size() <= numOfWordsMatched) {
			return true;
		}

		return false;
	}
}
