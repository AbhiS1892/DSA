package com.dsa.linkedlist;

public class DoublyLinkList {

	private Node first;
	private Node last;

	public DoublyLinkList(){
		first=null;
		last=null;
	}

	public boolean isEmpty() // true if no links
	{ 
		return first==null; 
	}

	public void insertFirst(int n){
		Node newLink=new Node(n);
		if(isEmpty())
			last=newLink;
		else
			first.previous=newLink;
		newLink.next=first;
		first=newLink;

	}

	public void insertlast(int n){
		Node newLink=new Node(n);
		if(isEmpty())
			first=newLink;
		else{
			last.next=newLink;
			newLink.previous=last;
		}
		last=newLink;
	}

	public void deleteFirst(){

		Node temp=first;
		if(first.next==null)
			last=null;
		else{
			first.next.previous=null;
		}
		first=first.next;
		System.out.println("Deleted item is "+ temp.data);	
	}

	public void deleteLast(){
		Node temp=last;
		if(first.next==null)
			first=null;
		else{
			last.previous.next=null;
		}
		last=last.previous;

		System.out.println("Deleted item is "+ temp.data);	

	}
	// -------------------------------------------------------------
	public void displayForward()
	{
		System.out.print("List (first-->last): ");
		Node current = first; // start at beginning
		while(current != null) // until end of list,
		{
			current.display(); // display data
			current = current.next; // move to next link
		}
		System.out.println("");
	}
	// -------------------------------------------------------------
	public void displayBackward()
	{
		System.out.print("List (last-->first): ");
		Node current = last; // start at end
		while(current != null) // until start of list,
		{
			current.display(); // display data
			current = current.previous; // move to previous link
		}
		System.out.println("");
	}
	public static void main(String[] args) {
		DoublyLinkList d=new DoublyLinkList();
		d.insertFirst(3);
		d.insertFirst(8);
		d.insertFirst(9);
		d.insertlast(7);
		d.insertlast(4);
		d.displayForward();

		d.deleteFirst();
		d.displayForward();

		d.deleteLast();
		d.displayForward();
	}

}

