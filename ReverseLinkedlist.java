package LinkedList;

public class ReverseLinkedlist {


		static Node head; 

		static class Node { 

			int data; 
			Node next; 

			Node(int d) 
			{ 
				data = d; 
				next = null; 
			} 
		} 

		Node reverse(Node node) 
		{ 
			Node prev = null; 
			Node current = node; 
			Node next = null; 
			while (current != null) { 
				next = current.next; 
				current.next = prev; 
				prev = current; 
				current = next; 
			} 
			node = prev; 
			return node; 
		} 
		void printList(Node node) 
		{ 
			while (node != null) { 
				System.out.print(node.data + " "); 
				node = node.next; 
			} 
		} 

		public static void main(String[] args) 
		{ 
			ReverseLinkedlist list = new ReverseLinkedlist(); 
			list.head = new Node(23); 
			list.head.next = new Node(89); 
			list.head.next.next = new Node(67); 
			list.head.next.next.next = new Node(21); 

			System.out.println("Linked list"); 
			list.printList(head); 
			head = list.reverse(head); 
			System.out.println(""); 
			System.out.println("Reversed linked list "); 
			list.printList(head); 
		} 
	} 



