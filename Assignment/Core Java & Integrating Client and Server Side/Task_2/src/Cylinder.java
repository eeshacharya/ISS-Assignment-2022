//Basic Datatypes, variable types, Modifier types, Final keyword, Constructors
import java.util.Scanner;

public class Cylinder {
	
	public double r;
	public double a;
	public double h;
	public double v;
	public final double pi = 3.142;
	
	Scanner sc = new Scanner(System.in);
	
	
	Cylinder(){
		inputData();
		areaCircle();
		volumeCylinder();
	}
	
	public void inputData(){
		System.out.println("Enter radius: ");
		r = sc.nextDouble();
		
		System.out.println("Enter height of cylinder: ");
		h = sc.nextDouble();
	}
	
	public void areaCircle(){
		a = pi*r*r;
		System.out.println("Area of circle: "+ a);
	}
	
	public void volumeCylinder(){
		v = a*h;
		System.out.println("Volume of cylinder: "+ v);
	}
	
	public static void main(String[] args) {
		Cylinder c1 = new Cylinder();
	}

}
