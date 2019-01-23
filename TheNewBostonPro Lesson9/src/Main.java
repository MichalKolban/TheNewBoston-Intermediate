import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		String [] things = {"bacon", "dog", "rainbow", "cash", "longboard"};
		
		List<String> list1 = Arrays.asList(things);
		
		Collections.sort(list1);
		
		System.out.println(list1 + " ");
		
		Collections.sort(list1, Collections.reverseOrder());
		
		System.out.println(list1 + " ");
		
		
	}

}
