package collections;

import java.util.HashSet;
import java.util.Set;

public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s=new HashSet<String>();
		s.add("Deepak");
		s.add("Roshini");
		s.add("Geetha");
		s.add("Nandha");
		s.add("Arun");
		s.add("Arun");
		System.out.println(s);
		for(String i:s)
		{
			System.out.println(i);
		}

	}

}
