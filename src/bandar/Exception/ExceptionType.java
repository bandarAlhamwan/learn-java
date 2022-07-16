package bandar.Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionType {
	
	// There is to type of Exception: 
	//1- Checked Exception : need to be handled at compiled time
	//2- Unchecked Exception : the compiler will not tell you exception before compile
	
	
	public static void main(String[] args)    {
		
		// Checked Exception
			try {
				FileInputStream fileInputStream = new FileInputStream("src/TextFile.txt");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		// Unchecked Exception
		try {
			var result = 10/2;
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("the Exception is: " + e);
		} 
		
		performDivision(1,1);
		
	}
	
	
			// Custom Exception
	     static double performDivision(double a, double b) throws CustomExcepion {
				if (b == 0) {
					throw new CustomExcepion("cannot divide By 0");
				}
				return a/b;
			}
	 

}
