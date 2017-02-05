package com.varun.gfg.arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Varun_Sudan on 1/25/2017.
 */
public class _2_1_FirstRepeatingEle_118 {

	public int find(int[] inp){
		Set<Integer> visitedEle = new HashSet<>();
		for(int i = 0; i < inp.length; i++) {
			if(!visitedEle.add(inp[i])) {
				return inp[i];
			}
		}
		return Integer.MIN_VALUE;
	}
}
