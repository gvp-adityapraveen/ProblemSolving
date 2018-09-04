package aditya.prepare.GraphsAndTrees;

import java.util.LinkedList;
import java.util.Queue;

public class BFTraversal {

	int graph[][] = { { 0, 2, 1, -1 }, { 2, 0, -1, 1 }, { 5, -1, 0, 1 }, { -1, 1, 1, 0 } };
	Queue<Integer> queue = new LinkedList<Integer>();
	int noOfVertices = 4;

	private void traversal(boolean[] visited) {
		while (queue.peek() != null) {
			System.out.println(queue.peek());
			Integer dequeuedElement = queue.remove();
			int dequeuedElementValue = dequeuedElement.intValue();
			for (int j = 0; j < noOfVertices; j++) {
				if (dequeuedElementValue == j || visited[j]
						|| graph[dequeuedElementValue][j] == -1) {
					continue;
				}
				queue.add(j);
				visited[j] = true;
			}
		}
	}

	public static void main(String args[]) {
		BFTraversal bfTraversal = new BFTraversal();
		boolean[] visited = new boolean[bfTraversal.noOfVertices];
		for (int i = 0; i < bfTraversal.noOfVertices; i++) {
			visited[i] = false;
		}
		int src = 1;
		bfTraversal.queue.add(src);
		visited[src] = true;
		bfTraversal.traversal(visited);

	}

}
