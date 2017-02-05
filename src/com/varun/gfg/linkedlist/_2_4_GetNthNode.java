package com.varun.gfg.linkedlist;

/**
 * Created by Varun_Sudan on 2/4/2017.
 */
public class _2_4_GetNthNode {

	public static void main(String[] args) {

	}

	public Node getNthNode(LinkedList list, int n) {
		if(list.getHead() == null) {
			throw new RuntimeException("Empty List");
		}

		Node temp = list.getHead();
		int count = 1;

		while(temp.getNext() != null && (count < n)) {
			temp = temp.getNext();
			count++;
		}

		if(count < n) {
			throw new RuntimeException(n + "can not be greater than size = " +count);
		}
		return temp;
	}
}
