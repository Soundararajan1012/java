package ExceptionHandling;

public class ArithmaticException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		try
		{
			System.out.println(4/0);
		}catch(ArithmeticException e)
		{
			System.out.println("Exception Handled");
		}
		System.out.println(5);
		System.out.println(6);

	}

}
