package com.varun.gfg.arrays;

/**
 * Created by Varun_Sudan on 1/25/2017.
 */
public class _2_1_LostEleFromDup_152 {

	public int lostEle(int[] inp, int[] dup) {

		int minLength = (inp.length < dup.length) ? inp.length : dup.length;

		int inpSum = 0;
		int dupSum = 0;

		for(int i = 0; i < minLength; i++) {
			inpSum += inp[i];
			dupSum += dup[i];
		}

		if(dup.length < inp.length) {
			inpSum += inp[inp.length - 1];
		} else if(dup.length > inp.length){
			dupSum += dup[dup.length - 1];
		}

		return Math.abs(inpSum - dupSum);
	}
}
