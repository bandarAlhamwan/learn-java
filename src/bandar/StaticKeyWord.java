package bandar;

class Emp{
	int id;
	int salary;
	// use static here to make it take last assign value
    static String manege;
    
    // use static to allowed another classes use it directly, and
    static int age = 30;
    
	public void show() {
		System.out.println("id=" + id + ", Salary=" +salary + ", manege=" + manege);
	}

	public Emp(int id, int salary) {
		this.id = id;
		this.salary = salary;
	}
	
	
}

public class StaticKeyWord {
	public static void main(String[] args) {
		
		System.out.println(Emp.age);
		
		Emp emp1 = new Emp(1,500);
		Emp.manege="Saud";	// don't need object
		Emp emp2 = new Emp(2,6000);
		Emp.manege="Hamed";

		emp1.show();
		emp2.show();
		
	}
}
