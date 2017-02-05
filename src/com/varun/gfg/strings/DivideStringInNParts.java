package com.varun.gfg.strings;

/**
 * Created by Varun_Sudan on 1/31/2017.
 */
public class DivideStringInNParts {

	public static void main(String[] args) {
		String inp = "a_simple_divide_string_quest";
		divide(4, inp);
	}

	private static void divide(int n, String org) {

		if(n <=0) {
			System.out.println(n +" can not be less than 0");
			return;
		}

		int length = org.length()/n;
		int i = 0;

		while(i < org.length()) {

			System.out.print(org.charAt(i));
			if((i+1)%length  == 0) {
				System.out.println();
			}

			i++;
		}

	}
}
