package collections;
import java.util.ArrayList;
import java.util.List;
public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> l=new ArrayList<>();
		l.add(100);
		l.add(12.2);
		l.add(1000.909);
		l.add(9003690001l);
		l.add(12);
		l.add(34);
		l.add('q');
		l.add(true);
		l.add("java");
		l.add(100);
		System.out.println(l);
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}

	}

}
