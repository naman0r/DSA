//Name: 
//Date:

/*******************
Represents a binary search tree holding Strings. 
Implements (most of) BSTinterface, above. 
The recursive methods all have a public method calling a private helper method. 
Copy the display() method from TreeLab. 
**********************/
class BST //implements BSTinterface
{
   private TreeNode root;
   private int size;
   public BST()
   {
      root = null;
      size = 0;
   }
   public int size() {
       return size(root);
   }
   
   private int size(TreeNode node) {
       if (node == null) {
           return 0;
       }
       return 1 + size(node.getLeft()) + size(node.getRight());
   }
   
   
   public TreeNode getRoot(){
	   return root; 
   
   }
   
     
   public void remove(String target)
   {
      root = remove(root, target);
      size--;
   }
   private TreeNode remove(TreeNode t, String target){ 
	   //take greatest in the left subtree or least in the right subtree
	   //B IS MORE THAN A. A.compareTo(B) = -1
	   if(t ==null) {
		   return null; 
	   }
	   
	   if(((String) t.getValue()).compareTo(target) >0) {
		   //left and call
		   t.setLeft(remove(t.getLeft(), target));
	   }
	   else if(((String) t.getValue()).compareTo(target) <0) {
		   //right and call
		   t.setRight(remove(t.getRight(), target));
	   }
	   else {  //node is found
		   
		   if(t.getLeft() ==null) return t.getRight();
		   else if(t.getRight() ==null) return t.getLeft(); 
		   
		   //two children exist 
		   t.setValue(min(t.getRight()));
		   t.setRight(remove(t.getRight(), (String)t.getValue()));
		   
		   
	   }
	   
	   return t; 
	
	   
   }
   
   public int numChildren(TreeNode t) {
	   
	   if(t.getLeft() == null && t.getRight() ==null) return 0; 
	   else if(t.getRight() == null || t.getLeft() == null) return 1; 
	   else return 2; 
   }
   public boolean isLeaf(TreeNode t) {
	   return numChildren(t) ==0;
   }
   
   
   
   /***************************************
   @param s -- one string to be inserted
   ****************************************/
   public void add(String s) {
       root = add(root, s);
   }

   private TreeNode add(TreeNode node, String s) {
       if (node == null) {
           size++; // Increase tree size
           return new TreeNode(s);
       }
       int compare = s.compareTo((String)node.getValue());
       if (compare > 0) {
           node.setRight(add(node.getRight(), s));
       } else if (compare < 0) {
           node.setLeft(add(node.getLeft(), s));
       }
       // If s is equal to the node's value, we do nothing.
       return node;
   }
   
   public String display()
   {
      return display(root, 0);
   }
   
   private String display(TreeNode t, int level)
   {
      String toRet = "";
      if(t == null)
         return "";
      toRet += display(t.getRight(), level + 1); //recurse right
      for(int k = 0; k < level; k++)
         toRet += "\t";
      toRet += t.getValue() + "\n";
      toRet += display(t.getLeft(), level + 1); //recurse left
      return toRet;
   }
   
   public boolean contains(String obj) {
       return contains(root, obj);
   }

   private boolean contains(TreeNode node, String x) {
       if (node == null) {
           return false;
       }
       int compare = x.compareTo((String)node.getValue());
       if (compare == 0) {
           return true;
       } else if (compare < 0) {
           return contains(node.getLeft(), x);
       } else {
           return contains(node.getRight(), x);
       }
   }
   
  
   
   public String min() {
	    if (root == null) {
	        return null; // or throw an exception depending on your requirement
	    }
	    return(String) min(root).getValue();
	}

	private TreeNode min(TreeNode node) {
	    if (node.getLeft() == null) {
	        return node;
	    }
	    return min(node.getLeft());
	}
	
	
	public String max() {
	    if (root == null) {
	        return null; // or throw an exception depending on your requirement
	    }
	    return (String)max(root).getValue();
	}

	private TreeNode max(TreeNode node) {
	    if (node.getRight() == null) {
	        return node;
	    }
	    return max(node.getRight());
	}

	
   
   public String toString()
   {
      toString(root);
      return "";
   }
   private void toString(TreeNode r)  //an in-order traversal.  Use recursion.
   {
	   if( r != null) {
   		toString(r.getLeft());
   		
   		System.out.println(r.getValue() );
   		
   		toString(r.getRight());
	   }
   
   }
   
}

//balanced tree: Height difference is 1 or 0. cannot be more than 1. 
