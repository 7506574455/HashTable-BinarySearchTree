package com.bs;

public class Main {

        //main method
	public static void main(String[] args) {
		//create instances
		BinarySearchTree bst = new BinarySearchTree();
		Node root = null;
		//Insert node in Binary tree
			
		root = bst.insert(root, 56);         //  56-root node
		root = bst.insert(root, 30);        //  30 -left node
		root = bst.insert(root, 70);       //	70-right node	

		bst.print(root);

	}

}

