package com.example;

import java.util.HashMap;
import java.util.Map;

public class LRUCache <K, V> {
	
	private int capacity;
	private Map<K, Node<K, V>> map;
	private DoublyLinkedList<K, V> list;
	
	public LRUCache (int capacity) {
		this.capacity = capacity;
		this.map = new HashMap<>();
		this.list = new DoublyLinkedList<>();
	}
	
	public synchronized V get(K key) {
		if(!map.containsKey(key)) {
			return null;
		}
		
		Node<K, V> node = map.get(key);
		list.moveToFirst(node);
		return node.value;
	}
	
	public synchronized void put(K key, V value) {
		if(map.containsKey(key)) {
			Node<K, V> node = map.get(key);
			node.value = value;
			list.moveToFirst(node);
		}
		
		if(map.size() == capacity) {
			Node<K, V> deletedNode = list.deleteLast();
			map.remove(deletedNode.key);
		}
		
		Node<K, V> newNode = new Node<>(key, value);
		map.put(key, newNode);
		list.addFirst(newNode);
	}

}
