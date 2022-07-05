//Interfaces
interface Employer {

	public void attendance();

	public void show();
}

class Employee1 implements Employer 
{
	public void show() {
		System.out.println("Employee 1");
	}

	public void attendance() {
		System.out.println("Employee 1 Present");
	}
}

class Employee2 implements Employer {
	public void show() {
		System.out.println("Employee 2");
	}

	public void attendance() {
		System.out.println("Employee 2 Present");
	}
}

public class InterfaceExample {

	public static void main(String[] args) {
		Employee1 e1 = new Employee1();
		Employee2 e2 = new Employee2();
		e1.show();
		e1.attendance();
		e2.show();
		e2.attendance();
	}

}