package com.varun.gfg.arrays;

/**
 * Created by Varun_Sudan on 1/25/2017.
 */
public class _2_1_NumOddTimes {

	public int isPresent(int[] inp) {
		int num = 0;
		for(int i = 0; i < inp.length; i++) {
			num = num ^ inp[i];
		}
		return num;
	}
}
