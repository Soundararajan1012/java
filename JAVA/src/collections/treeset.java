package collections;

import java.util.Set;
import java.util.TreeSet;

public class treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> s=new TreeSet<Integer>();
		s.add(10);
		s.add(80);
		s.add(20);
		s.add(70);
		s.add(30);
		s.add(60);
		s.add(40);
		s.add(10);
		s.add(50);
		s.add(100);
		s.add(90);
		System.out.println(s);
		for(Integer i:s)
		{
			System.out.println(i);
		}
		Set<Integer> ss=new TreeSet<Integer>();
		ss.add(110);
		ss.add(150);
		ss.add(130);
		ss.add(140);
		ss.add(120);
		System.out.println(ss.equals(s));
		System.out.println(ss);

	}

}
