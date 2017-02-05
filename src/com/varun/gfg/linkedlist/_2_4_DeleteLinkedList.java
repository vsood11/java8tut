package com.varun.gfg.linkedlist;

/**
 * Created by Varun_Sudan on 2/4/2017.
 */
public class _2_4_DeleteLinkedList {

	public static void main(String[] args) {

	}

	public Node delete(Node header) {
		Node curr = header;
		Node prev = null;

		while(curr != null) {
			prev = curr;
			curr = curr.getNext();
			prev.setNext(null);
		}

		header = curr;
		return header;
	}
}
