package bandar.FunctionalInterface.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LongestStringForm {

	public static void main(String[] args) {
		List<String> nameList = Arrays.asList("bandar","saud","deema","reema","alhamwan");
		
		Optional<String> reduce = nameList.stream().reduce((s1,s2) -> s1.length() > s2.length() ? s1 :s2);
		reduce.ifPresent(s -> System.out.println(s));
	}
}
