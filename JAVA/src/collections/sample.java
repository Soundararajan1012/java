package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		System.out.println(l.contains(10));
		System.out.println(l.get(2));
		l.clear();
		l.add(20);
		l.add(10);
		l.add(50);
		l.add(40);
		l.add(30);
		l.add(80);
		l.add(90);
		l.add(100);
		l.remove(0);
		System.out.println(l);
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
		System.out.println("Before list:"+l);
		Collections.sort(l);
		System.out.println("Ascending order:"+l.toString());
		
		Collections.sort(l,Comparator.reverseOrder());
		System.out.println("Descending order:"+l.toString());
		
		

	}

}
