package conditionalsatatementswitch;

import java.util.Scanner;  
  
public class atm  
{
  public static void main(String args[] )  
  {
	  int balance=10000,withdraw,deposit;
	  Scanner sc=new Scanner(System.in);
	  while(true)
	  {
		  System.out.println("Automated Teller Machine");
		  System.out.println("1.Wihdraw");
		  System.out.println("2.Deposit");
		  System.out.println("3.Balance");
		  System.out.println("4.Exit");
		  System.out.print("Choose the operation you want to perform:");
		  int choice=sc.nextInt();
		  switch(choice)
		  {
		  case 1:
			  System.out.println("Enter the money to be withdraw:");
			  withdraw=sc.nextInt();
			  if(balance>=withdraw)
			  {
				  balance=balance-withdraw;
				  System.out.println("Please collect your cash");
			  }
			  else
			  {
				  System.out.println("Insufficient balance");
			  }
			  System.out.println("");
			  break;
		  case 2:
			  System.out.println("Enter the money to be Deposit:");
			  deposit=sc.nextInt();
			  balance=balance+deposit;
			  System.out.println("Money to be Deposited Successfully");
			  System.out.println("");
			  break;
		  case 3:
			  System.out.println("Balance:"+balance);
			  System.out.println("");
			  break;
		  case 4:
			  System.exit(0);
			  sc.close();
		  }
	  }
	  
	  
  }
}  