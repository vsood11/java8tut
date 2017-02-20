package com.varun.gfg.linkedlist;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Varun_Sudan on 2/20/2017.
 */
public class _2_20_LengthOfLongestPalindrome {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		int[] inp = {12,4,3,14}; //{2,3,7,3,2,12,24};
		for(int i = 0; i < inp.length; i++) {
			ll.insert(inp[i]);
		}

		System.out.println(lengthOfLongestPalindrome(ll.getHead()));
	}

	public static int lengthOfLongestPalindrome(Node head) {

		Map<Integer, Integer> dataIndxMap = new HashMap<>();
		Node temp = head;
		Integer pos = -1;
		int index = 1;
		int maxPalindromeLength = 1;
		int currentPalindromeLength = -1;


		while(temp != null) {
			pos = dataIndxMap.get(temp.getData());
			if(pos != null) {
				currentPalindromeLength = getPalindromeLength(head, pos, index);
				maxPalindromeLength
						=
						maxPalindromeLength < currentPalindromeLength ?
								currentPalindromeLength : maxPalindromeLength;
			} else {
				dataIndxMap.put(temp.getData(), index);
			}
			index++;
			temp = temp.getNext();
		}

		return maxPalindromeLength;
	}

	private static int getPalindromeLength(Node head, Integer startIndex, Integer endIndex) {
		int length = -1;
		Node temp = head;

		int index = 1;
		StringBuffer str = new StringBuffer();

		while(temp != null && index <= endIndex) {

			if(index >= startIndex) {
				str.append(temp.getData());
			}
			index++;
			temp = temp.getNext();
		}

		StringBuffer rev = str.reverse();
		if(str.equals(rev)) {
			length = str.length();
		}

		return length;
	}
}
