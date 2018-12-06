/**
 * @author Narendra Borhade
 *
 */
package com.example.binarysearchtree;

public class Main {

	public static void main(String[] args) {

		BinarySearchTree bst = new BinarySearchTree();
		
		bst.insert(100);
		bst.insert(20);
		bst.insert(35);
		bst.insert(408);
		bst.insert(150);
		bst.insert(233);
		bst.insert(70);
		bst.insert(345);
		bst.insert(90);
		bst.insert(500);
		
		bst.inOrder();
	}

}
