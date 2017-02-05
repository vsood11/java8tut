package com.varun.gfg.hash;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Varun_Sudan on 2/3/2017.
 */
public class _2_3_Array2IsSubsetOfArray1 {

	public static void main(String[] args) {

		int[] arr1 = {11, 1, 13, 21, 3, 7};
		int[] arr2 = {11, 3, 7, 1};
		System.out.println(isSubset(arr1, arr2));
	}

	private static boolean isSubset(int[] inp1, int[] inp2) {
		Set<Integer> inp1Eles = new HashSet<>();
		for(int i = 0; i < inp1.length; i++) {
				inp1Eles.add(inp1[i]);
		}

		for(int i = 0; i < inp2.length; i++) {
			if(!inp1Eles.contains(inp2[i])) {
				return false;
			}
		}

		return true;
	}
}
