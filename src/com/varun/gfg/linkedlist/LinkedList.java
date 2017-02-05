package com.varun.gfg.linkedlist;

/**
 * Created by Varun_Sudan on 2/4/2017.
 */
public class LinkedList {

	private Node head;
	private Node tail;

	public LinkedList(Node head) {
		this.head = head;
	}

	public LinkedList() {
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public void insert(int n) {
		Node newNode = new Node(n);
		if(head == null) {
			head = newNode;
			tail = newNode;
			return;
		}

		tail.setNext(newNode);
		tail = newNode;
	}
}
