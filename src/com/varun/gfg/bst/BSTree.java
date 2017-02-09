package com.varun.gfg.bst;

/**
 * Created by Varun_Sudan on 2/6/2017.
 */
public class BSTree {

	private BSTNode root;

	public BSTree(BSTNode root) {
		this.root = root;
	}

	public BSTNode getRoot() {
		return root;
	}

	public void setRoot(BSTNode root) {
		this.root = root;
	}

	public BSTNode insert(int n) {
		BSTNode newNode = new BSTNode(n);

		if(root == null) {
			root = newNode;
			return root;
		}

		BSTNode parent = null;
		BSTNode curr = root;

		while(curr != null) {
			parent = curr;

			if(curr.getData() < n) {
				curr = curr.getLeft();
			} else {
				curr = curr.getRight();
			}
		}

		if(parent.getData() < n) {
			parent.setLeft(newNode);
		} else {
			parent.setRight(newNode);
		}

		return parent;
	}
}
