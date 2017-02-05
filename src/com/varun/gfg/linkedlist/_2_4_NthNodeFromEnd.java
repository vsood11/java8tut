package com.varun.gfg.linkedlist;

/**
 * Created by Varun_Sudan on 2/4/2017.
 */
public class _2_4_NthNodeFromEnd {

	public static void main(String[] args) {

	}

	public Node nthNodeFromEnd(Node header, int n) {
		if(header == null) {
			throw new RuntimeException("List can not be null");
		}

		int counter = 0;
		Node fast = header;

		while(fast != null && counter < n) {
			fast = fast.getNext();
			counter++;
		}

		if(counter < n) {
			throw new RuntimeException(n + " is not a valid range for the list");
		}

		Node nthFromLast = header;

		while(fast != null) {
			fast = fast.getNext();
			nthFromLast = nthFromLast.getNext();
		}

		return nthFromLast;
	}
}
