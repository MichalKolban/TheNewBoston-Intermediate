import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {
	
	public static void main(String[] args) {
		
		String[] things = {"apples", "noobs", "hello", "Michael", "bacon"};
		
		List<String> list1 = new LinkedList<String>();
		
		for(String x : things ){
			list1.add(x);
		}
		
		
		String[] things2 = {"berrys", "bacon", "cookie", "lincoln"};
		
		List<String> list2 = new LinkedList<String>();
		for(String y : things2) {
			list2.add(y);
		}
		
		list1.addAll(list2);
		
		list2 = null;				// relase some memory, becouse list 2 is now added to list 1
		
		printMe(list1);
		
		removeStuff(list1, 2,5);
		
		printMe(list1);
		
		reverseMe(list1);
		
	}
	
	//printMe 
	
	private static void printMe(List<String> l1) {
		for(String tempList : l1) {
			System.out.printf("%s ", tempList);
		}
		System.out.println();	
	}
		
		
	//remomveStuff
		

	private static void removeStuff(List<String> l1, int from, int to) {
		l1.subList(from, to).clear();	
	}
	
	
	
	// reverseMe
	
	private static void reverseMe(List<String> l1) {
		ListIterator<String> listIterator = l1.listIterator(l1.size());
		while(listIterator.hasPrevious()) {
			System.out.printf("%s ", listIterator.previous());
		}
	}
	
	
	
	
	

}
