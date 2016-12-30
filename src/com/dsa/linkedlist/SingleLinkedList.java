package com.dsa.linkedlist;

public class SingleLinkedList extends Node{

	private Node head;

	public SingleLinkedList(){
		head=null;
	}

	public boolean isEmpty(){ 
		return head==null; 
	}

	public void displayList(){
		Node current=head;
		System.out.println("List: ");
		while(current!=null){
			current.display();
			current=current.next;
		}
	}


	public int size(){
		Node current=head;
		int c=0;
		while(current!=null){
			current=current.next;
			c++;
		}
		return c;
	}

	public static void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + "->");
			node = node.next;
		}
	}

	public void insertSorted(int data){
		Node newLink = new Node(data);
		Node previous = null; 
		Node current = head;
		while(current != null && data > current.data){
			previous = current;
			current = current.next;
		}
		if(previous==null)
			head = newLink;
		else
			previous.next = newLink;
		newLink.next = current; 
	}

	public void insertAtHead(int data){
		Node newNode=new Node(data);
		newNode.next=head;
		head=newNode;	
	}

	public Node removeHeadElement(){
		Node remHeadNode=head;
		head=head.next;
		return remHeadNode;		
	}

	public void insertAtTail(int data){
		if(head==null){
			insertAtHead(data);
		}else{
			Node newNode=head;
			while(newNode.next!=null){
				newNode=newNode.next;
			}
			newNode.next= new Node(data);
		}
	}

	public Node findNNode(Node node,int pos){
		Node fast=null, slow=node;
		int count=1;
		for(fast=node;fast!=null;){
			if(pos-count<0){
				slow=slow.next;
			}
			count++;
			fast=fast.next;
		}
		if(count>=pos){
			return slow;
		}
		return null;
	}

	public Node getNext(){
		return head;
	}

	public static Node reverse(Node first){
		Node temp=null,node1=null;
		while(first !=null ){
			node1=first.next;
			first.next=temp;
			temp=first;
			first=node1;
		}

		return temp;
	}

	public static int findMiddle(Node first){
		Node fast=first,slow=first;
		int i=0;
		while(fast.next!=null){
			if(i==0){
				fast=fast.next;
				i=1;
			}
			if(i==1){
				slow=slow.next;
				fast=fast.next;
				i=0;
			}
		}
		return slow.data;
	}

	public static int isListEven(Node first){
		while(first!=null && first.next!=null){
			first=first.next.next;
		}
		if(first==null)
			return 0;
		return 1;
	}

	public static Node merge(Node list1,Node list2){
		if (list1 == null) return list2;
		if (list2 == null) return list1;

		if (list1.data <= list2.data) {
			list1.next = merge(list1.next, list2);
			return list1;
		} else {
			list2.next = merge(list2.next, list1);
			return list2;
		}
	}

	Node reverse(Node head, int k){
		Node current = head;
		Node next = null;
		Node prev = null;

		int count = 0;

		while (count < k && current != null){
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			count++;
		}

		if (next != null) 
			head.next = reverse(next, k);

		return prev;
	}

	public boolean isPalindrome(Node head) { 
		boolean result = helper(head);
		return result;
	}

	public boolean helper(Node right){

		//stop recursion
		if (right == null)
			return true;

		//if sub-list is not palindrome,  return false
		boolean x = helper(right.next);
		if (!x)
			return false;

		//current left and right
		boolean y = (head.data == right.data);

		//move left to next
		head = head.next;

		return y;
	}


	public Node InsertNth(Node head, int data, int position) {
		Node node = head;
		
		if (position == 0){
			node = new Node();
			node.data = data;
			node.next = head;
			return node;
		}
		else {
			while(--position > 0){
				node = node.next;
			}
			Node i = node.next;
			node.next = new Node();
			node.next.data = data;
			node.next.next = i;
			return head;
		}
	}

	public static void main(String[] args) {
		SingleLinkedList l= new SingleLinkedList();
		//		l.insertAtHead(1);
		//		l.insertAtHead(2);
		//		l.insertAtHead(3);
		//		l.insertAtHead(4);
		//		l.insertAtHead(5);
		//		l.insertAtHead(6);
		//		l.insertAtHead(7);
		//		l.displayList();
		//		System.out.println();
		//
		//		l.insertAtTail(11);
		//		l.insertAtTail(12);
		//		l.insertAtTail(13);
		//		l.insertAtTail(14);
		//		
		//				l.displayList();

		//		System.out.println(l.findNNode(l.getNext(), 3));

		//		l.insertSorted(5);
				l.insertSorted(4);
				l.insertSorted(3);
				l.insertSorted(2);
				l.insertSorted(1);
//				l.displayList();
		//
		//		System.out.println();
		//
		//		SingleLinkedList l1=new SingleLinkedList();
		//		l1.insertSorted(6);
		//		l1.insertSorted(7);
		//		l1.insertSorted(8);
		//		l1.insertSorted(9);
		//		l1.insertSorted(10);
		//		l1.displayList();
		//		//		l.displayList();
		//
						System.out.println(findMiddle(l));
		//
		//		//		int i=isListEven(l.getNext());
		//		//		System.out.println(i);
		//
		////		Node n1= merge(l.getNext(), l1.getNext());
		////		System.out.println();
		////		System.out.println("List:");
		////		printList(reverse(l1.getNext()));
		//		System.out.println();
		//		Node n=l.reverse(l1.getNext(), 3);
		//		printList(n);

//		l.insertAtHead(5);
//		l.insertAtHead(4);
//		l.insertAtHead(3);
//		l.insertAtHead(4);
//		l.insertAtHead(1);
//
////		boolean res=l.isPalindrome(l.getNext());
////		System.out.println(res);
//		l.displayList();
//		System.out.println("\nList:");
//		int n=l.size();
//		printList(l.InsertNth(l.getNext(), 8, n));
//		
	}

	public int getFirst() {
		if(head==null)
			return -1;
		return head.data;
	}

}
