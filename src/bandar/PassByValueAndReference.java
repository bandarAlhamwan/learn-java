package bandar;

import java.awt.Point;

public class PassByValueAndReference {

	public static void main(String[] args) {

		int x = 1;
		System.out.println(x);
		increament(x);
		System.out.println(x);
	
		Point point = new Point(50,60);
		System.out.println(point);
		change(point);
		System.out.println(point);
	}
	
	static void change(Point point) {
		point.x=10;
		point.y=10;
	}
	
	static void increament(int value) {
		 value++;
		 System.out.println(value);
	}
}


