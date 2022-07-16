package bandar.toString;

import bandar.Person;

public class ToString {

	// we add toString to person class to be able to print person object
	
	public static void main(String[] args) {
		Person person = new Person("bandar", 33, false);
		
		System.out.println(person);

	}

}
