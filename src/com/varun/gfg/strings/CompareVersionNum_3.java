package com.varun.gfg.strings;

import java.util.Arrays;

/**
 * Created by Varun_Sudan on 2/1/2017.
 */
public class CompareVersionNum_3 {

	public static void main(String[] args) {
		String v1 = "1.0.31";
		String v2 = "1.0.27";

		compareStr(v1, v2);
	}

	private static String compareStr(String s1, String s2) {

		System.out.println(s1 + "    " + s2);

		String[] s1Num = s1.split("\\.");
		String[] s2Num = s2.split("\\.");

		System.out.println(Arrays.toString(s1Num));
		System.out.println(Arrays.toString(s2Num));

		int i = 0;
		int j = 0;

 		while(i < s1Num.length && j < s2Num.length) {

			int n1 = Integer.parseInt(s1Num[i]);
			int n2 = Integer.parseInt(s2Num[i]);

			if(n1 < n2) {
				System.out.println(s1);
				return s1;
			} else if (n2 < n1){
				System.out.println(s2);
				return s2;
			}
			i++;
			j++;
		}

		if(i < s1Num.length) {
			return s1;
		}

		if(j < s2Num.length) {
			return s2;
		}

		return s1 + " = " + s2;
	}
}
