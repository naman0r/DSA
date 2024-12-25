import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World");
        
        
        Queue<Double> he = new PriorityQueue<>(); 
        he.add(3.0);
        he.add(2.0);
        he.add(4.0);
        
        //System.out.println(he.toString());
        
        String expression = "231*+9-";
        System.out.println("Postfix Expression: " + expression);
        System.out.println("Evaluation Result: " + evaluatePostfix(expression));
        
        		
    }
    
    public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
           

            // If the character is a digit, push it onto the stack
            if(Character.isDigit(ch)) {
                stack.push((int) (ch));
            } else {
                // Pop two operands from the stack, perform the operation, and push the result back
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                switch(ch) {
                    case '+':
                        stack.push(operand1 + operand2);
                        System.out.println(operand1 + "+" + operand2);
                        System.out.println(stack.toString());
                        break;
                    case '-':
                        stack.push(operand1 - operand2);
                        System.out.println(operand1 + "-" + operand2);
                        System.out.println(stack.toString());
                        break;
                    case '*':
                        stack.push(operand1 * operand2);
                        System.out.println(operand1 + "*" + operand2);
                        System.out.println(stack.toString());
                        break;
                    case '/':
                        stack.push(operand1 / operand2);
                        System.out.println(operand1 + "/" + operand2);
                        System.out.println(stack.toString());
                        break;
                }
            }
        }
        // The final result is on the top of the stack
        return stack.pop();
    }
    
    

}
