import java.util.Scanner;

//Throw
public class ThrowExample {

	public void checkAge(int age)
	{
		if (age < 18)
			throw new ArithmeticException("Not Eligible for voting");
		else
			System.out.println("Eligible for voting");
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		ThrowExample obj = new ThrowExample();
		obj.checkAge(13);
		System.out.println("End Of Program");
	}

}