
public class Main {
	
	public static void main(String[] args) {
		
		String[] words = {"funk", "chunk", "furry", "baconator"};
		
		for(String roll : words) {
			if(roll.startsWith("fu")) {
				System.out.println(roll + " starts with 'fu'");
			}
		}
		
		for(String roll : words) {
			if(roll.endsWith("unk")) {
				System.out.println(roll + " ends with 'unk'");
			}
		}
		
	}

}
