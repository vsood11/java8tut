package com.varun.gfg.linkedlist;

/**
 * Created by Varun_Sudan on 2/20/2017.
 */
public class _2_20_PartitionListAroundGivenValue_NotTested {

	public static void main(String[] args) {

	}

	public static Node partitionedList(Node head, int value) {

		LinkedList ll1 = new LinkedList();
		Node tailOfList1 = ll1.getHead();

		LinkedList ll2 = new LinkedList();
		Node tailOfList2 = ll2.getHead();

		LinkedList ll3 = new LinkedList();
		Node tailOfList3 = ll3.getHead();

		Node temp = head;

		while(temp != null) {
			int data = temp.getData();
			if(data < value) {
				ll1.insert(data);
			} else if(data == value) {
				ll2.insert(data);
			} else {
				ll3.insert(data);
			}
			temp = temp.getNext();
			head.setNext(null);
			head = temp;
		}

		tailOfList1 = getTail(ll1.getHead());
		tailOfList2 = getTail(ll1.getHead());
		tailOfList3 = getTail(ll1.getHead());

		tailOfList1.setNext(ll2.getHead());
		ll2.setHead(null);
		tailOfList2.setNext(ll3.getHead());
		ll3.setHead(null);

		return ll1.getHead();
	}

	private static Node getTail(Node head) {
		Node temp = head;

		while(temp != null && temp.getNext() != null) {
			temp = temp.getNext();
		}

		return temp;
	}
}
