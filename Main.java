package com.bs;

public class Main {

	public static void main(String[] args) {
			
			BinarySearchTree bst = new BinarySearchTree();            //creating instances
			Node root = null;
			
			
			root = bst.insert(root, 56);                //Inserting node in the Binary tree
			root = bst.insert(root, 30);
			root = bst.insert(root, 70);
			root = bst.insert(root, 22);
			root = bst.insert(root, 40);
			root = bst.insert(root, 60);
			root = bst.insert(root, 95);
			root = bst.insert(root, 11);
			root = bst.insert(root, 65);
			root = bst.insert(root, 3);
			root = bst.insert(root, 16);
			root = bst.insert(root, 63);
			root = bst.insert(root, 67);
			bst.print(root);
		}
	}



