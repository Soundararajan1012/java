package rajan;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		String s1,s2;
		s1=sc.next();
		s2=" ";
		for(int i=s1.length()-1;i>=0;i--)
		{
		s2=s2+s1.charAt(i);
		}
		System.out.println("Original value:"+s1);
		System.out.println("Reverse Value:"+s2);
        sc.close();
	}

}
