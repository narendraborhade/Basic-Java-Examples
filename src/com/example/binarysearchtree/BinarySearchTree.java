/**
 * @author Narendra Borhade
 *
 */
package com.example.binarysearchtree;

public class BinarySearchTree {
	
	class Node{
		int key;
		Node left, right;
		
		public Node(int item){
			key = item;
			left = right = null;
		}
	}
	
	Node root;
	
	public BinarySearchTree(){
		root = null;
	}
	
	void insert(int key){
		root = insertRecord(root, key);
	}
	
	Node insertRecord(Node root, int key){
		
		if(root == null){
			root = new Node(key);
			return root;
		}
		
		if(key < root.key){
			root.left = insertRecord(root.left, key);
		} else if(key > root.key){
			root.right = insertRecord(root.right, key);
		}
		
		return root;
	}
	
	void inOrder(){
		inOrderRecord(root);
	}
	
	void inOrderRecord(Node root){
		if(root != null){
			inOrderRecord(root.left);
			System.out.println(root.key);
			inOrderRecord(root.right);
		}
	}
}
