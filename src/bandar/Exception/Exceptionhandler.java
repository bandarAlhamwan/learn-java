package bandar.Exception;

public class Exceptionhandler {

	public static void main(String[] args) {
		
		String brand = null ;
		
		try {
			System.out.println(brand.toUpperCase());

		} catch (Exception e) {
			System.out.println("bandar");
			System.out.println("the Exceptio is  " + e);
		}

	}

}
