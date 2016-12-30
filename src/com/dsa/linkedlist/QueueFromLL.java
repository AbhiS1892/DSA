package com.dsa.linkedlist;

public class QueueFromLL {

	private  SingleLinkedList d;

	public QueueFromLL() {
		d=new SingleLinkedList();
	}
	public void enQueue(int data){
		d.insertAtTail(data);
	}

	public int deQueue(){
		return d.removeHeadElement().data;
	}

	public  boolean isEmpty(){
		return d.isEmpty();
	}
	
	public void displayQueue() {
	    d.displayList();
	    System.out.println();
	 }
	
	public int peek(){
		return d.getFirst();
	}
	
	public int size(){
		return d.size();
	}
	
	public static void main(String[] args) {
		QueueFromLL q=new QueueFromLL();
		q.enQueue(5);
		q.enQueue(4);
		q.enQueue(3);
		q.enQueue(2);
		q.displayQueue();
		q.deQueue();
		System.out.println();
		q.displayQueue();
		
	}

}
