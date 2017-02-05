package com.varun.gfg.strings;

/**
 * Created by Varun_Sudan on 2/1/2017.
 */
public class NthCharInConcatDecString_2 {

	public static void main(String[] args) {
		int n = 190;
		System.out.println(get(n));
	}

	private static char get(int n) {

		int charCount = 0;
		int currNumCharCount = 0;
		String s = null;
		int count = 0;

		for(int i = 1; i <= n ; i++) {
			s = ""+i;
			currNumCharCount = (s).length();
			count += currNumCharCount;

			System.out.println(
					"s = " + s +
					" count = " + count +
					"currNumCharCount = " + currNumCharCount
			);

			if(count == n) {
				return s.charAt(currNumCharCount - 1);
			} else if(count > n) {
				int indx = currNumCharCount - (count - n) - 1;
				System.out.println("indx = " + indx);
				return s.charAt(indx);
			}
		}

		return ' ';
	}
}
