package com.varun.gfg.hash;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Varun_Sudan on 2/1/2017.
 */
public class _2_1_FindPairsWithSumExistsInAnArr_8 {

	public static void main(String[] args) {
		int arr[] = {2, 8, 7, 1, 5};
		sum(arr);
	}

	private static void sum(int[] inp) {
		Set<Integer> eles = new HashSet<>();

		for(int i = 0; i < inp.length; i++) {
			eles.add(inp[i]);
		}

		for(int i = 0; i < inp.length; i++) {
			for(int j = i + 1; j < inp.length; j++) {
				int sum = inp[i] + inp[j];
				if(eles.contains(sum)) {
					System.out.println(inp[i] + " + " + inp[j] + " = " + sum);
				}
			}
		}
	}
}
