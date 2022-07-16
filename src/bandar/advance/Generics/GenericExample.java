package bandar.advance.Generics;

import java.util.ArrayList;

public class GenericExample {

	public static void main(String[] args) {
		
		IntegerCounter intCounter = new IntegerCounter(100);
		intCounter.print();
		
		DoubleCounter DCounter = new DoubleCounter(22.3);
		DCounter.print();
		
		// inside < > should use wrapper class or class , can't use primitive type 
		Counter<Integer> iCounter = new Counter<Integer>(30);
		iCounter.print();
		
		Counter<String> sCounter = new Counter<String>("bandar");
		sCounter.print();
		
		NumberCounter<Long> lCounter = new NumberCounter<Long>(55L);
		lCounter.print();
		
		ArrayList<Object> intList = new ArrayList<>();
		intList.add(1);
		intList.add("1");
		
		Integer i = Integer.parseInt((String) intList.get(1));
		System.out.println(i);
	}
}
