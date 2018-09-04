package aditya.prepare.stacks;

public class ThreeStacksUsingSingleArrayFreeList {

	class Node {
		int data;
		int prev;

		public Node(int data, int prev) {
			this.data = data;
			this.prev = prev;
		}
	}

	public ThreeStacksUsingSingleArrayFreeList() {
		for (int i = 0; i < numberOfElements; i++) {
			freeList[i] = true;
		}

	}

	int numberOfElements = 10;
	int stackPointers[] = { -1, -1, -1 };
	int indexCurrentlyUsed = -1;
	Node a[] = new Node[numberOfElements];
	boolean freeList[] = new boolean[100];

	private void push(int stackNumber, int element) {
		int lastIndex = stackPointers[stackNumber];
		Node n = new Node(element, lastIndex);
		a[++indexCurrentlyUsed] = n;
		stackPointers[stackNumber] = indexCurrentlyUsed;
		freeList[indexCurrentlyUsed] = false;
	}

	private int pop(int stackNumber) {
		if (isEmpty(stackNumber)) {
			return Integer.MAX_VALUE;
		}
		int indexBecomingFree = stackPointers[stackNumber];
		Node currentTop = a[stackPointers[stackNumber]];
		stackPointers[stackNumber] = currentTop.prev;
		if (indexBecomingFree == indexCurrentlyUsed) {
			freeList[indexCurrentlyUsed] = true;
			indexCurrentlyUsed--;
		} else {
			// swap the nodes
			Node actualTop = a[indexCurrentlyUsed];
			a[indexBecomingFree] = actualTop;
			freeList[indexCurrentlyUsed] = true;
			indexCurrentlyUsed--;
		}
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
		while (n.prev != -1) {
			System.out.print(n.data + " ");
			n = a[n.prev];
		}
		System.out.print(n.data + " ");
		System.out.println();
	}

	public static void main(String args[]) {
		ThreeStacksUsingSingleArrayFreeList single = new ThreeStacksUsingSingleArrayFreeList();
		single.push(0, 2);
		single.push(1, 3);
		single.push(1, 30);
		single.push(1, 33);
		single.push(2, 4);
		single.push(0, 5);
		single.push(2, 41);
		single.push(2, 42);
		single.push(0, 50);
		single.push(0, 51);
		single.printAllElementsInAllArray(0);
		System.out.println("Popped Element:" + single.pop(0));
		single.push(0, 99);
		single.printAllElementsInAllArray(0);
		System.out.println("Popped Element:" + single.pop(2));
		single.push(1, 100);
		single.printAllElementsInAllArray(1);
		single.printAllElementsInAllArray(2);
	}

}
