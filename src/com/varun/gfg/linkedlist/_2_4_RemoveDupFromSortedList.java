package com.varun.gfg.linkedlist;

import com.varun.gfg.linkedlist.Node;

/**
 * Created by Varun_Sudan on 2/4/2017.
 */
public class _2_4_RemoveDupFromSortedList {

	public static void main(String[] args) {

	}

	public Node removeDup(Node header) {
		Node curr = header;
		Node prev = null;

		while(curr != null) {
			prev = curr;
			while((curr.getNext() != null) && (curr.getData() == curr.getNext().getData())) {
				curr = curr.getNext();
			}
			if(prev != curr) {
				prev.setNext(curr.getNext());
				curr.setNext(null);
				curr = prev.getNext();
			} else {
				curr = curr.getNext();
			}

		}

		return header;
	}
}
