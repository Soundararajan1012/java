package collections;
import java.util.Vector;
public class vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v=new Vector<Integer>();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		System.out.println(v);
		for(int i=0;i<v.size();i++)
		{
			System.out.println(v.get(i));
		}
		

	}

}
