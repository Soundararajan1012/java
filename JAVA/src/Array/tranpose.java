package Array;
import java.util.Scanner;
public class tranpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row and column:");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int arr[][]=new int[row][col];
		System.out.println("Enter matrix:");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				arr[i][j]=sc.nextInt();
				System.out.print(" ");
			}
		}
		System.out.println("Before Transpose:");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("After Transpose:");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}

	}

}
