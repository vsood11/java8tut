package com.varun.gfg.linkedlist;

/**
 * Created by Varun_Sudan on 2/4/2017.
 */
public class _2_4_DeleteNodeGivenAPointer {

	public static void main(String[] args) {

	}

	public Node delete(Node header, Node nodeToBeDeleted) {

		if(header == null) {
			throw new RuntimeException("Empty List");
		}

		Node temp = header;

		if(temp ==  nodeToBeDeleted) {
			header = temp.getNext();
			nodeToBeDeleted.setNext(null);
			return header;
		}
		while(temp != null && temp.getNext() != nodeToBeDeleted) {
			temp = temp.getNext();
		}

		temp.setNext(temp.getNext().getNext());
		nodeToBeDeleted.setNext(null);

		return header;
	}
}
