import java.util.PriorityQueue;

public class Main {
	
	public static void main(String[] args) {
		
		PriorityQueue<String> que = new PriorityQueue<>();
		
		que.offer("first");
		que.offer("second");
		que.offer("third");
		
		System.out.printf("%s ", que);
		System.out.println();
		
		System.out.printf("%s ", que.peek());     // highest priority
		System.out.println();
		
		que.poll();								// remove highest priority
		System.out.printf("%s ", que);
		
		
	}

}
