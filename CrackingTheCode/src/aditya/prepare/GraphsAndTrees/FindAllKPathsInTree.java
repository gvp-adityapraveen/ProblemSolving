package aditya.prepare.GraphsAndTrees;

import java.util.ArrayList;

class TreeNode{
	int data;
	TreeNode right;
	TreeNode left;
	
	
	public TreeNode(int data) {
		this.data = data;
	}
}

public class FindAllKPathsInTree {
	
	ArrayList<ArrayList<Integer>> paths = new ArrayList<ArrayList<Integer>>();
	
	
	private void findPaths(TreeNode root ,ArrayList<Integer> path,int index, int  k) {
		
		if(root == null)
			return;
		path.add(index,root.data);
		
		int sum = 0;
		for(int i=path.size()-1;i>=0;i--) {
			sum += path.get(i).intValue();
			if(sum == k) {
				for(int j=i;j<path.size();j++) {
					System.out.print(path.get(j)+" ");
				}
				System.out.println();
			}
		}

		findPaths(root.left, path,index+1, k);
		findPaths(root.right, path,index+1, k);
		path.remove(index);
				
	}
	
	
	public static void main(String args[]) {
		FindAllKPathsInTree tree = new FindAllKPathsInTree();
		TreeNode root = new TreeNode(1);
	    root.left = new TreeNode(3);
	    root.left.left = new TreeNode(2);
	    root.left.right = new TreeNode(1);
	    root.left.right.left = new TreeNode(1);
	    root.right = new TreeNode(-1);
	    root.right.left = new TreeNode(4);
	    root.right.left.left = new TreeNode(1);
	    root.right.left.right = new TreeNode(2);
	    root.right.right = new TreeNode(5);
	    root.right.right.right = new TreeNode(2);
	    int k = 5,index=0;
	    tree.findPaths(root, new ArrayList<Integer>(),index, k);
	 
	}

}
