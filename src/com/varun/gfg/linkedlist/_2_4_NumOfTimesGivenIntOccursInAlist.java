package com.varun.gfg.linkedlist;

/**
 * Created by Varun_Sudan on 2/4/2017.
 */
public class _2_4_NumOfTimesGivenIntOccursInAlist {

	public static void main(String[] args) {

	}

	public long count(Node header, int value) {
		Node temp = header;
		int count = 0;

		while(temp != null) {
			if(temp.getData() == value) {
				count++;
			}
		}
		return count;
	}
}
