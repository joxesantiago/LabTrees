package testerClasses;

import labUtils.Utils;
import treeClasses.LinkedTree;

public class CloneLinkedTreeTester {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		LinkedTree<Integer> t = Utils.buildExampleTreeAsLinkedTree(); 
		
		LinkedTree<Integer> clone = new LinkedTree<>();
		
		clone = t.clone();

		// display content as a tree
		Utils.displayTree("The tree is: ", t); 
		
		Utils.displayTree("The clone is: ", clone);
		
		LinkedTree<Integer> t2 = new LinkedTree<>();
		LinkedTree<Integer> clone2 = t2.clone();
		
		Utils.displayTree("The tree is: ", t2);
		Utils.displayTree("The tree is: ", clone2);
	}

}
