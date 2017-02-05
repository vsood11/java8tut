package com.varun.gfg.strings;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Varun_Sudan on 1/31/2017.
 */
public class RemoveDupCharsFrmFirstStr {

	public static void main(String[] args) {
		String inp = "geeksforgeeks";
		String mask = "mask";
		System.out.println(removeChars(inp, mask));
	}

	private static String removeChars(String org, String mask) {

		if(org == null || mask == null) {
			return org;
		}

		Set<Character> maskChars = new HashSet<>();

		for(int i = 0; i < mask.length(); i++) {
			maskChars.add(mask.charAt(i));
		}

		StringBuffer res = new StringBuffer();

		for(int j = 0; j < org.length(); j++) {
			char curr = org.charAt(j);
			if(!maskChars.contains(curr)){
				res.append(curr);
			}
		}

		return res.toString();
	}
}
