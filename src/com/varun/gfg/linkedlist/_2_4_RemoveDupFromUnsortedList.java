package com.varun.gfg.linkedlist;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Varun_Sudan on 2/4/2017.
 */
public class _2_4_RemoveDupFromUnsortedList {


	public static void main(String[] args) {

	}

	public Node removeDup(Node header) {
		Set<Integer> values = new HashSet<>();

		Node curr = header;
		Node prev = null;

		while(curr != null) {
			prev = curr;
			curr = curr.getNext();

			if(values.contains(curr.getData())) {
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
