package com.varun.gfg.linkedlist;

/**
 * Created by Varun_Sudan on 2/4/2017.
 */
public class _2_4_FindMiddleOfLinkedList {

	public static void main(String[] args) {

	}

	public Node findMiddle(Node header) {

		Node slow = header;
		Node fast = header;

		while(slow != null && fast != null) {
			slow = slow.getNext();

			fast = fast.getNext();
			if(fast!= null) {
				fast = fast.getNext();
			}
		}

		return slow;
	}
}
