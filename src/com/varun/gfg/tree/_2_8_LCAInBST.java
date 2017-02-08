package com.varun.gfg.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Varun_Sudan on 2/8/2017.
 */
public class _2_8_LCAInBST {

	public static void main(String[] args) {

	}

	public TreeNode lca(TreeNode root, int fVal, int sVal) {
		List<TreeNode> fPath = getPath(root, fVal, new ArrayList<TreeNode>());
		List<TreeNode> sPath = getPath(root, sVal, new ArrayList<TreeNode>());

		int i = 0;
		int j = 0;

		TreeNode lca = null;
		while(i < fPath.size() && j < sPath.size()) {

			if(fPath.get(i) == sPath.get(i)) {
				lca =  fPath.get(i);
			}
			i++;
			j++;
		}

		return lca;
	}

	private List<TreeNode> getPath(TreeNode root, int value, List<TreeNode> path){

		if(root == null) {
			path = new ArrayList<>();
			return path;
		} else if(root.getData() == value) {
			return path;
		} else {
			path.add(root);

			if(value < root.getData()) {
				return getPath(root.getLeft(), value, path);
			} else {
				return getPath(root.getRight(), value, path);
			}
		}
	}
}
