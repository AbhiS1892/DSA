package com.dsa.stacks;

import com.dsa.linkedlist.StackUsingLinkedList;

public class GetMinimumInOne {

	private StackUsingLinkedList stack1;
	private StackUsingLinkedList stack2;

	public GetMinimumInOne(){
		stack1 = new StackUsingLinkedList();
		stack2 = new StackUsingLinkedList();
	}

	public void push(int i){
		stack1.push(i);

		if(stack2.isEmpty() || stack2.top()>=i){
			stack2.push(i);
		}
	}

	public int pop(){
		if(stack1.isEmpty())
			return -1;
		else{
			if(stack1.top() == stack2.top())
				stack2.pop();
		}
		return stack1.pop();
	}

	public int getMin(){
		return stack2.top();
	}

	public static void main(String[] args) {
		GetMinimumInOne o = new GetMinimumInOne();
		o.push(4);
		o.push(3);
		o.push(1);
		o.push(2);
		o.push(5);
		o.push(3);
		o.push(1);
		System.out.println(o.getMin());
		
		System.out.println();
		
		o.pop();
		o.pop();
		System.out.println(o.getMin());
		String[] val = {"a","b"};
		System.out.println(val[0]);

	}

}
