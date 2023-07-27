package Abstraction;
import java.util.Scanner;
public class bank1 extends bank {
	@Override
	public String customerdetails(String customername) {
		// TODO Auto-generated method stub
		return customername;
	}
	public long accountNo(long accnumber)
	{
		return accnumber;
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Bank information");
		bank1 b1=new bank1();
		System.out.println("Customer Name:");
		String customername=sc.next();
		customername +=sc.nextLine();
		System.out.println("Customer Account Type:");
		String type=sc.next();
		type +=sc.nextLine();
		System.out.println("customer Account Number:");
		long accnumber=sc.nextLong();
		
		System.out.println("Bank all Details");
		System.out.println("Customer Name:"+b1.customerdetails(customername));
		System.out.println("Customer Account Type:"+b1.accounttype(type));
		System.out.println("customer Account Number:"+b1.accountNo(accnumber));
		sc.close();

	}

	

}
