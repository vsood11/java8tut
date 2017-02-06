package com.varun.gfg.tree;

/**
 * Created by Varun_Sudan on 2/6/2017.
 */
public class _2_6_SizeOfTree {

	public static void main(String[] args) {

	}

	private long sizeOfTree(TreeNode root) {
		if(root == null) {
			return 0;
		} else {
			return (1 + sizeOfTree(root.getLeft()) + sizeOfTree(root.getRight()));
		}
	}
}
