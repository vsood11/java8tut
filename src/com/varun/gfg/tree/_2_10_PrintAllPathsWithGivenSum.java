package com.varun.gfg.tree;

/**
 * Created by Varun_Sudan on 2/10/2017.
 */
public class _2_10_PrintAllPathsWithGivenSum {

	public static void main(String[] args) {

	}

	public void print(TreeNode root, int sum) {

	}

	private void printPath(TreeNode root, int sum, String result) {
		if(root == null) {
			System.out.print("No path found");
		} else if(sum == 0){
			System.out.println("path  found = " + result);
		} else if(root.getData() <= sum){
			result += " "+root.getData()+ " , ";
			printPath(root.getLeft(), sum - root.getData(),result);
			printPath(root.getRight(), sum - root.getData(),result);
		}
	}
}


