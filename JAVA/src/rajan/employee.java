package rajan;
import java.util.Scanner;
public class employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int id;
		String empname;
		String email;
		System.out.println("enter id:");
		id=sc.nextInt();
		System.out.println("enter employee name:");
		empname=sc.next();
		System.out.println("enter email:");
		email=sc.next();
		System.out.println("employee id is:"+id+"and employee name:"+empname+"employee email:"+email);
        sc.close();
	}

}
