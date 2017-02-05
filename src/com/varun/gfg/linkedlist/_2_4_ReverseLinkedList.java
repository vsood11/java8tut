package com.varun.gfg.linkedlist;

/**
 * Created by Varun_Sudan on 2/4/2017.
 */
public class _2_4_ReverseLinkedList {

	public static void main(String[] args) {

	}

	public Node reverse(Node header) {

		Node curr = header;
		Node prev = null;
		Node next = null;

		while(curr != null) {
			next = curr.getNext();
			curr.setNext(prev);
			prev = curr;
			curr = next;
		}

		header = prev;

		return header;
	}
}
