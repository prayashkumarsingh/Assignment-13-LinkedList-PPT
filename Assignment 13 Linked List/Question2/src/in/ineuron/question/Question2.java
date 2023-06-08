package in.ineuron.question;

import java.util.*;

public class Question2 {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	void removeDuplicates() {
		Node curr = head;
		while (curr != null) {
			Node temp = curr;
			while (temp != null && temp.data == curr.data) {
				temp = temp.next;
			}
			curr.next = temp;
			curr = curr.next;
		}
	}

	public void push(int new_data) {

		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String args[]) {
		LinkedList llist = new LinkedList();
		llist.push(60);
		llist.push(43);
		llist.push(43);
		llist.push(21);
		llist.push(11);
		llist.push(11);
		llist.push(11);

		System.out.println("List before removal of duplicates");
		llist.printList();

		llist.removeDuplicates();

		System.out.println("List after removal of elements");
		llist.printList();
	}
}
