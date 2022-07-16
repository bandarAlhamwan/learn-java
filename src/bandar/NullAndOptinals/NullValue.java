package bandar.NullAndOptinals;


public class NullValue {

	public static void main(String[] args) {
		
		String brand = null ;
		//System.out.println(brand.toUpperCase());
		
		// too avoid two way to avoid Exception
		// 1. Try and Catch 
		// 2. use optional 
		// 3. use if statement
		
		try {
			System.out.println(brand.toUpperCase());
		} catch (Throwable e) {
			System.out.println("brand is null " + e);
		}
	}
}
