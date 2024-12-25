class BinaryTree {
     
    // Root of Binary Tree
    TNode root;
     
    // Constructors
    BinaryTree(int key) {  //constructor with value. 
    	root = new TNode(key); 
    }
    
    
    BinaryTree() { //null constructor
    	root = null; 
    }
    
    
    public static void print(TNode r) {  ///root passed
    	
    	if( r != null) {
    		print(r.getLeft());
    		
    		System.out.print(r.getKey() + ",");
    		
    		print(r.getRight());
    		
    		//order of these statements depends on the order of printing (pre post of in order)
    	}
    	
    }
    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
         
        // Create root
        tree.root = new TNode(1);
        /* Following is the tree after above statement
           1
          / \
        null null 
        */
 
        tree.root.left = new TNode(2);
        tree.root.right = new TNode(3);
        /* 2 and 3 become left and right children of 1
              1
             / \
            2   3
           / \ / \
       null null null null */
        tree.root.left.left = new TNode(4);
        /* 4 becomes left child of 2
               1
              / \
             2   3
            / \ / \
           4 null null null
          / \
        null null
        */
        
        print(tree.root);
    }
}




/*
- complete tree: every level but last level has to be complete, last level has to fill up from LEFT TO RIGHT STRICTLY. 
- full tree: In a full binary tree, every parent has either 0 or 2 children; left and right does not matter
- root is at level 0, increases by one at every level. 
- Width of a tree is the level with the most nodes. THat level is not always the last level. 
- HEIGHT IS LARGEST NUMBER OF LINKS BETWEEN THE ROOT AND ANY LEAF. (LONGEST)
- max capacity is 2^h -1 

-Traversals:
		- Pre-order: process root node, then its left/right subtrees [parent always first]
		- In-order: Process left subtree, then root node, then right [parent between left and right child]
		- Post-order: Process left/right subtrees, then root nodes [parent after left and right child]
		
*/