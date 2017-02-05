package com.varun.gfg.strings;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Varun_Sudan on 2/1/2017.
 */
public class ReverseWordsInAGivenString {

	public static void main(String[] args) {
		String sen = "i love programming very much";
		reverseWords(sen);
	}

	private static void reverseWords(String sen){

		List<StringBuffer> words = new ArrayList<>();
		StringBuffer word = new StringBuffer();

		for(int i = 0; i < sen.length(); i++) {
			char c = sen.charAt(i);
			if(c == ' '){
				words.add(word);
				word = new StringBuffer();
			} else {
				word.append(c);
			}
		}
		words.add(word);

		for(int i = words.size() - 1; i >= 0; i--) {
			System.out.print(words.get(i)+ " ");
		}
	}
}
