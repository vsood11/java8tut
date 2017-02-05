package com.varun.gfg.arrays;

/**
 * Created by Varun_Sudan on 1/25/2017.
 */
public class _2_1_MissingNum_5 {

	public int value(int startNum, int endNum, int[] inp) {
		int actualSum = 0;
		int expectedSum = ((endNum - startNum + 1) * (startNum + endNum))/2;

		for(int i = 0; i < inp.length; i++) {
			actualSum += inp[i];
		}

		return (expectedSum - actualSum);
	}
}
