package com.abhilash.nodechain;

public class NodeChaining {

	public static void main(String[] args) {
		Node first = new Node();
		first.setValue(3);			// |3|null|
		
		Node second = new Node();
		second.setValue(5);			// |5|null|
		
		first.setNext(second);		// |3|Next| -> |5|null|
		
		print(first);
	}
	
	private static void print(Node node) {
		while(node != null) {
			System.out.println(node.getValue());
			node = node.getNext();
		}
	}
}

class Node {
	private int value;
	private Node next;
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
}