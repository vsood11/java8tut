package com.varun.gfg.hash;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Varun_Sudan on 2/3/2017.
 */
public class _2_3_SubArrWithSum0 {

	public static void main(String[] args) {
		int[] inp = {4, 2, -3, 1, 6};
		System.out.println(isPresent(inp));
	}

	private static boolean isPresent(int[] inp) {
		int sumSofar = 0;
		Set<Integer> sumSeenSoFar = new HashSet<>();

		for(int i = 0; i < inp.length; i++) {
			sumSofar += inp[i];
			if(sumSeenSoFar.contains(sumSofar)) {
				return true;
			}
			sumSeenSoFar.add(sumSofar);
		}
		return false;
	}
}
