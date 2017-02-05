package com.varun.gfg.strings;

/**
 * Created by Varun_Sudan on 1/31/2017.
 */
public class ReverseStringUsingRecursion {

	public static void main(String[] args) {
		String inp = "varun";
		System.out.println(reverse(inp));
	}

	private static String reverse(String inp) {
		return new String(reverseR(inp.toCharArray(), 0, inp.length() - 1));
	}

	private static char[] reverseR(char[] inp, int i, int j) {
		if (i >= j) {
			return inp;
		} else {
			char temp = inp[i];
			inp[i] = inp[j];
			inp[j] = temp;
			return reverseR(inp, i+1, j-1);
		}
	}
}
