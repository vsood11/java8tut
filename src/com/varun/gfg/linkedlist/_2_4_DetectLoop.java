package com.varun.gfg.linkedlist;

/**
 * Created by Varun_Sudan on 2/4/2017.
 */
public class _2_4_DetectLoop {

	public static void main(String[] args) {

	}

	public boolean isLoopPresent(Node header) {

		Node slow = header;
		Node fast = header;

		while(slow != null && fast != null) {
			if(slow == fast) {
				return true;
			}
			slow = slow.getNext();
			fast = fast.getNext();
			if(fast != null) {
				fast = fast.getNext();
			}
		}

		return false;
	}
}
