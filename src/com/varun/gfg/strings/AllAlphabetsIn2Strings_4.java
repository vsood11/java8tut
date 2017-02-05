package com.varun.gfg.strings;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Varun_Sudan on 2/1/2017.
 */
public class AllAlphabetsIn2Strings_4 {

	public static void main(String[] args) {
		System.out.println(allAlphabets("abcdefgh", "defghijklmnopqrstuvwxyz"));
	}

	private static boolean allAlphabets(String s1, String s2) {

		Set<Character> alphabets = new HashSet<>();

		for(int i = 'a'; i < 'z'; i++) {
			alphabets.add((char) i);
		}
		alphabets.add('z');

		for(int i = 0; i < s1.length(); i++) {
			alphabets.remove(s1.charAt(i));
		}

		for(int i = 0; i < s2.length(); i++) {
			alphabets.remove(s2.charAt(i));
		}

		if(alphabets.size() == 0) {
			return true;
		} else {
			return false;
		}
	}
}
