package bandar.DataStructure;

import java.util.ArrayList;
import java.util.List;

public class Genericess {

	public static void main(String[] args) {
		List<String> name = new ArrayList<>();
		
		name.add("Reema");
		name.add("saud");
		
		name.forEach(System.out::println);
	}
}
