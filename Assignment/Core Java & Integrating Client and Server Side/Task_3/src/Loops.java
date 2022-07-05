import java.util.Scanner;

public class Loops {
	
	

public static void main(String[] args) {
	
	int n;
	int f = 1;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number to calculate its factorial: ");
	n = sc.nextInt();
	
	while(n>=1)
	{
		f = f * n;
		n = n - 1;
		
	}
	System.out.println("Factorial: "+ f);
	}

}
