package com.varun.gfg.strings;


public class RecursivleyRemoveAdjDup {

	public static void main(String[] args) {
		String inp = "azxxzy";
		System.out.println(remove(inp));
	}

	private static StringBuffer remove(String inp) {

		boolean isReduced = false;
		StringBuffer res = new StringBuffer();

		for(int i = 0; i < inp.length();) {
			int j = i + 1;
			char c = inp.charAt(i);
			while((j < inp.length()) && (c == inp.charAt(j))) {
				j++;
			}

			if((j - i) == 1) {
				res.append(c);
			} else {
				isReduced = true;
			}
			 i = j;
		}

		if(isReduced) {
			System.out.println(res.toString());
			return remove(res.toString());
		} else {
			return res;
		}
	}
}
