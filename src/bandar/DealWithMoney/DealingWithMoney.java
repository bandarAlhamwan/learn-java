package bandar.DealWithMoney;

import java.math.BigDecimal;

public class DealingWithMoney {

	public static void main(String[] args) {
		
		double numberOne = 0.2;
		double numberTwo = 0.3;
		double result = numberTwo - numberOne;
		
		// When work with money should use BigDecemal , also should encapslate with "1.3"
		
		BigDecimal number1 = new BigDecimal("0.2");
		BigDecimal number2 = new BigDecimal("0.3");
		
		BigDecimal resultBigDecimal = number2.subtract(number1);
		
		System.out.println("This is in double "+result);
		System.out.println("This is in BigDecimal "+resultBigDecimal);
	}
}
