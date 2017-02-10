package com.varun.gfg.tree;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by Varun_Sudan on 2/10/2017.
 */
public class _2_10_MaxLevelSumInBinaryTree {

	public static void main(String[] args) {

	}

	public long maxLevelSum(TreeNode root) {
		long maxSum = 0l;
		long currSum = 0l;

		Queue<TreeNode> nodeQ = new PriorityQueue<TreeNode>();
		nodeQ.add(root);
		nodeQ.add(null);

		while(nodeQ.isEmpty()) {

			while(nodeQ.peek() != null) {
				TreeNode ele = nodeQ.poll();
				currSum += root.getData();

				if(ele.getLeft() != null) {
					nodeQ.add(ele.getLeft());
				}
				if(ele.getRight() != null) {
					nodeQ.add(ele.getRight());
				}

			}
			nodeQ.poll();
			nodeQ.add(null);
			if(currSum > maxSum) {
				maxSum = currSum;
			}
			currSum = 0;
		}

		return maxSum;
	}
}
