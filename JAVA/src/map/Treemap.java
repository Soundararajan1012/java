package map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Long> m=new TreeMap<String,Long>();
		m.put("sil123@gmail.com", 9003691234l);
		m.put("velu@gmail.com", 9876543210l);
		m.put("kumar@gmail.com", 8989898989l);
		m.put("suman@gmail.com", 7979797979l);
		m.put("sibi123@gmail.com", 68968990l);
		m.put("surya@gmail.com", 7897897890l);
		m.put("karthi@gmail.com", 8900980989l);
		System.out.println(m);
		Set<Entry<String,Long>> s=m.entrySet();
		for(Entry<String,Long> x:s)
		{
			System.out.println(x);
		}
	}

}
