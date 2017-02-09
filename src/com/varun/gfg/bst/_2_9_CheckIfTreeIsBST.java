package com.varun.gfg.bst;

import com.varun.gfg.tree.TreeNode;

/**
 * Created by Varun_Sudan on 2/9/2017.
 */
public class _2_9_CheckIfTreeIsBST {

	public static void main(String[] args) {

	}

	public boolean isBST(TreeNode root) {
		if(root == null) {
			return true;
		} else if(root.getLeft() == null && root.getRight() == null) {
			return true;
		} else {
			TreeNode l = root.getLeft();
			TreeNode r = root.getRight();
			if(l != null && l.getData() > root.getData()) {
				return false;
			} else if( r != null && r.getData() < root.getData()) {
				return false;
			}

			return (true && isBST(root.getLeft()) && isBST(root.getRight()));
		}
	}
}
