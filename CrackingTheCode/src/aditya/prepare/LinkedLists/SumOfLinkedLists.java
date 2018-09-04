package aditya.prepare.LinkedLists;

public class SumOfLinkedLists {
	
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	private Node addTwoLinkedLists(Node head1, Node head2) {
		Node head3 = new SumOfLinkedLists.Node(-1);
		Node temp = head3;
		Node duff = null;
		int value = 0, carry = 0;
		for(;head1!=null && head2 != null;head1=head1.next,head2=head2.next) {
			value = head1.data + head2.data;
			carry = value /10;
			Node newNode = new Node(value%10 + carry);
			temp.next = newNode;
			temp = temp.next;
		}
		
		if(head1 == null && head2 == null) {
			return head3.next;
		}else if(head1 != null)
		{
			duff = head1;
		}else if(head2 != null) {
			duff = head2;
		}
		while(duff != null) {
		value = duff.data + carry;
		carry = value /10;
		Node newNode = new Node(value%10 + carry);
		temp.next = newNode;
		temp = temp.next;
		duff = duff.next;
		}
	return head3.next; 

	}

}
