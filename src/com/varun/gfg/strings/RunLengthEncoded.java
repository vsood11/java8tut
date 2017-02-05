package com.varun.gfg.strings;

/**
 * Created by Varun_Sudan on 2/1/2017.
 */
public class RunLengthEncoded {

	public static void main(String[] args) {
		String word = "wwwwaaadexxxxxx";
		rle(word);
	}

	private static StringBuffer rle(String word) {
		StringBuffer res = new StringBuffer();
		int charCount = 1;
		int next = 0;

		for(int i = 0; i < word.length();) {
			charCount = 1;
			char c =  word.charAt(i);
			int j = i + 1;
			while((j < word.length()) && (c == word.charAt(j))) {
				j++;
				charCount++;
			}
			i = j;
			System.out.print(""+c+charCount);
			res.append(""+c+charCount);
		}
		return res;
	}
}
