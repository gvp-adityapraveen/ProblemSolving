package aditya.prepare.GraphsAndTrees;

import java.util.Stack;

public class DFTraversal {

	int graph[][] = { { 0, 2, 1, -1 }, { 2, 0, -1, 1 }, { 5, -1, 0, 1 }, { -1, 1, 1, 0 } };
	Stack<Integer> queue = new Stack<Integer>();
	int noOfVertices = 4;

	private void traversal(boolean[] visited) {
		while (!queue.isEmpty()) {
			Integer topElement = queue.peek();
			int topElementValue = topElement.intValue();
			visited[topElementValue] = true;
			for (int j = 0; j < noOfVertices; j++) {
				if (topElementValue == j || visited[j] || graph[topElementValue][j] == -1) {
					continue;
				}
				queue.push(j);
				System.out.println(j);
				traversal(visited);
			}
			if(!queue.isEmpty())
				queue.pop();
		}
	}

	public static void main(String args[]) {
		DFTraversal dfTraversal = new DFTraversal();
		boolean[] visited = new boolean[dfTraversal.noOfVertices];
		for (int i = 0; i < dfTraversal.noOfVertices; i++) {
			visited[i] = false;
		}
		int src = 1;
		visited[src] = true;
		dfTraversal.queue.push(src);
		System.out.println(src);
		dfTraversal.traversal(visited);

	}

}
