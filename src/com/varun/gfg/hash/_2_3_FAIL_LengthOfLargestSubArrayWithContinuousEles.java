package com.varun.gfg.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Varun_Sudan on 2/3/2017.
 */
public class _2_3_FAIL_LengthOfLargestSubArrayWithContinuousEles {

	public static void main(String[] args) {
		int[] inp = {1, 56, 58, 57, 90, 92, 94, 93, 91, 45}; //{10, 12, 11};

		for(int i = 0; i < inp.length; i++) {
			System.out.println(inp[i]);
		}

		System.out.println(size(inp));
	}

	private static int size(int[] inp) {

		Map<Integer,Integer> elePos = new HashMap<>();

		for (int i = 0; i < inp.length; ) {
			elePos.put(inp[i], i);
		}

		int maxEndPos = 0;
		int maxSize = 0;

		for (int i = 0; i < inp.length; i++) {
			int currEle = inp[i];
			Integer nextEle = (currEle + 1);

			System.out.println("nE = " + nextEle);
			System.out.println("cE = " + currEle);

/*
			while (elePos.get(nextEle) != null) {
				int index = elePos.get(nextEle);
				maxEndPos = index > maxEndPos ? index : maxEndPos;
				nextEle++;
			}

			int diffBtwnNum = (nextEle - 1) - currEle;
			int maxDiffBtwnPos = (maxEndPos - i);

			System.out.println("maxSize = " + maxSize);

			if (diffBtwnNum == maxDiffBtwnPos) {

				maxSize = diffBtwnNum > maxSize ? diffBtwnNum : maxSize;
				//i += diffBtwnNum;
			}
*/


			System.out.println(i);
		}

		return maxSize + 1;
	}

}
