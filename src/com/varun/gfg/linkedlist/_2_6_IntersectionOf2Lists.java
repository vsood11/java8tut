package com.varun.gfg.linkedlist;

/**
 * Created by Varun_Sudan on 2/6/2017.
 */
public class _2_6_IntersectionOf2Lists {

	public static void main(String[] args) {

	}

	private Node intersectionList(Node first, Node second) {
		LinkedList intersectionList = new LinkedList();

		if(first == null || second == null) {
			return null;
		}

		Node f = first;
		Node s = second;

		while(f != null && s != null) {

			if(f.getData() == s.getData()) {
				intersectionList.insert(f.getData());
				f = f.getNext();
				s = s.getNext();
			} else if(f.getData() < s.getData()) {
				f = f.getNext();
			} else {
				s = s.getNext();
			}
		}


		return intersectionList.getHead();
	}
}
