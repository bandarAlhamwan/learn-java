package bandar.FunctionalInterface.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class HighestAndLowestNumber {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(100,200,300,400,500);
		
		Integer highest = numbers.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("The highest Number of list: " + highest);
		
		Integer lowest = numbers.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("The lowest Number of list: " +lowest);
		
		
		Integer highestNumber = Stream.of(100,200,300,400,500)
				.max(Comparator.comparing(n -> Integer.valueOf(n))).get();
		System.out.println("The highest Number of list: " + highestNumber);
		
		Integer max = Collections.max(numbers);
		Integer min = Collections.min(numbers);
		
		System.out.println("the max number: " + max + ", the min number: " + min);
	}

}
