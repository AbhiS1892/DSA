package com.dsa.stacks;

import com.dsa.linkedlist.QueueFromLL;

public class StackFromQueue {

	private QueueFromLL q1;
	private QueueFromLL q2;

	public StackFromQueue() {
		q1=new QueueFromLL();
		q2=new QueueFromLL();
	}

	public void push(int data){
		if(q1.isEmpty())
			q2.enQueue(data);
		else
			q1.enQueue(data);
	}

	public int pop(){
		int i=0,size=0;

		if(!q1.isEmpty()){
			size=q1.size();
			i=0;

			while(i < size-1){
				q2.enQueue(q1.deQueue());
				i++;
			}

			return q1.deQueue();
		}else{
			size=q2.size();
			i=0;
			
			while(i<size-1){
				q1.enQueue(q2.deQueue());
				i++;
			}
			
			return q2.deQueue();
		}
	}

	public static void main(String[] args) {
		StackFromQueue sfq=new StackFromQueue();

		sfq.push(1);
		sfq.push(2);
		sfq.push(3);
		sfq.push(4);
		sfq.push(5);

		int i=0;
		for(;i<5;i++)
			System.out.println(sfq.pop());

	}

}
