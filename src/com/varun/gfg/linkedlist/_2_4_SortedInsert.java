package com.varun.gfg.linkedlist;

/**
 * Created by Varun_Sudan on 2/4/2017.
 */
public class _2_4_SortedInsert {

	public static void main(String[] args) {

	}

	public Node sortedInsert(Node header, Node newNode) {

		Node temp = header;
		Node prev = null;
		while(temp != null && (temp.getData() < newNode.getData())) {
			prev = temp;
			temp = temp.getNext();
		}

		// Node to be inserted @ the beginning
		if(prev == null) {
			newNode.setNext(header);
			header = newNode;
			return header;
		}

		prev.setNext(newNode);
		newNode.setNext(temp);

		return header;
	}
}
