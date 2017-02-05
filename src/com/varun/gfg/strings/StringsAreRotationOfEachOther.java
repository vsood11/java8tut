package com.varun.gfg.strings;


public class StringsAreRotationOfEachOther {

	public static void main(String[] args) {
/*		String s1 = "ABCD";
		String s2 = "CDAB";*/

		String s1 = "ABCD";
		String s2 = "ACBD";

		System.out.println(stringRotation(s1, s2));
	}

	private static boolean stringRotation(String inp1, String inp2) {

		if(inp1 == null || inp2 == null) {
			return false;
		}

		if(inp1.length() != inp2.length()) {
			return false;
		}

		char firstChar = inp1.charAt(0);
		int firstIndxOfSelectedChar = -1;

		for(int i = 0; i < inp2.length(); i++) {
			if (inp2.charAt(i) == firstChar) {
				firstIndxOfSelectedChar = i;
				break;
			}
		}

		if(firstIndxOfSelectedChar == -1) {
			return false;
		}

		int j = 0;

		for(int i = firstIndxOfSelectedChar; i < inp2.length(); i++) {
			if(inp1.charAt(j) != inp2.charAt(i)){
				return false;
			}
			j++;
		}

		for(int i = 0; i < firstIndxOfSelectedChar; i++) {
			if(inp1.charAt(j) != inp2.charAt(i)){
				return false;
			}
			j++;
		}

		return true;
	}
}
