package com.dsa.linkedlist;

public class StackUsingLinkedList {

	SingleLinkedList li = new SingleLinkedList();

	public void push(int data) {
		li.insertAtHead(data);
	}

	public int pop() {
		if(!li.isEmpty()){
			return li.removeHeadElement().data;
		}
		return -1;
	}

	public void displayStack() {
		li.displayList();
		System.out.println();
	}
	
	public  boolean isEmpty(){
		return li.isEmpty();
	}
	
	public int top(){
		return li.getFirst() ;
	}
	
	public boolean isPalindrome(String str){
		char input[]=str.toCharArray();
		StackUsingLinkedList s=new StackUsingLinkedList();
		int i=0;
		while(input[i] != 'X'){
			s.push(input[i]);
			i++;
		}
		i++;
		while(i<input.length){
			if(s.isEmpty()) return false;
			if(input[i] != (char)s.pop()) return false;
			i++;
		}
		return true;
	}
	
	public  int reverseStack(StackUsingLinkedList s){
		if(s.isEmpty()){
			return -1;
		}
		int temp=s.pop();
		reverseStack(s);
		
		return insertAtBottom(s,temp);
	}
	

	public int insertAtBottom(StackUsingLinkedList s, int data) {
		if(s.isEmpty()){
			s.push(data);
			return s.top();
		}
		int temp=s.pop();
		insertAtBottom(s, data);
		s.push(temp);
		return s.top();
	}
	
	int[] findSpans(int[] inputArray){
		int[] spans=new int[inputArray.length];
		StackUsingLinkedList s=new StackUsingLinkedList();
		int p=0;
		for(int i=0;i<inputArray.length;i++){
			while(!s.isEmpty() && inputArray[i] > inputArray[(Integer)s.top()]){
				s.pop();
			}
			if(s.isEmpty()) p=-1;
			else p=(Integer)s.top();
			spans[i]=i-p;
			s.push(i);
		}
		
		return spans;
	}

	public static void main(String[] args) {
		StackUsingLinkedList st=new StackUsingLinkedList();
//		st.push(50);
//		st.push(70);
//		st.push(190);
//		st.displayStack();
//		st.reverseStack(st);
//		st.displayStack();
//		st.pop();
//		st.displayStack();
//		String s="aabbXbbaa";
//		boolean res=st.isPalindrome(s);
//		System.out.println(res);
		int price[] = {100, 80, 60, 70, 60, 75, 85};
	 
	    // Fill the span values in array S[]
	    int res[]=st.findSpans(price);
	    System.out.print("{ ");
	    for(int i=0; i<res.length;i++){
	    	System.out.print(res[i]+" ");
	    }
	    System.out.print("}");
	}

}
