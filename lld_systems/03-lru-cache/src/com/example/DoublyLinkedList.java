package com.example;

public class DoublyLinkedList<K, V> {
	private Node<K, V> head;
	private Node<K, V> tail;
	
	public DoublyLinkedList () {
		this.head = new Node<>();
		this.tail = new Node<>();
		this.head.next = tail;
		this.tail.prev = head;
	}
	
	public void addFirst(Node<K, V> node) {
		node.next = head.next;
		head.next.prev = node;
		node.prev = head;
		head.next = node;
	}
	
	public void remove(Node<K, V> node) {
		node.prev.next = node.next;
		node.next.prev = node.prev;
		node.next = null;
		node.prev = null;
	}
	
	public void moveToFirst(Node<K, V> node) {
		remove(node);
		addFirst(node);
	}
	
	public Node<K, V> deleteLast(){
		if(tail.prev == head) {
			return null;
		}
		
		Node<K, V> lastNode = tail.prev;
		remove(lastNode);
		return lastNode;
	}
}
