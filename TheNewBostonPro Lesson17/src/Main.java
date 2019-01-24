
public class Main {

	public static void main(String[] args) {
		
		
		Integer[] intarray = {1,5,6,4};
		
		Character[] chararray = {'a', 'b', 'd', 'y'};
		
		printMe(intarray);
		printMe(chararray);
		
		
	}
	
	
//	public static void printMe(Integer[] i) {
//		for(Integer x : i) {
//			System.out.printf("%s ", x);
//			System.out.println();
//		}
//	}
//	
//	public static void printMe(Character[] ch) {
//		for(Character x : ch) {
//			System.out.printf("%s ", x);
//			System.out.println();
//		}
	
	//generic method
	public static <T> void printMe(T[] x) {
		for(T z : x) {
			System.out.printf("%s ", z);
		}
		System.out.println();
	
	}
}
