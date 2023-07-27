package rajan;
class X
{
	public void show() 
	{
		System.out.println("A is calling");
	}
}
class Y extends X
{
	public void some()
	{
		System.out.println("B is calling");
	}
}
class Z extends Y
{
	public void test()
	{
		System.out.println("C is calling");
	}
}
public class multipleinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Z obj=new Z();
		obj.show();
		obj.some();
		obj.test();

	}

}
