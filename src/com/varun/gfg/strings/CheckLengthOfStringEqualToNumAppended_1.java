package com.varun.gfg.strings;

/**
 * Created by Varun_Sudan on 2/1/2017.
 */
public class CheckLengthOfStringEqualToNumAppended_1 {

	public static void main(String[] args) {
		String inp1 = "geeks5";
		String inp2 = "helloworld10";

		System.out.println(check(inp1));
		System.out.println(check(inp2));
	}

	private static boolean check(String sen) {
		int num = 0;
		int pow = 0;
		int numOfDigits = 0;

		for(int i = sen.length() - 1; i >= 0; i--) {
			char c = sen.charAt(i);

			if(Character.isDigit(c)) {
				num += Integer.parseInt(""+c) * (int) Math.pow(10, pow);
				pow++;
				numOfDigits++;
			} else {
				break;
			}
		}

		System.out.println("n = " + numOfDigits);

		int lenOfRestOfString = sen.length() - numOfDigits;

		System.out.println("l = " + lenOfRestOfString);

		if(num == lenOfRestOfString) {
			return true;
		}

		return false;
	}
}
