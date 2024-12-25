//Name -

import static java.lang.System.*;

public class HistoTree
{
   private HistoNode root;

	public HistoTree( )
	{
		root = null;
	}

	public void addData(Comparable data)
	{
		root = add(data, root);
	}

	private HistoNode add(Comparable data, HistoNode n)
	{
		if( n == null) {
			return new HistoNode(data, 1, null, null);
		}
		
		else if( data.compareTo(n.getData()) > 0) {
			n.setRight(add(data, n.getRight()));
		}
		else if(data.compareTo(n.getData())  <0 ) {
			n.setLeft(add(data, n.getLeft()));
		}
		else { //same data as current node. 
			
			n.setDataCount(n.getDataCount() +1);
			
		}
		return n; 
	}

	public HistoNode search(Comparable data)
	{
		return search(data, root); 
	}

	private HistoNode search(Comparable data, HistoNode n)
	{
		if(n == null) {
			return null; 
		}
		else if(data.compareTo(n.getData()) > 0) {
			return search(data, n.getRight());
			
		}
		else if(data.compareTo(n.getData()) > 0) {
			return search(data, n.getLeft());
		}
		else {
			return n; 
		}
	}
	
	public boolean isBalanced() {
		return true; 
	}
	
	/**
	 * @param data
	 * @return
	 */
	public HistoNode remove(Comparable data) {
		
		if(search(data) != null)
		return remove(data, root);
		
		else return null; 
	}
	
	public HistoNode remove(Comparable data, HistoNode n) {
		
		
		if(n == null )
	}
	
	

	

	public String toString()
	{
		return toString(root);
	}

	private String toString(HistoNode n)
	{
		if(n == null) {
			return "";
		}
		else {
			return n.getData() + "-" + n.getDataCount() +", " + toString(n.getLeft()) + toString(n.getLeft());
		}
		
	}
	
	
	public void print() {
		print(root);
	}
	
	public void print(HistoNode n) {
		if(n!= null) {
			print(n.getLeft());
			System.out.print(n.getData() + " - " + n.getDataCount() + "; ");
			print(n.getRight());
		}
		//System.out.println();
	}
}