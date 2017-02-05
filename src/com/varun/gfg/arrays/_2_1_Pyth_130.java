package com.varun.gfg.arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Varun_Sudan on 1/25/2017.
 */
public class _2_1_Pyth_130 {

	public boolean pythTriplet(int[] inp) {

		Set<Integer> squareValues = new HashSet<>();
		for(int i = 0; i < inp.length; i++) {
			squareValues.add(inp[i]*inp[i]);
		}

		for(int i = 0; i < inp.length; i++) {
			for(int j = i + 1; j < inp.length; j++) {
				int sqSum = (inp[i] * inp[i] + inp[j] * inp[j]);
				if(squareValues.contains(sqSum)) {
					System.out.println(inp[i] + " , " + inp[j] + " , " + Math.sqrt(sqSum));
					return true;
				}
			}
		}

		return false;
	}
}
