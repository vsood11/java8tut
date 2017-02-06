package com.varun.gfg.linkedlist;

/**
 * Created by Varun_Sudan on 2/6/2017.
 */
public class _2_6_Improve_Merge2SortedLinkedList {

	public static void main(String[] args) {

	}

	private Node mergeSortedLinkedListV1(Node first, Node second) {

		LinkedList mergedList = new LinkedList();
		Node f  = first;
		Node s = second;

		while(f != null && s != null) {
			if(f.getData() == s.getData()) {
				mergedList.insert(f.getData());
				mergedList.insert(s.getData());

				f = f.getNext();
				s = s.getNext();
			} else if(f.getData() < s.getData()) {
				mergedList.insert(f.getData());
				f = f.getNext();
			} else {
				mergedList.insert(s.getData());
				s = s.getNext();
			}
		}

		while(f != null) {
			mergedList.insert(f.getData());
			f = f.getNext();
		}

		while(s != null) {
			mergedList.insert(s.getData());
			s = s.getNext();
		}

		return mergedList.getHead();
	}


}
