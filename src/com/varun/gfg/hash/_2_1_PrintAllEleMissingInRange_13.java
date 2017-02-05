package com.varun.gfg.hash;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Varun_Sudan on 2/1/2017.
 */
public class _2_1_PrintAllEleMissingInRange_13 {

	public static void main(String[] args) {
		int[] arr = {10, 12, 11, 15};
		int low = 10;
		int high = 15;
		print(arr, low, high);
	}

	private static void print(int[] inp, int low, int high) {
		Set<Integer> eles = new HashSet<>();

		for(int i = 0; i < inp.length; i++) {
			eles.add(inp[i]);
		}

		for(int i = low; i <= high; i++) {
			if(!eles.contains(i)) {
				System.out.print(i + " ");
			}
		}
	}
}
