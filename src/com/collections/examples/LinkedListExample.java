package com.collections.examples;

public class LinkedListExample {
	Node head;
	int size;

	public class Node {
		String data;
		Node next;

		Node() {
		}

		Node(String data) {
			this.data = data;
			this.next = null;
			size++;
		}
	}

	public void addFirst(String data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	public void deleteFirst() {
		if (head == null) {
			System.out.println("List empty");
		} else {
			head = head.next;
			size--;
		}
	}

	public void deleteLast() {
		if (head == null) {
			System.out.println("List empty");
		} else if (head.next == null) {
			head = null;
			size = 0;
		} else {
			Node secondLast = head;
			Node last = head.next;
			while (last.next != null) {
				last = last.next;
				secondLast = secondLast.next;
			}
			secondLast.next = null;
			size--;
		}
	}

	public void addLast(String data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node currNode = head;
			while (currNode.next != null) {
				currNode = currNode.next;
			}
			currNode.next = newNode;
		}
	}

	public void printList() {
		if (head == null) {
			System.out.println("List empty");
		} else {
			Node currNode = head;
			while (currNode != null) {
				System.out.print(currNode.data + " -> ");
				currNode = currNode.next;
			}
			System.out.println("null");
		}
	}

	public int getSize() {
		return size;
	}

	public static void main(String[] args) {
		LinkedListExample list = new LinkedListExample();
		list.addFirst("Helo");
		list.addFirst("Hi");

		list.addLast("I'am");
		list.addLast("kruthik");

		list.addLast("Electronics");
		list.addLast("engineer");

		list.deleteFirst();
		list.deleteLast();
		list.printList();
		System.out.println(list.getSize());

	}

}
