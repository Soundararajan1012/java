package Abstraction;
import java.util.Scanner;
public class department2 extends college{
	@Override
	public String departmentnames(String Deptname) {
		// TODO Auto-generated method stub
		return Deptname;
	}

	@Override
	public int noofstudent(int totalstudents) {
		// TODO Auto-generated method stub
		return totalstudents;
	}
	public int staffs(int totalstaffs)
	{
		return totalstaffs;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("College Details");
		department2 d2=new department2();
		System.out.println("Department Name:");
		String deptname=sc.next();
		deptname +=sc.nextLine();
		System.out.println("Number of Students:");
		int totalstudents=sc.nextInt();
		System.out.println("College Name:");
		String clgname=sc.next();
		clgname +=sc.nextLine();
		System.out.println("Staffs:");
		int totalstaffs=sc.nextInt();
		
		
		System.out.println("College Details");
		System.out.println("Department Name:"+d2.departmentnames(deptname));
		System.out.println("Number of Students:"+d2.noofstudent(totalstudents));
		System.out.println("College Name:"+d2.collegename(clgname));
		System.out.println("Staffs:"+d2.staffs(totalstaffs));
		sc.close();

	}

	

}
