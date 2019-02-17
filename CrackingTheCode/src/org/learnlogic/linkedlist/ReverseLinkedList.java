package org.learnlogic.linkedlist;

import org.learnlogic.linkedlist.*;

public class ReverseLinkedList {

	public static Node head = null;

	public Node reverseRecur2(Node current) {
		if (current == null) {
			return null;
		}
		if (current.next == null) {
			head = current;
			return null;
		}
		reverseRecur2(current.next);
		current.next.next = current;
		current.next = null;
		return head;
	}

	public void display(Node head) {
		//
		Node currNode = head;
		while (currNode != null) {
			System.out.print("-&gt;" + currNode.data);
			currNode = currNode.next;
		}
	}

	public static void main(String args[]) {
		head = new Node(10);
		head.next = new Node(8);
		head.next.next = new Node(6);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(2);
		head.next.next.next.next.next = new Node(1);
		System.out.println("Original List :");
		ReverseLinkedList r = new ReverseLinkedList();
		r.display(head);
		System.out.println("\nReversed List :");
		Node x = r.reverseRecur2(head);
		r.display(x);
	}
}

	
