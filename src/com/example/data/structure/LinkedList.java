package com.example.data.structure;

public class LinkedList {

	private Node head;
	
	private static class Node{
		
		private int value;
		private Node next;
		
		public Node(int value) {
			super();
			this.value = value;
		}
	}
	
	/**
	 * Add values in Linked List
	 * @param node
	 */
	public void addToList(Node node){
		
		if(head == null){
			head = node;
		}else{
			Node temp = head;
			
			while(temp.next != null)
				temp = temp.next;
			temp.next = node;
		}
	}
	
	/**
	 * Print Linked List
	 * @param head
	 */
	public void printList(Node head) {
		  Node temp = head;
		  
		  System.out.print("Values in Linked List:"); 
		  while (temp != null) {
		   System.out.format("%d ", temp.value);
		   temp = temp.next;
		  }
		  System.out.println();
		 }
	
	
	public static Node reverseLinkedList(Node currentNode)
	 {
	
	  // For first node, previousNode will be null
	  Node previousNode=null;
	  Node nextNode;
	  
	  while(currentNode!=null)
	  {
	   nextNode=currentNode.next;
	  // reversing the link
	   currentNode.next=previousNode;
	  // moving currentNode and previousNode by 1 node
	   previousNode=currentNode;
	  
	   currentNode=nextNode;
	  }
	  return previousNode;
	}
	
	
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
	
		// Creating a linked list
		  Node head=new Node(5);
		  list.addToList(head);
		  list.addToList(new Node(6));
		  list.addToList(new Node(7));
		  list.addToList(new Node(1));
		  list.addToList(new Node(2));
		 
		  list.printList(head);
		  
		  //Reversing LinkedList
		  Node reverseHead=reverseLinkedList(head);
		  System.out.println("After reversing");
		  list.printList(reverseHead);

	}

}
