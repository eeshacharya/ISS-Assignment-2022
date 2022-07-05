//Overriding Polymorphism
import java.util.*;

class InputData
{
float r,a,v;
Scanner s = new Scanner(System.in);
	
	void input()
	{
	System.out.println("Enter radius: ");
	r = s.nextFloat();
	}
}

class Area extends InputData
{
	void calculate()
	{
	a = 3.14f*r*r;
	}

	void display()
	{
	System.out.println("Area: "+a);
	}
}

class Volume extends Area
{
	void compute()
	{
	v = 4.0f/3*a*r;
	}

	void display()
	{
	System.out.println("Volume: "+v);
	}
}


public class MethodOverriding 
	{
		public static void main(String[] args)
		{
		Area a = new Area();
		a.input();
		a.calculate();
		a.display();

		Volume v = new Volume();
		v.input();
		v.calculate();
		v.compute();
		v.display();
		}

	}









