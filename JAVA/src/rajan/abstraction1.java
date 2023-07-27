package rajan;

public class abstraction1 extends abstraction {
	void add()
	{
		int a=250,b=20,c=a+b;
		System.out.println(c);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abstraction1 atm=new abstraction1();
		atm.add();
		atm.sub();

	}

}
