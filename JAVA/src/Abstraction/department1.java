package Abstraction;
import java.util.Scanner;
public class department1 extends college {
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
	public String subjects(String subjects)
	{
		return subjects;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("College Details");
		department1 d1=new department1();
		System.out.println("Department Name:");
		String deptname=sc.next();
		deptname +=sc.nextLine();
		System.out.println("Number of Students:");
		int totalstudents=sc.nextInt();
		System.out.println("College Name:");
		String clgname=sc.next();
		clgname +=sc.nextLine();
		System.out.println("Subjects:");
		String subjects=sc.next();
		subjects +=sc.nextLine();
		
		System.out.println("College Details");
		System.out.println("Department Name:"+d1.departmentnames(deptname));
		System.out.println("Number of Students:"+d1.noofstudent(totalstudents));
		System.out.println("College Name:"+d1.collegename(clgname));
		System.out.println("Subjects:"+d1.subjects(subjects));
		sc.close();

	}

	

}
