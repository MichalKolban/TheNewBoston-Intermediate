import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		
		
		Stack<String> stack = new Stack<String>();
		
		stack.push("first element");
		
		Method.printStack(stack);
		
		stack.push("second element");
		
		Method.printStack(stack);
		
		stack.push("third element");
		
		Method.printStack(stack);
		
		stack.pop();
		Method.printStack(stack);
		
		stack.pop();
		Method.printStack(stack);
		
		stack.pop();
		Method.printStack(stack);
		
	}
	
	
}
