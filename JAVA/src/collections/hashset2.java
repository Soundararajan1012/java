package collections;

import java.util.HashSet;
import java.util.Set;

public class hashset2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> s=new HashSet<Integer>();
		s.add(20);
		s.add(30);
		s.add(20);
		s.add(30);
		s.add(45);
		s.add(50);
		s.add(60);
		s.add(45);
		System.out.println(s);
		for(Integer i:s)
		{
			System.out.println(i);
		}

	}

}
