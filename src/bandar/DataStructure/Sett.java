package bandar.DataStructure;

import java.util.HashSet;
import java.util.Set;
/*
 *  Set remove the duplicate 
 */
public class Sett {

	public static void main(String[] args) {
		Set<String> country = new HashSet<>();
		
		country.add("KSA");
		country.add("USA");
		country.add("AAA");
		
		country.forEach(System.out::println);
	}
}
