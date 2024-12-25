//Disk is standard and straightforward.
public class Disk implements Comparable<Disk>{
	
	int rad; //radius instance varibable. 
	//instance variables: 
	
	
	public Disk(int r) {
		this.rad = r; 
	}
	

	@Override
	public int compareTo(Disk o) {
		// TODO Auto-generated method stub
		return this.rad - o.rad ; 
	}
	
	public String toString() {
		return this.rad +""; 
	}
    
}