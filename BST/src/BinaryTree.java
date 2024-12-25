public class BinaryTree{
	
	Node root; 
	
	int size; 
	
	
	public static void main( String[] args) {
		BinaryTree bt = new BinaryTree(); 
		 bt.add(6);
		    bt.add(4);
		    bt.add(8);
		    bt.add(3);
		    bt.add(5);
		    bt.add(7);
		    bt.add(9);
		    

		    //return bt;
		    //bt.print();
		    
		    bt.printLeaves();	
		    bt.add(111);
		    bt.printLeaves();
		    bt.delete(4);
		    bt.printLeaves();
		    bt.print();
	}
	
	public void add(int val) {
		
		root = addRec(root,val);
		size++;
		
	}

	private Node addRec(Node n, Comparable val) {
		
		if(n == null) {
			System.out.println("Done");
			return new Node(val);
		}
		
		
		if(val.compareTo(n.getValue()) >0) {  //means that the node should go to the left
			System.out.println("Done");
			n.left = addRec(n.left, val);
		}
		else if (val.compareTo(n.getValue()) <0) {  //goes to the right
			System.out.println("Done");
			n.right = addRec(n.right, val);
			
		}
		else {  //val == current key
			//System.out.println("Done");
			return n; 
		}
		
	
		return n; 
	}
	
	public void print() {
		print(root);
		
	}
	
	public static void print(Node r) {  ///root passed
    	
    	if( r != null) {
    		print(r.left);
    		
    		System.out.println(r.key);
    		
    		print(r.right);
    		
    		//order of these statements depends on the order of printing (pre post of in order)
    	}
    	
	} 
	
	
	
	public void delete(Comparable val) {
		size--;
		root = delete(val, root);
		
	}
	
	public Node delete(Comparable val, Node n) {
		
		if(n == null) {
			return null; 
		}
		
		if( (n.getValue()).compareTo(val) >0) {  //goes left
			//left and call
			n.setLeft(delete(val, n.getLeft()));
			return n; 
		}
		else if((n.getValue()).compareTo(val) <0) {
			n.setRight(delete(val, n.getRight()));
			return n; 
		}
		else {  // val to delete is found 
			
			if(n.getLeft() == null)  return n.getRight();
			
			else if(n.getRight() ==null) return n.getLeft(); 
			
			//twp children exist. 
			n.setValue(min(n.getRight()));
			n.setRight(delete(n.getValue(), n.getRight()));
		}
		return n; 
	}
	
	public Node max() {
		if(root ==null) {
			return null; 
		}
		
		return max(root);
	}
	
	public Node max(Node n) //finds max node below the current node entered. 
	{
		if(n.getRight() == null) {
			return n; 
		}
		
		return max(n.getRight());
		
	}
	
	public Node min() {
		
		if(root ==null) {
			return null;
		}
		return min(root);
	}
	
	public Node min(Node n) {
		if(n.getLeft() ==null) {
			return n; 
		}
		
		return min(n.getLeft());
	}
	
	public boolean contains(Comparable val) {
		return contains(val, root);
	}

	private boolean contains(Comparable val, Node n) {
		// TODO Auto-generated method stub
		if(n == null) {
			return false; 
		}
		
		if(val.compareTo(n.getValue()) > 0) {
			return contains(val, n.getLeft());
			
		}
		else if(val.compareTo(n.getValue()) < 0) {
			
			return contains(val, n.getRight());
		}
		else {
			return true; 
		}
	}
	
	
	public int getSize() {
		return getSize(root);
	}
	
	private int getSize(Node n) {
		if(n ==null) {
			return 0;
		}
		else {
			return 1 +getSize(n.getLeft()) + getSize(n.getRight()) ;
		}
	}
	
	public int countLeftNodes() {
	
		return countLeftNodes(root, 'o');
	
	}

	public int countLeftNodes(Node n, char c) {
		
		if(n == null) {
			return 0;
		}
		
		if(c == 'l') {
			return 1 + countLeftNodes(n.getLeft(), 'l') + countLeftNodes(n.getRight(), 'r');
		}
		
		else {
			return countLeftNodes(n.getLeft(), 'l') + countLeftNodes(n.getRight(), 'r');
		}
	}
	
	
	public void printLeaves() {
		System.out.println("Leaves: ");
		printLeaves(root);
	}
	
	public void printLeaves(Node n) {
		if(n == null) return; 
		
		if(n.getLeft() == null & n.getRight() == null) {
			System.out.println("'" + n.getValue() + "'  ");
		}
		else {
			printLeaves(n.getLeft());
			printLeaves(n.getRight());
		}
	}
	
	
	
	

	
	
}

/**
 * each node has no more than two children. 
 * left is always lower than parent and right child is always higher
 * when printed in in-order, a BST should list the tree in assending order if the tree is valid. 
 */