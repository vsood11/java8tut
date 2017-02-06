package com.varun.gfg.linkedlist;

/**
 * Created by Varun_Sudan on 2/6/2017.
 */
public class _2_6_DeleteAlternateNodeOfLL {

	public static void main(String[] args) {

	}

	private Node deleteAlternateNodes(Node head) {

		if(head == null || head.getNext() == null) {
			return head;
		}

		Node curr = head;
		Node next = head.getNext();

		while(curr != null && next != null) {
			curr.setNext(next.getNext());
			curr = next.getNext();
			next.setNext(null);
			if(curr != null) {
				next = curr.getNext();
			} else {
				next = null;
			}
		}

		return head;
	}
}
