package com.dsa.linkedlist;

public class YIntersect {
	
	public static Node findIntersectingNode(Node list1, Node list2){
		int l1=0,l2=0,diff=0;
		Node head1=list1,head2=list2;
		
		//Loop to find length of loop
		while(head1!=null){
			head1=head1.next;
			l1++;
		}
		while(head2!=null){
			head2=head2.next;
			l2++;
		}
		
		//Difference of list
		diff=l1-l2;
		if(l1<l2){
			head1=list2;
			head2=list1;
			diff=l2-l1;
		}
		
		for(int i=0; i<diff; i++){
			head1=head1.next;
			while(head1!=null && head2!=null){
				if(head1==head2)
					return head1;
				head1=head1.next;
				head2=head2.next;
			}
		}
		
		return null;
		
	}

	public static void main(String[] args) {
		Node n1=new Node(1);
		Node n2=new Node(2);
		Node n3=new Node(3);
		Node n4=new Node(4);
		Node n5=new Node(5);
		Node n6=new Node(6);
		
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		n6.next=null;
		
		Node c1=new Node(10);
		Node c2=new Node(9);
		Node c3=new Node(8);
		Node c4=new Node(7);
		
		c1.next=c2;
		c2.next=c3;
		c3.next=c4;
		c4.next=n4;
		
		System.out.println(findIntersectingNode(n1, c1));
	}

}
