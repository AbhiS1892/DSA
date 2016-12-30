package com.dsa.linkedlist;

public class QueueFromStack {

	private  StackUsingLinkedList stack1;
	private  StackUsingLinkedList stack2;
	
	public QueueFromStack() {
		stack1=new StackUsingLinkedList();
		stack2=new StackUsingLinkedList();
	}


	public void enQueue(int data){		
		stack1.push(data);		
	}

	public boolean isEmpty(){		
		if(stack2.isEmpty()){			
			while(!stack1.isEmpty()){
				stack2.push(stack1.pop());
			}
		}
		return stack2.isEmpty();
	}


	public int deQueue(){
		if(!stack2.isEmpty()){
			return stack2.pop();
		}else{
			while(!stack1.isEmpty()){
				stack2.push(stack1.pop());
			}
			return stack2.pop();
		}	
	}

	public static void main(String[] args) {
		QueueFromStack ii=new QueueFromStack();

		ii.enQueue(1);
		ii.enQueue(2);
		ii.enQueue(3);
		ii.enQueue(4);
		ii.enQueue(5);
		ii.enQueue(6);


		while(!ii.isEmpty()){
			System.out.println(ii.deQueue());
		}

	}

}

