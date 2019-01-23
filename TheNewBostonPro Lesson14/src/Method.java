import java.util.Stack;

public class Method {
	
	public static void printStack(Stack<String> s) {
		if(s.isEmpty()) {
			System.out.println("The stack is empty");
		}else {
			System.out.println(s + " <-- TOP of the Stack" );
		}
	}

}
