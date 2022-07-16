package bandar.NullAndOptinals;

import java.util.Optional;

public class Optionall {

	public static void main(String[] args) {
		
		// Using orElse
		String brand = null ;
		System.out.println(Optional.ofNullable(brand).orElse("Brand is null"));
		
		// Using orElseGet
		Object value = Optional.ofNullable(null ).orElseGet(()-> "Defult value");
		System.out.println(value);
		
		// Using orElseThrow
		Object orElseThrow = Optional.ofNullable("bandar").orElseThrow(()-> new IllegalStateException("bandar Exception") );
		System.out.println(orElseThrow);
		
		// Using ifPresent
		Optional.ofNullable("Hello bandar Al-hamwan").ifPresent(System.out::println);
		
		// Using ifPresentOrElse
		Optional.ofNullable(null).ifPresentOrElse(email -> System.out.println("Sending Email to: " + email),
				()->{
					System.out.println("connot send Email");
				});
	}
}
