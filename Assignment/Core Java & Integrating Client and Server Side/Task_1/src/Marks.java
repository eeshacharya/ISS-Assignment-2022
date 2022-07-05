//Basics of Java: Concept of Class, Object, State (instance variable) and Methods (behavior)

// Class
public class Marks {
	//State or instance variable - inside the class but outside methods
	int avg;
	
	//Method
	public void getMarks(int p,int c,int b) {
		System.out.println("Physics Marks :" + p);
		System.out.println("Chemistry Marks :" + c);
		System.out.println("Biology Marks :" + b);
		avg = (p+b+c)/3;
	}
	
	//Method
	public void averageMarks() {
		System.out.println("Your average is :" + avg);
	}
		

	public static void main(String[] args) {
	//creating a new object - ClassName ObjectName = new ClassName();
		Marks average = new Marks();
		average.getMarks(10,20,30);
		average.averageMarks();
		System.out.println(average.avg);
		
	

	}

}
