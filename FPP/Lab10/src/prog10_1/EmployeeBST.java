package prog10_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeBST {
	
	/** The tree root. */
	private Node rootNode;
	private NameComparator nameComparator;

	//start with an empty tree
	public EmployeeBST(NameComparator nameComparator) {
		rootNode = null;
		this.nameComparator = nameComparator;
	}

	/**
	 * Prints the values in the nodes of the tree in sorted order.
	 */
	public void printTree() {
		
		if(rootNode != null) {
			printTree(rootNode);
		}else {
			System.out.println(" Tree is Empty");
		}
		
	}

	private void printTree(Node tree) {
		if (tree != null) {
			printTree(tree.leftNode);
			System.out.println(tree.empl);
			printTree(tree.rightNode);
		}
	}
	
	public void printAsDiagram() {
		BTreePrinter.printNode(rootNode);
	}
	
	public boolean find(Employee employee) {
		if(employee==null) {
			return false;
		}
		boolean value=find(employee,rootNode);
		return value;
	}
	private boolean find(Employee empl, Node node){
		if(node == null) {
			return false;
		} 
		if(node != null && node.empl.equals(empl)) {
			return true;
		} 
		
		if(nameComparator.compare(empl, node.empl) < 0) {
			return find(empl,node.leftNode) ;
		}else {
			return find(empl,node.rightNode);
		}
		
	}

	public void insert(Employee empl) {
		if (rootNode == null) {
			rootNode = new Node(empl, null, null);
		}
		else {
			Node node = rootNode;
			boolean insertedData = false;
			while(!insertedData){
				if(nameComparator.compare(empl, node.empl) < 0) {
					
					if(node.leftNode !=null) {
						node = node.leftNode;
					}else {
						node.leftNode = new Node(empl,null,null);
						insertedData = true;
					}
					
					
//					if(node.leftNode == null){
//						node.leftNode = new Node(empl,null,null);
//						insertedData = true;
//					}
//					else {
//						node = node.leftNode;
//					}
					
				}
				
				else if(nameComparator.compare(empl, node.empl) >=0){ 
					
					if(node.rightNode!=null){
						node = node.rightNode;
					}else {
						node.rightNode = new Node(empl, null, null);
						insertedData = true;
					}
					
					
					
//					if(node.rightNode==null){
//						node.rightNode = new Node(empl, null, null);
//						insertedData = true;
//					}
//					else {
//						node = node.rightNode;
//					}
					
					
				}
				
			}

		}
	}
	public static void main(String[] args){
		MyBST bstMine = new MyBST();
		for(int i = 15; i >= 0; --i){
			bstMine.insert(new Integer(2*i));
			bstMine.insert(new Integer(2*i - 5));
		}
		bstMine.printTree();
		System.out.println("Is 24 in the tree? "+bstMine.find(new Integer(24)));
		System.out.println("Is 27 in the tree? "+bstMine.find(new Integer(27)));
		
	}

	private class Node {
		
		private Employee empl; 
		private Node leftNode; 
		private Node rightNode; 
		// Constructors
		Node(Employee empl) {
			this(empl, null, null);
		}

		Node(Employee empl, Node leftNode, Node rightNode) {
			this.empl = empl;
			this.leftNode = leftNode;
			this.rightNode = rightNode;
		}
		
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
	                System.out.print(((Node)node).empl);
	                newNodes.add(((Node)node).leftNode);
	                newNodes.add(((Node)node).rightNode);
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

	                if (((Node)nodes.get(j)).leftNode != null)
	                    System.out.print("/");
	                else
	                    BTreePrinter.printWhitespaces(1);

	                BTreePrinter.printWhitespaces(i + i - 1);

	                if (((Node)nodes.get(j)).rightNode != null)
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

	        return Math.max(BTreePrinter.maxLevel(node.leftNode), BTreePrinter.maxLevel(node.rightNode)) + 1;
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
