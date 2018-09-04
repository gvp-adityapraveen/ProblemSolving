package aditya.prepare.stacks;

import java.util.Stack;

public class SortStackAscendingOrder {
	
	Stack<Integer> st1 = new Stack<Integer>();
	Stack<Integer> st2 = new Stack<Integer>();
	
	
	private void printElements() {
		Integer value = st1.pop();
		while(value != null) {
			st2.push(value);
			value = st1.pop();
		}
	}
	
	
	public static void main(String args[]) {
		SortStackAscendingOrder order = new SortStackAscendingOrder();
		int [] elements = {5,4,3,12,10};
		for(int i=0;i<elements.length;i++) {
			order.st1.push(elements[i]);
		}
		
		
		
	}

}
