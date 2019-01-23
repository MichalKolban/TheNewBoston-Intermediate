import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	
	public static void main(String[] args) {
		
		
		//convert stuff to a list
		
		String[] food = {"cheese", "bacon", "ham", "banana", "bread"};
		
		List<String> listFood = Arrays.asList(food);
		
		
		ArrayList<String> list2 = new ArrayList<String>();
		
		list2.add("youtube");
		list2.add("google");
		list2.add("facebook");
		
		for(String things : list2) {
			System.out.print(things + " ");
		}
		
		//adding stuff from food to list2
		
		Collections.addAll(list2, food);
		
		System.out.println();
		
		// printing once again list2
		
		for(String moreThings : list2) {
			System.out.print(moreThings + " ");
		}
		System.out.println();
	
		
		//checking frequency of single word
		//return 1 becouse only 1 time facebook appears
		System.out.println(Collections.frequency(list2, "facebook"));
		
		// checking if lists have something common (they have youtube,google, facebook) thats why it return FALSE
		boolean have = Collections.disjoint(listFood, list2);
		
		System.out.println(have);
		
		if(have) {
			System.out.println("Lists do not have anything in common");  	// true statement
		}else {
			System.out.println("Lists have something in common");			// false statement
		}
	}
}
