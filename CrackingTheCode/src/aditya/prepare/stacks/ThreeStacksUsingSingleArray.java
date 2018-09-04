package aditya.prepare.stacks;

public class ThreeStacksUsingSingleArray {
	
	class Node{
		int data;
		int prev;
		
		public Node(int data, int prev) {
			this.data = data;
			this.prev = prev;
		}
	}
	
	int stackPointers [] = {-1,-1,-1};
	int indexCurrentlyUsed = -1;
	Node a[] = new Node[100];

	private void push(int stackNumber,int element) {
		int lastIndex = stackPointers[stackNumber];
		Node n = new Node(element,lastIndex);
		a[++indexCurrentlyUsed] = n;
		stackPointers[stackNumber] = indexCurrentlyUsed;
	}

	private int pop(int stackNumber) {
		if (isEmpty(stackNumber)) {
			return Integer.MAX_VALUE;
		}
		Node currentTop = a[stackPointers[stackNumber]];
		stackPointers[stackNumber] = currentTop.prev;
		return currentTop.data;
	}

	private int peek(int stackNumber) {
		if (isEmpty(stackNumber)) {
			return Integer.MAX_VALUE;
		}
		return a[stackPointers[stackNumber]].data;
	}

	private boolean isEmpty(int stackNumber) {
		if (stackPointers[stackNumber] == -1)
			return true;
		return false;
	}

	private void printAllElementsInAllArray(int stackNumber) {
		Node n = a[stackPointers[stackNumber]];
		while(n.prev != -1) {
			System.out.print(n.data+" ");
			n = a[n.prev];
		}
		System.out.print(n.data+" ");
		System.out.println();
	}

	public static void main(String args[]) {
		ThreeStacksUsingSingleArray single = new ThreeStacksUsingSingleArray();
		single.push(0,2);
		single.push(1,3);
		single.push(1,30);
		single.push(1,33);
		single.push(2,4);
		single.push(0,5);
		single.printAllElementsInAllArray(1);
		single.pop(1);
		single.printAllElementsInAllArray(1);
		}
}
