package ExceptionHandling;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int age=sc.nextInt();
		try
		{
			if(age>18)
			{
				System.out.println("Eligible to vote");
			}
			else
			{
				throw new MyException("Not eligible to vote");
			}
		}
		catch(MyException ex)
		{
			System.out.println("Exception caught");
			System.out.println(ex.getMessage());
		}
		System.out.println("code executed...");

	}

}
