package bandar.FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Imperative {
	
	static class Person {
		private final String name;
		private final Gender gender;
		
		public Person(String name, Gender gender) {
			this.name = name;
			this.gender = gender;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", gender=" + gender + "]";
		}
	}
	
	enum Gender{
		Male,Female
	}

	public static void main(String[] args) {
		
	List<Person> people = List.of(
			new Person("Bandar", Gender.Male),
			new Person("Deema", Gender.Female),
			new Person("Reema", Gender.Female),
			new Person("Saud", Gender.Male),
			new Person("Fofo", Gender.Female)
			);	
	
	// imperative approach
	List<Person> female = new ArrayList<>();
	
	for(Person person : people) {
		if(Gender.Female.equals(person.gender)) {
			female.add(person);
		}
	}
	
	System.out.println(female);
	//female.forEach(System.out::println);
	
	// imperative approach
	System.out.println("// imperative approach");
	people.stream()
			.filter(person -> Gender.Female.equals(person.gender))
			.collect(Collectors.toList())
			.forEach(System.out::println);
	}
}
