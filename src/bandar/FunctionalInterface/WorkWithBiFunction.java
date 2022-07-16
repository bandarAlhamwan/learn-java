package bandar.FunctionalInterface;

import java.util.function.BiFunction;

public class WorkWithBiFunction {

	public static void main(String[] args) {
		// BiFunction same as a _function but instead of taking one input , it take two input.
		// BiFunction: it take 2 varaible (input)

		int result = increamentByOneAndMultiply(1,10);
		System.out.println("Result Of Normal Function: " + result);
		
		int result2 = increamentByOneAndMultiplyBiFunction.apply(1, 10);
		System.out.println("Result of BiFunction: " + result2);
	}
	
	static int increamentByOneAndMultiply(int number, int toMultiply) {
		return (number + 1) * toMultiply;
	}
	
	// To Define same as above function in BiFunction
	static BiFunction<Integer, Integer, Integer> increamentByOneAndMultiplyBiFunction =
			(numberIncrease , numberMultiply) -> (numberIncrease +1) * numberMultiply;

}
