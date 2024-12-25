import java.util.EmptyStackException;
public class Stack{
	
	//feilds: 
	int[] stack; 
	int size; 
	
	
	public Stack(){  //CONSTRUCTOR
		
		stack = new int[100];
		size = 0; 
	}

	public void push(int i) throws Exception {
		// TODO Auto-generated method stub
		
		if( size == 100) {
			throw new Exception("OutOfMemoryError");// stack is full basically. 
		}
		
		else { 
			stack[size] = i; 
			size++;
		}
		
	}

	public int pop() throws Exception {
		// TODO Auto-generated method stub
		if( size ==0) {
			throw new Exception("EmptyStackException");
		}
		else {
			
			int returnint = stack[size-1];
			
			stack[size-1] = 0; 
			size--;
			
			return returnint; 
		}
		
	}
	
	public int peek() throws Exception {  //looking at the topmost element
		
		if(size ==0) {
			throw new Exception("EmptyStackException");
		
		}
		else {
			
			return stack[size-1];
		}
		
	}
	
	public String toString() {
		
		
		if( size > 0) {
			String toreturn = "[" + stack[0];
			
			for( int i = 1; i < size; i++) {
				
				toreturn += ", " + stack[i];
			}
			
			return toreturn + "]";
			
		}
		else {
			return "[]  //EMPTY STACK";
		}
	}
	
	public int size() {  //simple getter method
		return this.size;
	}
	
	public boolean isFull() {
		return size ==100; 
	}
	
	
	
	
	
}