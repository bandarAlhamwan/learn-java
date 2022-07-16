package bandar.FunctionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _ConsumerAndBiConsumer {

	public static void main(String[] args) {
		
		// Using Normal Java Function 
		greetCustomer(new Customer("bandar", "055555"));
		
		// Using Consumer Function Interface
		greetCustomerConsumer.accept(new Customer("Saud", "11111"));
		
		// Using BIConsumer Function Interface
		greetCustomerBiConsumer.accept(new Customer("Saud", "11111") , false);
	}
	
	static void greetCustomer(Customer customer ) {
		System.out.println("Hello (" + customer.customerName + ") Thanks for registring phone number: " + customer.customerPhoneNumber);
	}
	
	// To Define same as above function in Consumer
	static Consumer<Customer> greetCustomerConsumer = customer -> 
	System.out.println("Hello (" + customer.customerName + ") Thanks for registring phone number: " + customer.customerPhoneNumber);
	
	// To Define same as above function in BiConsumer
	static BiConsumer<Customer, Boolean> greetCustomerBiConsumer = (customer , showPhoneNumber) -> 
	System.out.println("Hello (" + customer.customerName + ") Thanks for registring phone number: " + 
			(showPhoneNumber ? customer.customerPhoneNumber : "*******"));

	static class Customer{
		private final String customerName;
		private final String customerPhoneNumber;
		
		public Customer(String customerName, String customerPhoneNumber) {
			this.customerName = customerName;
			this.customerPhoneNumber = customerPhoneNumber;
		}
	}
}
