package labUtils;

import treeClasses.LinkedBinaryTree;
import treeClasses.LinkedTree;
import treeInterfaces.Position;
import treeInterfaces.Tree;

public class Utils {
	public static <E> void displayTree(String msg, Tree<E> t) { 
		System.out.println("\n\n" + msg); 
		t.display(); 
	}

	public static <E> void displayTreeElements(String msg, Tree<E> t) {
		System.out.println("\n\n" + msg); 
		for (E element : t)
			System.out.println(element); 
		
	}
	
	public static LinkedTree<Integer> buildExampleTreeAsLinkedTree() { 
		LinkedTree<Integer> t = new LinkedTree<>(); 
		
		t.addRoot(4);
		Position<Integer> p1 = t.addChild(t.root(), 9);
		t.addChild(p1,7);
		t.addChild(p1,10);
		Position<Integer> p2 = t.addChild(t.root(), 20);
		Position<Integer> p3 = t.addChild(p2,15);
		t.addChild(p3, 12);
		Position<Integer> p4 = t.addChild(p3,17);
		t.addChild(p4, 19);
		Position<Integer> p5 = t.addChild(p2,21);
		Position<Integer> p6 = t.addChild(p5,40);
		t.addChild(p6, 30);
		t.addChild(p6, 45);
		return t; 
	}
	
	public static LinkedBinaryTree<Integer> buildExampleTreeAsLinkedBinaryTree() { 
		LinkedBinaryTree<Integer> t = new LinkedBinaryTree<>(); 
		
		t.addRoot(4);
		Position<Integer> p1 = t.addLeft(t.root(), 9);
		t.addLeft(p1,7);
		t.addRight(p1,10);
		Position<Integer> p2 = t.addRight(t.root(), 20);
		Position<Integer> p3 = t.addLeft(p2,15);
		t.addLeft(p3, 12);
		Position<Integer> p4 = t.addRight(p3,17);
		t.addLeft(p4, 19);
		Position<Integer> p5 = t.addRight(p2,21);
		Position<Integer> p6 = t.addRight(p5,40);
		t.addLeft(p6, 30);
		t.addRight(p6, 45);
		
		
		return t; 
	}


}
