package map;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> m=new HashMap<Integer,String>();
		m.put(1, "John");
		m.put(2, "Anil");
		m.put(3, "Kumar");
		m.put(4, "Anil");
		m.put(5, "Vijay");
		System.out.println(m);
		Set<Entry<Integer,String>> s=m.entrySet();
		for(Entry<Integer,String> x:s)
		{
			System.out.println(x);
		}
		System.out.println(m.get(1));
		System.out.println(m.keySet());
		System.out.println(m.values());

	}

}
