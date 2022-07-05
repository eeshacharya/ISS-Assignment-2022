
public class ExceptionHandelling 
{

	public static void main(String[] args) 
	{
		try
		{
			int a = 10/0;
			//Code that may raise exceptions
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
		//Code after the exception
		
	}

}
