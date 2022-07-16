package bandar.DataStructure;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		
		// Define Array
		int[] number = new int[3];
		number[0] =55;
		number[1] =66;
		number[2] =77;

		String[] number2 = {"bandar","turky","mohammad"};
		
		System.out.println(Arrays.toString(number));
		
		System.out.println("thie length of Arrays : " + number.length);
		
		for (int numberr : number) {
			System.out.println(numberr);
		}
		
		for(int i = 0; i < number.length; i++ ) {
			System.out.println("value in array  index (" + i + ") = " + number[i]);
		}
	}
}
