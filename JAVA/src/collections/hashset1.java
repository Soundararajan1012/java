package collections;

import java.util.HashSet;
import java.util.Set;
public class hashset1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Object> l=new HashSet<Object>();
		l.add(10);
		l.add(10);
		l.add(10.2);
		l.add(10000.500);
		l.add(9003690139l);
		l.add('a');
		l.add("hello");
		l.add(true);
		l.add(1);
		l.add(2);
		System.out.println(l);
		for(Object i:l)
		{
			System.out.println(i);
		}

	}

}
