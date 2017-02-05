package com.varun.gfg.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Given an array A[] and a number x, check for pair in A[] with sum as x
 */
public class _2_3_SumOfArrayToX_1 {

	public boolean checkSum1(int[] inp, int sum) {

		for (int i = 0; i < inp.length; i++) {
			for (int j = i + 1; j < inp.length; j++) {
				if ((inp[i] + inp[j]) == sum) {
					System.out.println(inp[i] + " + " + inp[j] + " = " + sum);
					return true;
				}
			}
		}

		return false;
	}

	public boolean checkSum2(int[] inp, int sum) {

		Set<Integer> values = new HashSet<Integer>();
		for (int i = 0; i < inp.length; i++) {
			if (values.contains(sum - inp[i])) {
				System.out.println(inp[i] + " + " + (sum - inp[i]) + " = " + sum);
				return true;
			}
			values.add(inp[i]);
		}

		return false;
	}

	public boolean checkSum3(int[] inp, int sum) {

		Arrays.sort(inp);

		int i = 0;
		int j = inp.length - 1;

		while (i < j) {
			int currentSum = (inp[i] + inp[j]);
			if (currentSum == sum) {
				System.out.println(inp[i] + " + " + inp[j] + " = " + sum);
				return true;
			} else if (currentSum < sum) {
				i++;
			} else {
				j--;
			}
		}

		return false;
	}

}
