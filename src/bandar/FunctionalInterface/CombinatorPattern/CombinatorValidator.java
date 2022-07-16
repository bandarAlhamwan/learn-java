package bandar.FunctionalInterface.CombinatorPattern;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

import bandar.FunctionalInterface.CombinatorPattern.CombinatorValidator.ValidationResult;

public interface CombinatorValidator extends Function<Customer, ValidationResult> {

	static CombinatorValidator isEmailValid() {
		return customer -> customer.getEmail().contains("@") ? ValidationResult.SUCCESS : ValidationResult.EMAIL_NOT_VALID;
	}
	
	static CombinatorValidator isPhoneNumberValid() {
		return customer -> customer.getPhoneNumber().startsWith("05") ? ValidationResult.SUCCESS : ValidationResult.PHONE_NUMBER_NOT_VALID;
	}
	
	static CombinatorValidator isAdult() {
		return customer -> Period.between(customer.getDob(),LocalDate.now()).getYears() > 18 ? ValidationResult.SUCCESS : ValidationResult.IS_NOT_AN_ADULT;
	}
	
	enum ValidationResult{
		SUCCESS,
		PHONE_NUMBER_NOT_VALID,
		EMAIL_NOT_VALID,
		IS_NOT_AN_ADULT
	}
}
