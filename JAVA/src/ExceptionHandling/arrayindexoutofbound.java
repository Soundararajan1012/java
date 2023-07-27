package ExceptionHandling;

public class arrayindexoutofbound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		a[0]=50;
		a[1]=60;
		a[2]=70;
		a[3]=80;
		a[4]=90;
		try
		{
			for(int i=0;i<=a.length;i++)
			{
				System.out.println(a[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println(ex.getMessage());
			System.out.println("Exception caught");
		}
		System.out.println(a.length);

	}

}
