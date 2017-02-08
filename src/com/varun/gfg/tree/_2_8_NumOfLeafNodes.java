package com.varun.gfg.tree;

/**
 * Created by Varun_Sudan on 2/8/2017.
 */
public class _2_8_NumOfLeafNodes {

	public static void main(String[] args) {

	}

	public long numOfLeaves(TreeNode root){

		if(root == null) {
			return 0;
		} else if(root.getLeft() == null && root.getRight() == null) {
			return 1;
		} else {
			return (
					numOfLeaves(root.getLeft()) + numOfLeaves(root.getRight())
			);
		}

	}
}
