package com.varun.gfg.arrays;

/**
 * Created by Varun_Sudan on 1/25/2017.
 */
public class _2_1_ReverseArray_9 {

	public int[] reverse(int[] inp) {
		int i = 0;
		int j = inp.length - 1;

		while(i < j) {
			int temp = inp[i];
			inp[i] = inp[j];
			inp[j] = temp;
			i++;
			j--;
		}
		return inp;
	}
}
