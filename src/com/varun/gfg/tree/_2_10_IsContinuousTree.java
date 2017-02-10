package com.varun.gfg.tree;

/**
 * Created by Varun_Sudan on 2/10/2017.
 */
public class _2_10_IsContinuousTree {

	public static void main(String[] args) {

	}

	public boolean isContinuous(TreeNode root) {

		if(root == null) {
			return true;
		} else if(root.getLeft() == null && root.getRight() == null) {
			return true;
		} else {
			TreeNode left = root.getLeft();
			TreeNode right = root.getRight();

			if(left != null && Math.abs(root.getData() - left.getData()) != 1) {
				return false;
			}

			if(right != null && Math.abs(root.getData() - right.getData()) != 1) {
				return false;
			}

			return (true && isContinuous(root.getLeft()) && isContinuous(root.getRight()));
		}
	}


}
