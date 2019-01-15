
public class Main {
	
	public static void main(String[] args) {
		
		System.out.println(fact(5));			//120
		
		System.out.println(fact(8));  			//40320
	}

	
	public static long fact(long number) {
		if(number <= 1) {
			return 1;
		}else {
			return number * fact(number - 1);
		}
	}
}
