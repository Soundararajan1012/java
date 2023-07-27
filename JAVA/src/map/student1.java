package map;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class student1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> s=new LinkedHashMap<String,String>();
		s.put("stdid", "101");
		s.put("stdname", "raja");
		s.put("stdphone", "8989765432");
		s.put("address", "1/9a gandhi street,kovai");
		s.put("dob", "10.04.1995");
		s.put("email","raja@gmail.com");
		s.put("gender", "male");
		System.out.println(s);
		Set<Entry<String,String>> e=s.entrySet();
		for(Entry<String,String> x:e)
		{
			System.out.println(x);
		}
		System.out.println(s.get("stdname"));
		System.out.println(s.keySet());
		System.out.println(s.values());
		

	}

}
