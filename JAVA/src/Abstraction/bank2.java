package Abstraction;
import java.util.Scanner;
public class bank2 extends bank{
	@Override
	public String customerdetails(String customername) {
		// TODO Auto-generated method stub
		return customername;
	}
	public String netbanking(String bankname)
	{
		return bankname;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Bank Information");
		bank2 b2=new bank2();
		System.out.println("Customer Name:");
		String customername=sc.next();
		customername +=sc.nextLine();
		System.out.println("Customer Account Type:");
		String type=sc.next();
		type +=sc.nextLine();
		System.out.println("Bank Name:");
		String bankname=sc.next();
		bankname +=sc.nextLine();
		
		System.out.println("Bank al Details");
		System.out.println("Customer Name:"+b2.customerdetails(customername));
		System.out.println("Customer Account Type:"+b2.accounttype(type));
		System.out.println("Bank Name:"+b2.netbanking(bankname));
		sc.close();

	}

	

}
