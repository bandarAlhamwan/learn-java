package bandar.FunctionalInterface.java8;

import java.util.Arrays;
import java.util.List;

public class PrintNameHavingLessThan6Chart {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("bandar","saud","reema","deema","alhamwan","moshary");
		
		// can use .sorted() in below stream
		list.stream().filter(st -> (st.length() < 6)).forEach(s -> System.out.print(s + " ,"));

	}

}
