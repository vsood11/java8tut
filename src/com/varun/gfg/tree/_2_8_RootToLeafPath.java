package com.varun.gfg.tree;

/**
 * Created by Varun_Sudan on 2/8/2017.
 */
public class _2_8_RootToLeafPath {

	public static void main(String[] args) {

	}

	public void printPath(TreeNode root) {
		print(root, "");
	}

	private void print(TreeNode root, String path) {

		if(root == null) {
			System.out.println(path);
			return;
		} else if(root.getLeft() != null && root.getRight() != null) {
			System.out.println(path + " -> " + root.getData());
			return;
		} else {
			path +=  " -> " + root.getData();

			if(root.getLeft() != null) {
				print(root.getLeft(), path);
			}

			if(root.getRight() != null) {
				print(root.getRight(), path);
			}
		}
	}
}
