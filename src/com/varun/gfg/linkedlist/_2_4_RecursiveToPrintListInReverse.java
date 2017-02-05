package com.varun.gfg.linkedlist;

/**
 * Created by Varun_Sudan on 2/4/2017.
 */
public class _2_4_RecursiveToPrintListInReverse {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.insert(1);
		ll.insert(2);
		ll.insert(3);
		_2_4_RecursiveToPrintListInReverse t = new _2_4_RecursiveToPrintListInReverse();
		t.print(ll.getHead());
	}

	public void printInRev(Node header) {
		if(header != null) {
			print(header);
		}
	}

	private void print(Node header) {
		if(header.getNext() == null) {
			System.out.print(header.getData()+ " , ");
			return;
		} else {
			print(header.getNext());
			System.out.print(header.getData()+ " , ");
		}
	}
}
