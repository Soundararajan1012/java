package collections;

import java.util.ArrayList;
import java.util.List;

public class arraylist2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Character> l=new ArrayList<Character>();
		l.add('A');
		l.add('S');
		l.add('D');
		l.add('F');
		l.add('G');
		l.add('H');
		l.add('J');
		l.add('F');
		System.out.println(l);
		System.out.println(l.size());
		l.add(7,'Y');
		l.add(8,'Z');
		System.out.println(l);
		System.out.println(l.size());
		l.remove(9);
		System.out.println(l);
		l.set(6,'I');
		System.out.println(l);
		System.out.println(l.size());

	}

}
