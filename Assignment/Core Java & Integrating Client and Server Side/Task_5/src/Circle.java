//Inheritance
import java.util.Scanner;

class Data {
	double r,a;
	Scanner s = new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the radius: ");
		r = s.nextDouble();
	}
	
	void display()
	{
		System.out.println("Area is: "+a);
	}
	
}

public class Circle extends Data
{
	void calculate()
	{
		a = 3.142*r*r;
	}
	
	public static void main(String[] args) 
	{
		Circle c = new Circle();
		c.input();
		c.calculate();
		c.display();
		
	}

}


