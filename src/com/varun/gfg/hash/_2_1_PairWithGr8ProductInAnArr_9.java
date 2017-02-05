package com.varun.gfg.hash;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Varun_Sudan on 2/1/2017.
 */
public class _2_1_PairWithGr8ProductInAnArr_9 {

	public static void main(String[] args){
		int[] inp = {10, 3, 5, 30, 35};
		product(inp);
	}

	private static void product(int[] inp) {
		Set<Integer> eles = new HashSet<>();

		for(int i = 0; i < inp.length; i++) {
			eles.add(inp[i]);
		}

		for(int i = 0; i < inp.length; i++) {
			for(int j = i + 1; j < inp.length; j++) {
				int pro = inp[i] * inp[j];
				if(eles.contains(pro)) {
					System.out.println(inp[i] + " * " + inp[j] + " = " + pro);
				}
			}
		}
	}
}
