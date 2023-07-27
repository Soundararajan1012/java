package collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class sortedset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet<String> s=new TreeSet<String>();
		s.add("Raja");
		s.add("Velu");
		s.add("Sundar");
		s.add("sibi");
		s.add("Velu");
		System.out.println(s);
		for(String i:s)
		{
			System.out.println(i);
		}

	}

}
