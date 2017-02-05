package com.varun.gfg.arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Varun_Sudan on 1/25/2017.
 */
public class _2_1_DistEle_115 {

	public Set<Integer> distinctEle(int[] inp) {
		Set<Integer> distinctEle = new HashSet<>();

		for(int i = 0; i < inp.length; i++) {
			distinctEle.add(inp[i]);
		}

		return distinctEle;
	}
}
