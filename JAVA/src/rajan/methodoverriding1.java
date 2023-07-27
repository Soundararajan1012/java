package rajan;

public class methodoverriding1 extends methodoverriding{
	public void bike()
	{
		System.out.println("KTM");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Child wish");
		methodoverriding1 child=new methodoverriding1();
		child.bike();
		System.out.println("parent wish");
		methodoverriding parent=new methodoverriding();
		parent.bike();

	}

}
