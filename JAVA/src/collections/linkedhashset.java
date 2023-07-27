package collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class linkedhashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Object> s=new LinkedHashSet<Object>();
		s.add(10);
		s.add(20.2);
		s.add(10000);
		s.add(9003690138l);
		s.add(true);
		System.out.println(s);
		for(Object i:s)
		{
			System.out.println(i);
		}
		Set<Object> ss=new LinkedHashSet<Object>();
		ss.add("Hai");
		ss.add(25);
		ss.add(25000);
		s.addAll(ss);
		s.remove(10);
		System.out.println(s);
		s.removeAll(ss);
		System.out.println(s);
		System.out.println(s.hashCode());
		

	}

}
