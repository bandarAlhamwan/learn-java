package bandar.DataStructure;

import java.util.ArrayList;
import java.util.List;

public class Listt {

	public static void main(String[] args) {
		// to define List
		List number = new ArrayList<>();
		number.add(1);
		number.add(20);
		number.add("bandar");
		
		number.remove(1);
		
		// return boolean
		if(number.contains(2)) System.out.println("yes");
		else System.out.println("no");
		
		System.out.println(number);
		
		for(Object numberr : number) {
			System.out.println(numberr);
		}
		
		number.forEach(System.out::println);
	}
}
