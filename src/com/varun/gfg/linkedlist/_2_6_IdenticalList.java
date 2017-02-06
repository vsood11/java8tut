package com.varun.gfg.linkedlist;

/**
 * Created by Varun_Sudan on 2/6/2017.
 */
public class _2_6_IdenticalList {

	public static void main(String[] args) {

	}

	private boolean isIdentical(Node first, Node second){

		if(first == null && second == null) {
			return true;
		}

		Node f = first;
		Node s = second;

		while(f != null && s != null) {
			if(f.getData() == s.getData()) {
				f = f.getNext();
				s = s.getNext();
			} else {
				return false;
			}
		}

		if(f != null || s != null) {
			return false;
		}


		return true;
	}
}
