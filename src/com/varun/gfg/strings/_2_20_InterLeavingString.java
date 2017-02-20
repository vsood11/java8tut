package com.varun.gfg.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Varun_Sudan on 2/20/2017.
 */
public class _2_20_InterLeavingString {

	public static void main(String[] args) {

		String s1 = "abc";
		String s2 = "def";
		String s3 = ""; // "adbecf" : true ; "abcedf" : false ; "kef" : true ; "abcefd" : false
		System.out.println("" + isInterLeaving(s1, s2, s3));

	}

	public static boolean isInterLeaving(String s1, String s2, String s3) {

		if(s1 == null || s2 == null || s3 == null || s1.isEmpty() || s2.isEmpty() || s3.isEmpty()) {
			return false;
		}

		Map<Character, Integer> s1CharList = new HashMap<>();
		Map<Character, Integer> s2CharList = new HashMap<>();

		for(int i = 0; i < s1.length(); i++) {
			s1CharList.put(s1.charAt(i), i);
		}

		for(int i = 0; i < s2.length(); i++) {
			s2CharList.put(s2.charAt(i), i);
		}

		char currChar = ' ';
		int indxOfPrevCharFoundInS1 = -1;
		int indxOfPrevCharFoundInS2 = -1;

		for(int i = 0; i < s3.length(); i++){
			currChar = s3.charAt(i);

			Integer indxInS1 = s1CharList.get(currChar);
			Integer indxInS2 = s2CharList.get(currChar);

			if(indxInS1 != null && indxInS1 < indxOfPrevCharFoundInS1) {
				return false;
			} else if(indxInS1 != null && indxInS1 > indxOfPrevCharFoundInS1) {
				indxOfPrevCharFoundInS1 = indxInS1;
			}


			if(indxInS2 != null && indxInS2 < indxOfPrevCharFoundInS2) {
				return false;
			} else if(indxInS2 != null && indxInS2 > indxOfPrevCharFoundInS2) {
				indxOfPrevCharFoundInS2 = indxInS2;
			}

		}

		return true;
	}
}
