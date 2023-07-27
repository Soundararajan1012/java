package rajan;

public class methodoverloading1 {
	public String CheckNum(int a,int b)
	{
	int c=a+b;
	if(c%2==0)
	{
		return "even";
	}else
	{
		return "odd";
	}
	}
	public double CheckNum(double d)
	{
		double c=d;
		if(c>0)
		{
			return c;
		}else
		{
			return c;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodoverloading1 d=new methodoverloading1();
		System.out.println(d.CheckNum(10,20));
		System.out.println(10000.50);

	}

}
