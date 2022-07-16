package bandar.splitString;

import java.util.Arrays;

public class SplitString {

	public static void main(String[] args) {
		
		String names = "bandasr,saud,hamed,alhamwan,mousad,turky,amjad";
		String [] listNames = names.split(",");
		System.out.println("String wiouth split: " + names);
		System.out.println("add String to Array: " + Arrays.toString(listNames));
	}
}
