package rajan;
class A
{
	public void show() 
	{
		System.out.println("A is calling");
	}
}
class B extends A
{
	public void some()
	{
		System.out.println("B is calling");
	}
}
public class singleinheritance {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj=new B();
		obj.some();
		obj.show();

	}

}
