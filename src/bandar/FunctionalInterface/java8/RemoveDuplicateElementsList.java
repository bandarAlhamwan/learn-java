package bandar.FunctionalInterface.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class RemoveDuplicateElementsList {

	public static void main(String[] args) {
		Integer[] arrayOfNumber = new Integer[] {1, 9, 8, 7, 7, 8, 9};
		
		// convert array to list
		List<Integer> numbers = Arrays.asList(arrayOfNumber);
		
		
		numbers.stream().forEach(n -> System.out.print(n + " , "));
		System.out.println();
		
		
		// add distinct() to remove the duplicate value
		numbers.stream().distinct().forEach(n -> System.out.print(n + " , "));
		System.out.println();
		
		// add sorted() to remove the duplicate valu
		numbers.stream().distinct().sorted().forEach(n -> System.out.print(n + " , "));
		System.out.println();
		
		numbers.stream().distinct().sorted(Comparator.reverseOrder()).forEach(n -> System.out.print(n + " , "));
	}
}
