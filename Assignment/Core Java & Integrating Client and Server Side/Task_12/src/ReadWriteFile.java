import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadWriteFile 
{

	public static void main(String[] args)
	{
		try
		{
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\eesha\\Eesha\\ISS\\Assignment\\Java\\FileReadWrite\\Test\\output.txt"));
		bw.write("Eesha\n");
		bw.write("Charaya\n");
		bw.close();
		}
		
		catch(Exception ex) 
		{
			return;
		}
		
		try
		{
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\eesha\\Eesha\\ISS\\Assignment\\Java\\FileReadWrite\\Test\\output.txt"));
			String s;
			
			while((s = br.readLine()) != null)
			{
				System.out.println(s);
			}
			br.close();
	
		}
		catch(Exception e)
		{
			return;
		}
		
	}

}