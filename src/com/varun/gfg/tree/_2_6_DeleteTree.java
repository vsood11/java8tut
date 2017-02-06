package com.varun.gfg.tree;

/**
 * Created by Varun_Sudan on 2/6/2017.
 */
public class _2_6_DeleteTree {

	public static void main(String[] args) {

	}

	private TreeNode delete(TreeNode root) {

		if(root == null) {
			return null;
		} else {
			TreeNode left = root.getLeft();
			TreeNode right = root.getRight();
			root.setLeft(null);
			root.setRight(null);
			delete(root.getLeft());
			delete(root.getLeft());

			return null;
		}
	}
}
