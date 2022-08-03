package bandar.FunctionalInterface.java8;

import java.util.Arrays;
import java.util.List;

public class NameStartWithSpecialCharacter {
	
	public static void main(String[] args) {
		
		List<String> nameList = Arrays.asList("bandar","saud","deema","reema");
		
		nameList.stream().map(str -> str.toUpperCase()).filter(st -> (st.startsWith("B") || st.startsWith("D"))).forEach(s -> System.out.print(s + ", "));
		
	}

}
