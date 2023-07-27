package collections;
import java.util.LinkedList;
import java.util.List;
public class linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l=new LinkedList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		System.out.println(l);
		List<Integer> ll=new LinkedList<Integer>();
		ll.add(60);
		ll.add(70);
		ll.add(80);
		ll.add(90);
		ll.add(100);
		System.out.println(ll);
		l.addAll(ll);
		System.out.println(l);
		System.out.println(l.size());
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}


	}

}
