package com.varun.gfg.tree;

/**
 * Created by Varun_Sudan on 2/6/2017.
 */
public class _2_6_IdenticalTrees {

	public void main(String[] args) {

	}

	private boolean areIdentical(TreeNode first, TreeNode second){

		if(first == null && second == null) {
			return true;
		} else if(first != null && second == null) {
			return false;
		} else if(first == null && second != null) {
			return false;
		} else if(first.getData() != second.getData()){
			return false;
		} else {
			return (
					true
					&& areIdentical(first.getLeft(), second.getLeft())
					&& areIdentical(first.getRight(), second.getRight())
			);
		}
	}
}
