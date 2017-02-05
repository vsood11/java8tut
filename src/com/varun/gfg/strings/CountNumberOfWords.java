package com.varun.gfg.strings;


public class CountNumberOfWords {

	public static void main(String[] args) {
		String inp = "One two          three\n  four\nfive  ";
		System.out.println(count(inp));
	}

	private static long count(String sen) {

		int count = 0;
		char p = sen.charAt(0);

		for(int i = 1; i < sen.length(); i++) {
			char c = sen.charAt(i);
			if(
					(c == ' ' || c == '\n' || c == '\t')
					&&
					!(p == ' ' || p == '\n' || p == '\t')
			){
				count++;
			}
			p = c;
		}
		return count;
	}
}
