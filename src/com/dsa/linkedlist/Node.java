package com.dsa.linkedlist;

public class Node {
	public int data;
	public Node next;
	public Node previous;
	
	
	public Node(int data){
		this.data=data;
	}
	
	public Node() {}
	
	public void display(){
		System.out.print(this.data+" ");
	}

	@Override
	public String toString() {
		return data+" ";
	}

}
