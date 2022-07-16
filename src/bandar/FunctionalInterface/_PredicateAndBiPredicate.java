package bandar.FunctionalInterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _PredicateAndBiPredicate {

	public static void main(String[] args) {
		
		// Predicate takes 1 argument and return boolean
		// BiPredicate takes 2 argument and return boolean
		
		String phoneNumber1 = "0507275934";
		int number = 50727592;
		
		System.out.println("Without Predicate");
		System.out.println(isPhoneNumberValid(phoneNumber1));
		
		System.out.println();
		System.out.println("With Predicate");
		System.out.println(isPhoneNumberValidPredicate.test(phoneNumber1));
		
		System.out.println(containNumber3.test(phoneNumber1));
		
		// Can use (Or - And) and Predicate (combine 2 Predicate)
		System.out.println(
				"Is phone number valid and contain number 3: " + isPhoneNumberValidPredicate.and(containNumber3).test(phoneNumber1)
				);
		
		System.out.println(
				"Is phone number valid or  contain number 3: " + isPhoneNumberValidPredicate.or(containNumber3).test(phoneNumber1)
				);
		
		// Use BiPredicate
		System.out.println("Is String same Integer: " + IsStringSameInteger.test(phoneNumber1, number));
	}
	
	static boolean isPhoneNumberValid(String phoneNumber) {
		return phoneNumber.startsWith("05") && phoneNumber.length() == 10;
	}
	
	// To Define same as above function in Predicate
	static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
		phoneNumber.startsWith("05") && phoneNumber.length() == 10;
	
	static Predicate<String> containNumber3 = phoneNumber ->
		phoneNumber.contains("3");
		
	static BiPredicate<String, Integer> IsStringSameInteger = (phoneNumber , Number)  -> 
		Integer.parseInt(phoneNumber) == Number ;
}
