
public class StackTester2 {
    public static void main(String [] args) throws Exception {
    	
    	//Do stackTester1 first
    	
        StackG<Integer> s = new StackG<Integer>();
        s.push(1);
        s.push(2);
	    System.out.println(s.peek());
        s.push(3);
        System.out.println(s.size());
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        
    }
}