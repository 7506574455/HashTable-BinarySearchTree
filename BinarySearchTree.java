package com.bs;

class Node{                      //class for creating node in linklist
	int data;
	Node left;
	Node right;

}

public class BinarySearchTree {                      //class

	
	public Node insert(Node root, int val) {            //method to insert child node
		if (root == null) {
			return createNewNode(val);
		}
		if (val < root.data) {
			root.left = insert(root.left, val);
		}
		else if (val > root.data) {
			root.right = insert(root.right, val);
		}
		return root;

	}

	
	public Node createNewNode(int k) {          //method to create new node
		Node bst = new Node();
		bst.data = k;
		bst.left = null;
		bst.right = null;
		return bst;
	}

	 
	public void print(Node root) {             	//method to print node
		if (root == null) {
			return;
		}
		print(root.left);
		System.out.println(root.data);
		print(root.right);
				
	}

}

