package com.varun.gfg.strings;

import java.util.Arrays;

/**
 * Created by Varun_Sudan on 1/31/2017.
 */
public class RemoveAllDupChars {

	public static void main(String[] args) {
		String inp = "geeksforgeeks";
		removeDup(inp);
	}

	private static void removeDup(String org){

		char[] charArray = org.toCharArray();
		Arrays.sort(charArray);
		System.out.println(charArray);

		int j = -1;
		int i = 0;
		while(i < org.length() - 1) {
			System.out.print(charArray[i]);
			j = i + 1;
			while((j < org.length()) && (charArray[i] == charArray[j])) {
				j++;
			}
			i = j;
		}
	}
}
