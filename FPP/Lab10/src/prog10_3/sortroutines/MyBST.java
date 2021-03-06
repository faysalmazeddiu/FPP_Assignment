package prog10_3.sortroutines;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyBST {
	/** The tree root. */
	private Node rootNode;
	private List<Integer> listOfInteger = new ArrayList<Integer>();

	// start with an empty tree
	public MyBST() {
		rootNode = null;
	}

	



	public int[] readIntoArray() {
		changeTreeToSortArrayy(rootNode);
		int[] array = new int[listOfInteger.size()];
		for (int index = 0; index < array.length; index++) {
			array[index] = listOfInteger.get(index);
		}
		return array;
	}
	
	public void insertAll(int[] arr) {
		for (int index = 0; index < arr.length; index++) {
			insert(arr[index]);
		}
	}
	
	private void changeTreeToSortArrayy(Node tree) {
		if (tree != null) {
			printTree(tree.left);
			listOfInteger.add(tree.element);
			printTree(tree.right);
		}
	}

	/**
	 * Prints the values in the nodes of the tree in sorted order.
	 */

	public void printTree() {
		if (rootNode == null) {
			System.out.println("Tree is empty");
		}
		else {
			printTree(rootNode);
		}
	}

	private void printTree(Node tree) {
		if (tree != null) {
			printTree(tree.left);
			System.out.println(tree.element);
			printTree(tree.right);
		}
	}

	public void printAsDiagram() {
		BTreePrinter.printNode(rootNode);
	}

	public boolean find(Integer x) {
		if (x == null) {
			return false;
		}
			
		return find(x, rootNode);
	}

	private boolean find(Integer val, Node node) {
		if (node == null) {
			return false;
		}
		if (node != null && node.element.equals(val)) {
			return true;
		}
		
		if(val.compareTo(node.element) < 0) {
			return find(val, node.left);
		}else {
			return find(val, node.right);
		}
		
		
		//return (val.compareTo(node.element) < 0) ? find(val, node.left) : find(val, node.right);
		// return find(x,n.left) || find(x,n.right);
	}

	public void insert(Integer xVal) {
		if (rootNode == null) {
			rootNode = new Node(xVal, null, null);
		}
		else {
			Node node = rootNode;
			boolean inserted = false;
			while(!inserted){
				if(xVal.compareTo(node.element)<0) {
					//space found on the left
					if(node.left == null){
						node.left = new Node(xVal,null,null);
						inserted = true;
					}
					else {
						node = node.left;
					}
				}
				
				else if(xVal.compareTo(node.element)>=0){ 
					//space found on the right					
					if(node.right==null){
						node.right = new Node(xVal,null,null);
						inserted = true;
					}
					else {
						node = node.right;
					}
				}
				
			}

		}
	}

	public static void main(String[] args) {
		MyBST bst = new MyBST();
		for (int i = 15; i >= 0; --i) {
			bst.insert(new Integer(2 * i));
			bst.insert(new Integer(2 * i - 5));
		}
		bst.printTree();
		System.out.println("Is 24 in the tree? " + bst.find(new Integer(24)));
		System.out.println("Is 27 in the tree? " + bst.find(new Integer(27)));

	}

	private class Node {

		// Constructors
		Node(Integer theElement) {
			this(theElement, null, null);
		}

		Node(Integer element, Node left, Node right) {
			this.element = element;
			this.left = left;
			this.right = right;
		}

		private Integer element; // The data in the node
		private Node left; // Left child
		private Node right; // Right child
	}

	static class BTreePrinter {

		public static void printNode(Node root) {
			int maxLevel = BTreePrinter.maxLevel(root);

			printNodeInternal(Collections.singletonList(root), 1, maxLevel);
		}

		private static void printNodeInternal(List nodes, int level, int maxLevel) {
			if (nodes.isEmpty() || BTreePrinter.isAllElementsNull(nodes))
				return;

			int floor = maxLevel - level;
			int endgeLines = (int) Math.pow(2, (Math.max(floor - 1, 0)));
			int firstSpaces = (int) Math.pow(2, (floor)) - 1;
			int betweenSpaces = (int) Math.pow(2, (floor + 1)) - 1;

			BTreePrinter.printWhitespaces(firstSpaces);

			List newNodes = new ArrayList();
			for (Object node : nodes) {
				if (node != null) {
					System.out.print(((Node) node).element);
					newNodes.add(((Node) node).left);
					newNodes.add(((Node) node).right);
				} else {
					newNodes.add(null);
					newNodes.add(null);
					System.out.print(" ");
				}

				BTreePrinter.printWhitespaces(betweenSpaces);
			}
			System.out.println("");

			for (int i = 1; i <= endgeLines; i++) {
				for (int j = 0; j < nodes.size(); j++) {
					BTreePrinter.printWhitespaces(firstSpaces - i);
					if (nodes.get(j) == null) {
						BTreePrinter.printWhitespaces(endgeLines + endgeLines + i + 1);
						continue;
					}

					if (((Node) nodes.get(j)).left != null)
						System.out.print("/");
					else
						BTreePrinter.printWhitespaces(1);

					BTreePrinter.printWhitespaces(i + i - 1);

					if (((Node) nodes.get(j)).right != null)
						System.out.print("\\");
					else
						BTreePrinter.printWhitespaces(1);

					BTreePrinter.printWhitespaces(endgeLines + endgeLines - i);
				}

				System.out.println("");
			}

			printNodeInternal(newNodes, level + 1, maxLevel);
		}

		static void printWhitespaces(int count) {
			for (int i = 0; i < count; i++)
				System.out.print(" ");
		}

		static int maxLevel(Node node) {
			if (node == null)
				return 0;

			return Math.max(BTreePrinter.maxLevel(node.left), BTreePrinter.maxLevel(node.right)) + 1;
		}

		static boolean isAllElementsNull(List list) {
			for (Object object : list) {
				if (object != null)
					return false;
			}

			return true;
		}
	}
}