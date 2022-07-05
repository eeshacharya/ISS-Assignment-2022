//abstraction
abstract class Teacher {
	public abstract void attendance();

	public void show() {
		System.out.println("Give Attendance");
	}
}

class Student1 extends Teacher {
	public void attendance() {
		System.out.println("Student 1 Present");
	}
}

class Student2 extends Teacher {
	public void attendance() {
		System.out.println("Student 2 Present");
	}
}

public class AbstarctionExample {

	public static void main(String[] args) {
		Student1 s1 = new Student1();
		Student2 s2 = new Student2();
		s1.show();
		s1.attendance();
		s2.attendance();
	}

}