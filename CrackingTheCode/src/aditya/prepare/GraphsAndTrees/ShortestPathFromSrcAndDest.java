package aditya.prepare.GraphsAndTrees;

public class ShortestPathFromSrcAndDest {
	
	int graph [][] = {{0,2,1,-1},
			{2,0,-1,1},
			{5,-1,0,1},
			{-1,1,1,0}};
	int noOfVertices = 4;
	
	int minDistance = Integer.MAX_VALUE;
	
	
	private void shortestPath(int src,int dest, int sum, boolean visited[]) {
		visited[src] = true;
		if(src == dest) {
			 minDistance = Math.min(minDistance,sum);
			 return;
		}
		for(int j=0;j<noOfVertices;j++) {
			if((src == j) || visited[j] || graph[src][j] == -1) {
				continue;
			}
			shortestPath(j, dest, sum+graph[src][j], visited);
			visited[j] = false;
			
		}
	}
	
	
	public static void main(String args[]) {
		ShortestPathFromSrcAndDest src = new ShortestPathFromSrcAndDest();
		boolean [] visited = new boolean[src.noOfVertices];
		for(int i=0;i<src.noOfVertices;i++) {
			visited[i] = false;
		}
		src.shortestPath(1, 2, 0, visited);
		System.out.println(src.minDistance);
		
	}

}
