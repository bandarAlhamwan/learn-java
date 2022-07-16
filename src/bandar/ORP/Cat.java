package bandar.ORP;

public class Cat extends Animal {

	public Cat(String name) {
		super(name);
	}

	@Override
	public void makeSound() {
		
		System.out.println("miw miw miw");
	}

}
