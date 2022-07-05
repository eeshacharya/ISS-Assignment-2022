//Loops and Decision Making
import java.util.Scanner;

public class DecisionMaking {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		 int brand;
	     String name = null;
	     boolean a = true;
	     while(a) {
	    	 
	     System.out.println("Enter a number between 1 and 4: ");
	     brand = s.nextInt();
	         
	        // Switch statement
	         
	        switch(brand){
	        case 1: 
	            name = "Nike";
	            break;
	         
	        case 2:
	            name = "Puma";
	            break;
	             
	        case 3:
	            name = "Prada";
	            break;
	             
	        case 4:
	            name = "Louis Vuitton";
	            break;
	             
	        default:
	            name = "Invalid name";
	            break;
	         
	        }
	        
	        System.out.println("The brand name is: " + name);
	        if(brand <= 4) {
	        	a = false;
	        	
	        	
	        }
	       

	     }
	         
	       
	}

}
