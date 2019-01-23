import java.util.Arrays;
import java.util.LinkedList;

public class Main {
	
	public static void main(String[] args) {
	
		String[] stuff = {"egg", "dogs", "apples", "pencil"};
		
		
		// convert array to list 
		LinkedList<String> thelist = new LinkedList<String>(Arrays.asList(stuff));
		
		thelist.add("rainbow");
		thelist.addFirst("firstThing");
		
		
		//convert back to array
		
		stuff = thelist.toArray(new String[thelist.size()]);
		
		for(String x : stuff)
			System.out.print(x + " ");
		
		
	}

}
