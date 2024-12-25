// Class containing left and right child
// of current node and key value
public class TNode {
 
    Object key;
 
    TNode left;
    TNode right;
    public TNode(Object item)
    {
        key = item;
        left = right = null;
    }
    
    public TNode getLeft() {
    	return this.left;
    }
    
    public TNode getRight() {
    	return this.right; 
    }
    
    public void setLeft(TNode l) {
    	this.left = l; 
    }
    public void setRight(TNode l) {
    	this.right = l; 
    }
    
    public Object getKey() {
    	return this.key; 
    }
}

 