package jsonproject.jsonpoject;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class ReadDataFromJSONFile {

	public static void main(String[] args) throws IOException, ParseException {
		JSONParser jsonparser = new JSONParser();
		
		FileReader reader = new FileReader(".\\jsonfiles\\employee.json");
		
		Object obj = jsonparser.parse(reader);
		
		JSONObject empjsonobj = (JSONObject)obj;
		
		String fname =(String) empjsonobj.get("firstName");
		String lname =(String) empjsonobj.get("lastName");
		
		System.out.println("First Name: "+ fname);
		System.out.println("Last Name: "+ lname);
		
		JSONArray array = (JSONArray)empjsonobj.get("address");
		
		for(int i=0; i<array.size(); i++)
		{
			JSONObject address = (JSONObject)array.get(i);			
			
			String street = (String)address.get("street");
			String city = (String)address.get("city");
			String state = (String)address.get("state");
			
			System.out.println("Address of : "+ i +" is.......");
			System.out.println("Street: "+street);
			System.out.println("city: "+city);
			System.out.println("state: "+state);

		}
		
		
		/*JSONObject obj = new JSONObject();

	      obj.put("name","foo");
	      obj.put("num",new Integer(100));
	      obj.put("balance",new Double(1000.21));
	      obj.put("is_vip",new Boolean(true));

	      StringWriter out = new StringWriter();
	      obj.writeJSONString(out);
	      
	      String jsonText = out.toString();
	      System.out.print(jsonText);*/
	}

}
