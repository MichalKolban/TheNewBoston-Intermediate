
public class Main {
	
	public static void main(String[] args) {
		
		String name = "MichaelScottMichaelScott";
		
		System.out.println(name.indexOf('a'));  			// return 4 
		
		System.out.println(name.indexOf('a', 5));			// start searching at 5 element
		
		System.out.println(name.indexOf('x'));				// return -1 x is not in the String
		
		System.out.println(name.indexOf("Sco"));			// return first place S = 7
		
		System.out.println(name.indexOf("Sco", 9));			// return 19
		
		String a = "bacon ";
		String b = "monster";
		
		System.out.println(a + b);							//
		
		System.out.println(a.concat(b));					// can throw NullPointer, should be faster than +
		
		System.out.println(a.replace('b', 'f'));			// facon 
		
		System.out.println(b.toLowerCase());				// monster
		
		System.out.println(b.toUpperCase());				// MONSTER
		
		System.out.println(a.trim()); 						// first "bacon " -> "bacon" erase white spaces
		
		
		
		
		
	}

}
