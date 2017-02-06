package com.varun.gfg.linkedlist;

/**
 * Created by Varun_Sudan on 2/6/2017.
 */
public class _2_6_PairwiseSwap {

	public static void main(String[] args) {

	}

	private Node pairwiseSwap(Node head) {

		if(head == null || head.getNext() == null) {
			return head;
		}

		Node curr = head;
		Node next = head.getNext();

		while(curr != null && next != null) {

			int temp = curr.getData();
			curr.setData(next.getData());
			next.setData(temp);

			curr = next.getNext();

			if(curr != null) {
				next = curr.getNext();
			} else {
				next = null;
			}
		}

		return head;
	}
}
