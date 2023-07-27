package Exceptionexercise2;
import java.util.Scanner;
public class customexception {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value:");
		int a=sc.nextInt();
		try
		{
			if(a>0)
			{
				System.out.println("a is positive");
			}
			else
			{
				throw new resultexception("b is negative");
			}
		}
		catch(resultexception r)
		{
			System.out.println("Exception caught");
			System.out.println(r.getMessage());
		}
		finally
		{
		System.out.println("successfully");
		sc.close();
		}

	}

}
