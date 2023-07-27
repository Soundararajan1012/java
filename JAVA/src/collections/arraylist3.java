package collections;


import java.util.LinkedHashSet;
import java.util.Set;

public class arraylist3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> s=new LinkedHashSet<Integer>();
		s.add(100);
		s.add(200);
		s.add(300);
		s.add(400);
		s.add(200);
		s.add(600);
		s.add(300);
		s.add(800);
		System.out.println(s);
		for(Integer i:s)
		{
			System.out.println(i);
		}
		


	}

}
