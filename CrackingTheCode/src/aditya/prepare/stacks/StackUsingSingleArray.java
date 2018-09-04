package aditya.prepare.stacks;

public class StackUsingSingleArray {

	int a[] = new int[100];
	int top = -1;

	private void push(int element) {
		a[++top] = element;
	}

	private int pop() {
		if (isEmpty()) {
			return Integer.MAX_VALUE;
		}
		return a[top--];
	}

	private int peek() {
		if (isEmpty()) {
			return Integer.MAX_VALUE;
		}
		return a[top];
	}

	private boolean isEmpty() {
		if (top == -1)
			return true;
		return false;
	}

	private void printAllElementsInAllArray() {
		for (int i = top; i >= 0; i--) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}

	public static void main(String args[]) {
		StackUsingSingleArray single = new StackUsingSingleArray();
		single.push(2);
		single.push(3);
		single.printAllElementsInAllArray();
		single.pop();
		single.printAllElementsInAllArray();

	}

}
