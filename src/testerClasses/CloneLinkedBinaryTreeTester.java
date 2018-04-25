package testerClasses;

import labUtils.Utils;
import treeClasses.LinkedBinaryTree;

public class CloneLinkedBinaryTreeTester {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		LinkedBinaryTree<Integer> t = Utils.buildExampleTreeAsLinkedBinaryTree(); 
		
		LinkedBinaryTree<Integer> clone = t.clone();
		// display content as a tree
		Utils.displayTree("The original binary tree is: ", t); 
		
		Utils.displayTree("The original binary tree is: ", clone);
	}

}
