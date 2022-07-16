package bandar.enums;

import bandar.Gender;
import bandar.Person;

public class Enum {

	public static void main(String[] args) {
		Person person = new Person("bandar", 33, true, Gender.male);
		
		System.out.println(person);
	}
}
