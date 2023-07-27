package loops;

public class fibbonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1,b=2,c,n=5;
		for(int i=1;i<=n;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}

	}

}
