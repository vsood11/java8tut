package com.varun.gfg.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Varun_Sudan on 1/25/2017.
 */
public class _2_1_MajorityEle {

	public boolean isPresent(int[] eles) {

		for(int i = 0; i < eles.length - 1; i++) {
			int count = 1;

			for(int j = i + 1; j < eles.length; j++) {
				if(eles[j] == eles[i]) {
					count++;
				} else {
					break;
				}
				if(count > (eles.length/2) ) {
					return true;
				}
			}

		}

		return false;
	}

	public boolean isPresent2(int[] eles) {

		Map<Integer,Integer> countMap = new HashMap<>();
		int countToBeat = eles.length/2;

		for(int i = 0; i < eles.length - 1; i++) {
			Integer sum = countMap.get(eles[i]);

			if(sum == null) {
				countMap.put(eles[i], 1);
			} else if(sum > countToBeat) {
				return true;
			} else {
				countMap.put(eles[i], sum + 1);
			}
		}

		return false;
	}

	public boolean isPresent3(int[] eles) {

		Arrays.sort(eles);
		int j = 0;
		int countToBeat = eles.length/2;

		for(int i = 0; i < eles.length; i++) {

			int count = 1;
			j = i + 1;

			while(j < eles.length && eles[j] == eles[i]) {
				count++;
				j++;
			}

			if(count > countToBeat) {
				return true;
			}

			i = j;
		}

		return false;
	}
}
