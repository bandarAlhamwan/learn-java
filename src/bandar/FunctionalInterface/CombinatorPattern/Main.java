package bandar.FunctionalInterface.CombinatorPattern;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer("Saud", "Saud@gmail.com", "05555555", LocalDate.of(1989, 4, 8));
		Customer customer1 = new Customer("Reema", "Reema@gmail.com", "06555555", LocalDate.of(1989, 4, 8));
				
		System.out.println(new CustomerValidatorService().isValid(customer));
		System.out.println(new CustomerValidatorService().isValid(customer1));
	}

}
