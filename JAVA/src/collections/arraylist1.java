package collections;

import java.util.ArrayList;
import java.util.List;

public class arraylist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		l.add(70);
		l.add(80);
		l.add(90);
		l.add(100);
		System.out.println(l);
		System.out.println(l.size());
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}

	}

}
