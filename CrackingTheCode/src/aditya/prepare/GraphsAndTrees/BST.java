package aditya.prepare.GraphsAndTrees;

public class BST {
	
	
	TreeNode root = null;
	
	public class TreeNode{
		int data;
		TreeNode left;
		TreeNode right;
		
		public TreeNode(int value) {
			this.data = value;
			this.left = null;
			this.right = null;
		}
	}
	
	//return boolean
	private boolean searchNode(TreeNode root,int val) {
		if(root == null) {
			return false;
		}else if(root.data == val) {
			return true;
		}else if(root.data > val) {
			return searchNode(root.left, val);
		}else
		{
			return searchNode(root.right, val);
		}
	}

}
