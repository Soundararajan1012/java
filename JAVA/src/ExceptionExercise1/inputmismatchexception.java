package ExceptionExercise1;
import java.util.*;
public class inputmismatchexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter value1:");
			int p=sc.nextInt();
			System.out.println("Enter value2:");
			int q=sc.nextInt();
			System.out.println("Result:"+(p-q));
		}
		catch(InputMismatchException e)
		{
			System.out.println(e.getMessage());
			System.out.println("Exception caught");
		}
		finally
		{
			System.out.println("The Two Numbers subtraction");
		}
		sc.close();

	}

}
