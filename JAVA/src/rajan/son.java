package rajan;

public class son extends child{
	public void sub()
	{
		int d=200,e=100,f=d-e;
		System.out.println(f);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		son s=new son();
		s.display();
		s.show();
		s.add();
		s.sub();

	}

}
