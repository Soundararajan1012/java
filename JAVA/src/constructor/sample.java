package constructor;

public class sample {
	sample()
	{
		int a=100,b=200;
		System.out.println(a+b);
	}
	sample(int a)
	{
		int b=200;
		System.out.println(a-b);
	}
	sample(String s)
	{
		int a=100,b=3;
		System.out.println(a*b);
	}
	sample(int a,int b)
	{
		System.out.println(a/b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample sam=new sample();
		sample sa=new sample(100);
		sample samp=new sample("hai");
		sample saml=new sample(5,2);

	}

}
