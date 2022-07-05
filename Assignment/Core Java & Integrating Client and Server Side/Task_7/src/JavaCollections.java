import java.util.*;
public class JavaCollections 
{

	public static void main(String[] args) 
	{
		//Creating Lists
	
		List<String> l = new ArrayList<String>();
		
		//Adding elements to list
		
		l.add("This");
		l.add("is");
		l.add("a");
		l.add("list");
		
		//Iterating the list
		
		for (int i = 0; i <l.size(); i++) 
		{
            System.out.print(l.get(i) + " ");
		}
		
		System.out.println();
		
		//Creating Sets
		
		Set<String> s = new HashSet<String>();
		
		//Adding Elements

		s.add("This");
		s.add("is");
		s.add("is");
		s.add("a");
		s.add("set");
		
		// Sets are printed in an unordered way and remove duplicate elements
        System.out.println(s);
        
        //Creating object for Map
        
        Map<Integer, String> m = new HashMap<Integer, String>();
        
        //adding elements to Map
        
        m.put(1,"this");
        m.put(2,"is");
        m.put(3,"a");
   
		// Maps are printed in an unordered way and remove duplicate elements
        
        for (Map.Entry i : m.entrySet()) 
        {
        	System.out.println(i.getKey() + " "+ i.getValue());

        }
                               
        
		
	}
}
