import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		String[] things = {"eggs", "lasers", "hats", "pie"};
		
		List<String> list1 = new ArrayList<>();
		
		//add array items to list
		for(String thing1 : things) {
			list1.add(thing1);
		}
		
		String[] moreThings = {"lasers", "hats"};
		
		List<String> list2 = new ArrayList<>();
		
		//add array moreItems to list2
		for(String thing2 : moreThings) {
			list2.add(thing2);
		}
		
		//print out list 1
		for(int i = 0; i<list1.size(); i++) {
			System.out.printf("%s ", list1.get(i));
		}
		
		// remove items from list
		editList(list1,list2);
		System.out.println();
		
		
		//print out list 1 - same elements in list 2
		for(int i = 0; i<list1.size(); i++) {
			System.out.printf("%s ", list1.get(i));
				}
		
		}
	
		public static void editList(Collection<String> l1, Collection<String> l2) {
			Iterator<String> iterator = l1.iterator();
			while(iterator.hasNext()) {
				if(l2.contains(iterator.next())) {
					iterator.remove();
				}
			}
		}
	}

