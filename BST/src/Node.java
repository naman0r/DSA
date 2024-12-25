class Node {

	Comparable key;
	Node left;
	Node right;

	Node(Comparable key) {

		this.key = key;
		this.right = null; 
		this.left = null; 

	}

	public String toString() {

		return  "this node has the key " + key;

		/*
		 * return name + " has the key " + key + "\nLeft Child: " + leftChild +
		 * "\nRight Child: " + rightChild + "\n";
		 */

	}

	
	public Comparable getValue()
    { 
       return key; 
    }
 
     public Node getLeft() { 
       return left; 
    }
 
     public Node getRight() 
    { 
       return right; 
    }
 
     public void setValue(Object theNewValue) 
    { 
       key = (Comparable) theNewValue; 
    }
 
     public void setLeft(Node theNewLeft) 
    { 
       left = theNewLeft;
    }
 
     public void setRight(Node theNewRight)
    { 
       right = theNewRight;
    }
}