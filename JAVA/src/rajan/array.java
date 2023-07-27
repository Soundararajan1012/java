package rajan;
import java.util.Scanner;
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the elements are stored:");
		int n=sc.nextInt();
		int[] array=new int[10];
		System.out.print("enter the elements:");
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.print("array elements are:");
		for(int i=0;i<n;i++)
		{
			System.out.println(array[i]);
		}
		sc.close();

	}

}
