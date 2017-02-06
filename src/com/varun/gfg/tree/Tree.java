package com.varun.gfg.tree;

/**
 * Created by Varun_Sudan on 2/6/2017.
 */
public class Tree {

	private TreeNode root;

	public Tree(TreeNode root) {
		this.root = root;
	}

	public TreeNode getRoot() {
		return root;
	}

	public void setRoot(TreeNode root) {
		this.root = root;
	}

	public TreeNode insert(int n) {
		TreeNode newNode = new TreeNode(n);

		if(root == null) {
			root = newNode;
			return root;
		}

		TreeNode parent = null;
		TreeNode curr = root;

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
