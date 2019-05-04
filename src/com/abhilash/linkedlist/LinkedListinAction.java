package com.abhilash.linkedlist;


public class LinkedListinAction {

	public static void main(String[] args) {
		
	}
}

class LinkedListNode<T> {
	private T Value;
	private LinkedListNode<T> next;
	public LinkedListNode(T value) {
		this.setValue(value);
	}
	
	public T getValue() {
		return Value;
	}
	public void setValue(T value) {
		Value = value;
	}

	public LinkedListNode<T> getNext() {
		return next;
	}

	public void setNext(LinkedListNode<T> next) {
		this.next = next;
	}
}