package bandar.FunctionalInterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {

	public static void main(String[] args) {
		// Supplier return a result
		
		System.out.println(getDBConnectionURL());
		System.out.println(getDBConnectionURLSupplier.get());
		System.out.println(getDBConnectionURLSupplierList.get());
	}
	
	static String getDBConnectionURL() {
		return "jdbc://localhost:8080/index";
	}
	
	static Supplier<String> getDBConnectionURLSupplier = () -> 
		"jdbc://localhost:8080/index";
		
	static Supplier<List<String>> getDBConnectionURLSupplierList = () -> 
		List.of(
				"jdbc://localhost:8080/index",
				"jdbc://localhost:8080/user",
				"jdbc://localhost:8080/Home");
}
