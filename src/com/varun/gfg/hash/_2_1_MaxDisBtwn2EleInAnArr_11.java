package com.varun.gfg.hash;

/**
 * Created by Varun_Sudan on 2/1/2017.
 */
public class _2_1_MaxDisBtwn2EleInAnArr_11 {

	public static void main(String[] args) {
		int[] inp = {3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2};
		System.out.println(maxDis(inp));
	}

	private static int maxDis(int[] inp) {
		int maxDis = 0;
		int currDis = 0;
		for(int i = 0; i < inp.length; i++) {
			for(int j = i + 1; j < inp.length; j++) {
				if(inp[i] == inp[j]) {
					currDis = (j - i);
					maxDis = currDis > maxDis ? currDis : maxDis;
				}
			}
		}

		return maxDis;
	}
}
