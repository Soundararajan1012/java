package org.bankdetails;

import java.util.Scanner;

public class canarabank  extends bankinfo{
	public float deposit(float deposit)
	{
		return deposit;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method 
		bankinfo b=new bankinfo();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Bank Information");
		System.out.println("Enter Saving:");
		long saving=sc.nextLong();
		System.out.println("Enter Fixed:");
		double p,n,t;
		System.out.println("Enter Principle:");
		p=sc.nextDouble();
		System.out.println("Enter Rate of interest:");
		n=sc.nextDouble();
		System.out.println("Enter time:");
		t=sc.nextDouble();
		System.out.println("Enter Deposit:");
		float deposit=sc.nextFloat();
		deposit=(deposit+saving);
		
		System.out.println("CanaraBank");
		canarabank c=new canarabank();
		System.out.println("Enter Deposit:");
		float deposit1=sc.nextFloat();
	    
		
		
		System.out.println("Bank Information");
		System.out.println("Savings:"+b.savings(saving));
		double fixed=((p*n*t)+saving);
		System.out.println("Fixed:"+b.fixed(fixed));
		
		System.out.println("Deposit:"+b.deposit(deposit));
		
		System.out.println("Canarabank Information");
		
		System.out.println("Deposit:"+c.deposit(deposit1));
		
		

	}

}
