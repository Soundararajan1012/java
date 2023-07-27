package ExceptionHandling;
import java.util.Scanner;
public class finallyexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		int a=sc.nextInt();
		System.out.println("Enter second number:");
		int b=sc.nextInt();
		int c;
		try
		{
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("rest of the code...");
			sc.close();
		}

	}

}
