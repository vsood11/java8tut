package com.varun.gfg.tree;

/**
 * Created by Varun_Sudan on 2/6/2017.
 */
public class _2_6_MaxDepthOfTree {

	public static void main(String[] args) {

	}

	private long maxDepth(TreeNode root) {

		if(root == null) {
			return 0;
		} else {
			long leftDepth = 1 + maxDepth(root.getLeft());
			long rightDepth = 1 + maxDepth(root.getRight());

			return (leftDepth > rightDepth ? leftDepth : rightDepth);
		}

	}
}
