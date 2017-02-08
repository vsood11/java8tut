package com.varun.gfg.tree;

import java.util.PriorityQueue;
import java.util.Queue;

import com.varun.gfg.linkedlist.LinkedList;

/**
 * Created by Varun_Sudan on 2/8/2017.
 */
public class _2_8_LevelOrderTraversal {

	public static void main(String[] args) {

	}

	public void print(TreeNode root) {
		Queue<TreeNode> q = new PriorityQueue<>();
		if(root != null) {
			q.add(root);
		}

		while(!q.isEmpty()) {
			TreeNode temp = q.remove();
			System.out.print(temp.getData()+ "  ");

			if(temp.getLeft() != null) {
				q.add(temp.getLeft());
			}

			if(temp.getRight() != null) {
				q.add(temp.getRight());
			}
		}
	}
}
