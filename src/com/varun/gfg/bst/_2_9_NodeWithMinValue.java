package com.varun.gfg.bst;

/**
 * Created by Varun_Sudan on 2/9/2017.
 */
public class _2_9_NodeWithMinValue {

	public static void main(String[] args) {

	}

	public BSTNode minNode(BSTNode root){
		if(root == null) {
			return null;
		} else if(root.getLeft() == null && root.getRight() == null) {
			return root;
		} else if(root.getLeft() == null){
			return root;
		} else {
			return minNode(root.getLeft());
		}
	}
}
