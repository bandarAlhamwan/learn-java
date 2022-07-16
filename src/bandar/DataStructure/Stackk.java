package bandar.DataStructure;

import java.util.Stack;

public class Stackk {

	public static void main(String[] args) {
		Stack<Integer> number = new Stack<>();
		
		number.push(1);
		number.push(2);
		number.push(3);
		number.push(4);
		
		System.out.println(number.peek());
		System.out.println(number.pop());
		System.out.println(number.pop());
		System.out.println(number);
	}
}
