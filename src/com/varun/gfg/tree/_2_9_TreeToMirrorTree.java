package com.varun.gfg.tree;

/**
 * Created by Varun_Sudan on 2/9/2017.
 */
public class _2_9_TreeToMirrorTree {

	public static void main(String[] args) {

	}

	public TreeNode mirrorTree(TreeNode root) {

		if(root == null) {
			return null;
		} else if(root.getLeft() == null && root.getRight() == null) {
			return null;
		} else {
			TreeNode l = root.getLeft();
			TreeNode r = root.getRight();

			if(l != null && r != null) {
				int temp = l.getData();
				l.setData(r.getData());
				r.setData(temp);
			} else if(l == null && r != null) {
				root.setLeft(r);
				root.setRight(null);
			} else {
				root.setRight(l);
				root.setLeft(null);
			}

			mirrorTree(root.getLeft());
			mirrorTree(root.getRight());
			return root;
		}
	}
}
