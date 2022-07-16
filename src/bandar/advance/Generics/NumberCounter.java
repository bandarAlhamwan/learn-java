package bandar.advance.Generics;

// to make class only take number
public class NumberCounter <T extends Number> {
	
	T t;

	NumberCounter(T t) {
		this.t = t;
	}
	
	public void print() {
		System.out.println(t);
	}
	
	

}
