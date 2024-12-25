

public class StackG <T>{
	
	//feilds: 
	T[] stack; 
	int size; 
	
	
	@SuppressWarnings("unchecked")
	public StackG(){  //CONSTRUCTOR
		
		size = 0; 
		stack = (T[]) new Object[100];
		 
	}

	public void push(T i) throws Exception {
		// TODO Auto-generated method stub
		
		if( size == 100) {
			throw new Exception("OutOfMemoryError");// stack is full basically. 
		}
		
		else { 
			stack[size] = i; 
			size++;
		}
		
	}

	public T pop() throws Exception {
		// TODO Auto-generated method stub
		if( size ==0) {
			throw new Exception("EmptyStackException");
		}
		else {
			
			T returnint = stack[size-1];
			
			stack[size-1] = null; 
			size--;
			
			return returnint; 
		}
		
	}
	
	public T peek() throws Exception {  //looking at the topmost element
		
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