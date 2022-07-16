package bandar.ORP;

public class excuteInhertance {

	public static void main(String[] args) {
		
		Dog dog = new Dog("tarah", "slogy");
		Animal cat = new Cat("soso");
		
		dog.makeSound();	
		System.out.println(dog.getName() + " is a " + dog.getBreed());
		
		System.out.println(cat.getName());
		cat.makeSound();
		
	}

}
