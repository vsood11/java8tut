package com.varun.gfg.linkedlist;

/**
 * Created by Varun_Sudan on 2/5/2017.
 */
public class _2_5_MoveLastEleToFirst {

	public static void main(String[] args) {

	}

	public Node moveLastToFirst(Node head) {

		if(head == null) {
			return head;
		}

		Node lastNode = head;
		Node prev = null;

		while (lastNode.getNext() != null) {
			prev = lastNode;
			lastNode = lastNode.getNext();
		}

		lastNode.setNext(head);
		head = lastNode;
		if(prev != null) {
			prev.setNext(null);
		}


		return head;
	}
}
