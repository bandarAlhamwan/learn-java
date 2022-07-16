 package bandar;

public class Person {

	private String name ;
	private int age;
	private boolean isUnderAge;
	private Gender gender;
	
	
	
	public Person(String name, int age, boolean isUnderAge, Gender gender) {
		super();
		this.name = name;
		this.age = age;
		this.isUnderAge = isUnderAge;
		this.gender = gender;
	}


	public Person(String name, int age, boolean isUnderAge) {
		super();
		this.name = name;
		this.age = age;
		this.isUnderAge = isUnderAge;
	}


	public Person(int age) {
		this.name= "bandar";
		this.isUnderAge = true;
		this.age = age;
	}
	
	
	public Person() {
		super();
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isUnderAge() {
		return isUnderAge;
	}
	public void setUnderAge(boolean isUnderAge) {
		this.isUnderAge = isUnderAge;
	}

	public Gender getGender() {
		return gender;
	}


	public void setGender(Gender gender) {
		this.gender = gender;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", isUnderAge=" + isUnderAge + ", gender=" + gender + "]";
	}



	
	
	
	
}
