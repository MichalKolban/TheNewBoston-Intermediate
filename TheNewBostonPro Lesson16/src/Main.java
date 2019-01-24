import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
		
		String[] things = {"waffle","bacon", "cheese", "bacon", "egg"};
		List<String> list = Arrays.asList(things);
		
		System.out.println("Print list");
		System.out.printf("%s " , list);
		System.out.println();
		
		Set<String> set = new HashSet<String>(list);  // set removing any duplicate in list
		System.out.println("Print set");
		System.out.printf("%s ", set);
		
	}

}
