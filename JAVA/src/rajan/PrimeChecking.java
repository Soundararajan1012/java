package rajan;

import java.util.Scanner;

public class PrimeChecking {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		n=sc.nextInt();
		int count=0;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				count=1;
			}
		}
		if(count==0)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Is not Prime Number");
		}

	}

}
