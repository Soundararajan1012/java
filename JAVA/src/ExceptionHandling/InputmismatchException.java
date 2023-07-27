package ExceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;
public class InputmismatchException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		try
		{
			System.out.println("Enter A:");
			int a = sc.nextInt();
			System.out.println(a);
			System.out.println("Enter B:");
			int b=sc.nextInt();
			System.out.println(b);
			System.out.println(a+b);
			
		}
		catch(InputMismatchException e)
		{
			System.out.println(e.getMessage());
			System.out.println("Exception handled");
		}
		System.out.println("Done");
		sc.close();

	}

}
