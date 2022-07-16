package bandar.FunctionalInterface;

import java.util.function.Function;

public class _Function {

	public static void main(String[] args) {
		
		int increment = incrementByOne(1);
		System.out.println(increment);
		
		int increment2 = incrementByOneFunction.apply(3);
		System.out.println(increment2);
		
		
		// To work with 2 Function
		Function<Integer, Integer> doTwoFunction = incrementByOneFunction.andThen(multiyplyBy10);
		System.out.println(doTwoFunction.apply(6)); 
	}

	private static int incrementByOne(int number) {
		return number + 1;
	}

	// To change the above function to functional interface
	// but static word to allow read it for main method
	static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;
	
	static Function<Integer, Integer> multiyplyBy10 = number -> number * 10;
	
}
