package aditya.prepare.GraphsAndTrees;

public class TreeBalanced {
	
	static int minHeightLeftTree = 0;
	static int minHeightRightTree = 0;
	
	class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;
		
		TreeNode(int data){
			this.data = data;
			//this.left = null;
			//this.right = null;
			}
		}
	
	private int minHeight (TreeNode root,int val) {
		int minValue = Integer.MAX_VALUE;
		if(root == null || (root.left == null && root.right == null)) {
			minValue = Math.min(val, minValue);
		}else if(root.left != null) {
			return minHeight(root.left, val+1);
		}else if(root.right != null) {
			return minHeight(root.right, val+1);
		}
		return minValue;
	}
	
	private int maxHeight (TreeNode root,int val) {
		int minValue = Integer.MIN_VALUE;
		if(root == null || (root.left == null && root.right == null)) {
			minValue = Math.max(val, minValue);
		}else if(root.left != null) {
			return minHeight(root.left, val+1);
		}else if(root.right != null) {
			return minHeight(root.right, val+1);
		}
		return minValue;
	}
	
	private boolean isBalanced(TreeNode root) {
		
		// Find min and max on both sides of trees and check if diff on one
		// side can be greater than other
		return false;
	}
	
	

}
