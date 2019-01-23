import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		Method met = new Method();
		
		Character[] ray = {'p', 'b', 'm'};
		
		List<Character> list = Arrays.asList(ray);
		
		System.out.println("List is : ");
		
		
		Method.output(list);
		
		
		//reverse and pirnt out list
		
		Collections.reverse(list);
		System.out.println("After reverse");
	
		Method.output(list);
		
		
		// create new array and new list
		
		Character[] newRay = new Character[3];
		List<Character> copyList = Arrays.asList(newRay);
		
		
		//copy contents od list into newList
		
		Collections.copy(copyList, list);
		
		System.out.println("Copy of list : ");
		Method.output(copyList);
		
		// fill collection with data
		
		Collections.fill(list, 'Z');
		System.out.println("After filling the list : " );
		Method.output(list);
	}

	
	
	
}
