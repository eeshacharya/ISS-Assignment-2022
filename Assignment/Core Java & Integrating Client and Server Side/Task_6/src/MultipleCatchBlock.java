
public class MultipleCatchBlock 
{

	public static void main(String[] args) 
	{
		try
		{
			int a[] = new int[5];
			a[4] = 2/0;
			a[5] = 10;
			
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println(a);
		}
		
		catch(Exception f)
		{
			System.out.println("Parent Exception Occours");
		}
	}

}
