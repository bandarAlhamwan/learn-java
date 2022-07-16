package bandar.FunctionalInterface;

import java.util.List;
import java.util.stream.Collectors;

/*
 	Stream takes to abstract mode, Stream combine all the Functional programming
 */

public class _Stream {

	public static void main(String[] args) {
		
		List<Person> people = List.of(
				new Person("Bandar", Gender.Male),
				new Person("Deema", Gender.Female),
				new Person("Reema", Gender.Female),
				new Person("Saud", Gender.Male),
				new Person("Fofo", Gender.Female),
				new Person("lolo", Gender.Prefer_not_to_say)
				);	
		
		people.stream()
				.map(person -> person.gender)
				.collect(Collectors.toSet())		// To collect Gender 
				.forEach(System.out::println);
		
		people.stream()
		.map(person -> person.name)
		.mapToInt(String::length)				// To print length of name
		//.mapToInt(name -> name.length()) 		// To print length of name
		.forEach(System.out::println);
		
		
	}
	
	// Class
	static class Person {
		private final String name;
		private final Gender gender;
		
		public Person(String name, Gender gender) {
			super();
			this.name = name;
			this.gender = gender;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", gender=" + gender + "]";
		}
		
		
	}
	
	//Enum
	enum Gender{
		Male,Female,Prefer_not_to_say
	}
}
