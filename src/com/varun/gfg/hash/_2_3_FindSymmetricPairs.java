package com.varun.gfg.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Varun_Sudan on 2/3/2017.
 */
public class _2_3_FindSymmetricPairs {

	public static void main(String[] args) {
		int[] s= {11, 30, 5, 40, 10};
		int[] e = {20, 40, 10, 30, 5};
		printAymPairs(s, e);
	}

	private static void printAymPairs(int[] s, int[] e) {

		Map<Integer, Integer> sToe = new HashMap<>();

		for(int i = 0; i < s.length; i++) {
			if(sToe.get(e[i]) != null) {
				System.out.println( s[i] + "  ,  " + e[i]);
			} else {
				sToe.put(s[i], e[i]);
			}
		}
	}
}
