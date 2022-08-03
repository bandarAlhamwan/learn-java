package bandar.FunctionalInterface.java8;

import java.util.ArrayList;

public class SumEvenOfNumber {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		
		int sum = list.stream().filter(n -> n%2 == 0).mapToInt(n -> n).sum();
		System.out.println("The sum is: " + sum);
	}

}
