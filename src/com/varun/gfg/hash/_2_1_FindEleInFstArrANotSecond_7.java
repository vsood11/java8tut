package com.varun.gfg.hash;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Varun_Sudan on 2/1/2017.
 */
public class _2_1_FindEleInFstArrANotSecond_7 {

	public static void main(String[] args) {

		int[] a = {1, 2, 3, 4, 5, 10};
		int[] b = {2, 3, 1, 0, 5};

		find(a, b);
	}

	private static void find(int[] f, int[] s) {

		Set<Integer> presentInSec = new HashSet<>();
		Set<Integer> presentInFirstOnly = new HashSet<>();

		for(int i = 0; i < s.length; i++) {
			presentInSec.add(s[i]);
		}

		for(int i = 0; i < f.length; i++) {
			if(!presentInSec.contains(f[i])) {
				presentInFirstOnly.add(f[i]);
			}
		}

		presentInFirstOnly.stream().forEach(System.out::println);
	}
}
