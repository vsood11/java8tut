package com.varun.gfg.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Varun_Sudan on 2/3/2017.
 */
public class _2_3_LargestSubArrWithSum0 {

	public static void main(String[] args) {
		int[] arr = {1, 0, 3} ; //{15, -2, 2, -8, 1, 7, 10, 23};
		System.out.println(largestSubArr(arr));
	}

	private static int largestSubArr(int[] inp) {
		Map<Integer, Integer> sumSeenBefore = new HashMap<>();

		int sumUptoIthEle = 0;
		int maxLength = 0;

		for(int i = 0; i < inp.length; i++) {
			sumUptoIthEle += inp[i];

			if(sumSeenBefore.get(sumUptoIthEle) != null) {
				int pos = sumSeenBefore.get(sumUptoIthEle);
				maxLength = (i - pos) > maxLength ? (i - pos) : maxLength;
			} else {
				sumSeenBefore.put(sumUptoIthEle, i);
			}
		}

		return maxLength;
	}
}
