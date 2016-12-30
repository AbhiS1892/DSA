package com.dsa.linkedlist;

public class FloydCycle {

	static void detectAndRemoveLoop(Node first) {
		Node slow = first;
		Node fast = first.next;

		//Loop serach
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow == fast)
				break;
		}

		//Loop Break
		if (slow == fast) {
			slow = first;
			while (slow != fast.next) {
				slow = slow.next;
				fast = fast.next;
			}

			/* since fast->next is the looping point */
			fast.next = null; /* remove loop */

		}


	}
	
	static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + "->");
            node = node.next;
        }
    }

	public static void main(String[] args) {
		Node n1=new Node(1);
		Node n2=new Node(2);
		Node n3=new Node(3);
		Node n4=new Node(4);
		Node n5=new Node(5);

		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n2;
		
		System.out.println("When Loop exist:");
		printList(n1);
		
//		detectAndRemoveLoop(n1);
//		
//		System.out.println("After loop removed:");
//		printList(n1);
//		


	}

}
