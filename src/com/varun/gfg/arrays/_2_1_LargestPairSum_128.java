package com.varun.gfg.arrays;

/**
 * Created by Varun_Sudan on 1/25/2017.
 */
public class _2_1_LargestPairSum_128 {

	public int sum(int[] inp) {

		int maxNum = inp[1] > inp[0] ? inp[1] : inp[0];
		int secondMax = inp[0] < inp[1] ? inp[0] : inp[1];

		for(int i = 2; i < inp.length; i++) {
			if(inp[i] >= maxNum) {
				secondMax = maxNum;
				maxNum = inp[i];
			} else if(inp[i] < maxNum && inp[i] > secondMax) {
				secondMax = inp[i];
			}
		}

		return (maxNum + secondMax);

	}
}
