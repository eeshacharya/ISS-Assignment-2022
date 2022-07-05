//Strings and Arrays
import java.util.Scanner;
import java.util.Arrays;
public class Employee {
	
	public static void main(String [] args) {
		Scanner s  =  new Scanner (System.in);
		System.out.println("Enter number of employees");
		int n = s.nextInt();
		String[] employee = new String[n];
		for(int i = 0; i < n; i++) {
			System.out.print("Enter name of employee number "+ (i+1)+" :");
			employee[i] = s.next();
		}
		
		System.out.println(Arrays.toString(employee));
	}

}

