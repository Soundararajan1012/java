package inheritance;
import java.util.Scanner;
public class Student {
	public String Studentname(String name)
	{
		return name;
	}
	public String StudentDept(String dept)
	{
		return dept;
	}
	public int StudentId(int id)
	{
		return id;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		college c=new college();
		System.out.println("College Information");
		System.out.println("Enter College Name:");
		String name=sc.next();
		name +=sc.nextLine();
		System.out.println("Enter College Code:");
		int code=sc.nextInt();
		System.out.println("Enter College Rank:");
		long rank=sc.nextLong();
		
		Student s=new Student();
		System.out.println("Student Information");
		System.out.println("Enter Student Name:");
		String name1=sc.next();
		name1 +=sc.nextLine();
		System.out.println("Enter Student Dept:");
		String dept=sc.next();
		dept +=sc.nextLine();
		System.out.println("Enter Student Id:");
		int id=sc.nextInt();
		
		Hostel h=new Hostel();
		System.out.println("Hostel");
		System.out.println("Hostel Name:");
		String Name2=sc.next();
		Name2 +=sc.nextLine();
		
		Department d=new Department();
		System.out.println("Department");
		System.out.println("Department Name:");
		String Name3=sc.next();
		Name3 +=sc.nextLine();
		
		System.out.println("College and other Details:");
		System.out.println("College Name:"+c.CollegeName(name));
		System.out.println("College Code:"+c.CollegeCode(code));
		System.out.println("College Rank:"+c.CollegeRank(rank));
		System.out.println("Student Name:"+s.Studentname(name1));
		System.out.println("Student Dept:"+s.StudentDept(dept));
		System.out.println("Student Id:"+s.StudentId(id));
		System.out.println("Hostel Name:"+h.HostelName(Name2));
		System.out.println("Department Name:"+d.Dept(Name3));
		

	}

}
