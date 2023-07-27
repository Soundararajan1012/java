package rajan;

public class daughter extends child{
	public void multiply()
	{
		int x=20,y=30, z=x*y;
		System.out.println(z);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		daughter d=new daughter();
		d.display();
		d.show();
		d.add();
		d.multiply();

	}

}
