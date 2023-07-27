package ExceptionExercise1;
import java.util.Scanner;
public class arrayindexoutofbound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		try
		{
			System.out.println("Enter elements:");
		int n=sc.nextInt();  
		int[] array = new int[10];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
		{     
		array[i]=sc.nextInt();  
		}  
		System.out.println("Array elements are: ");   
		for (int i=0; i<n; i++)   
		{  
		System.out.println(array[i]);  
		}  
		} 
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
			System.out.println("exception caught");
		}
		finally
		{
			System.out.println("successfully....");
		}
		sc.close();
		} 
}


