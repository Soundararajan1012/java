package Abstraction;
import java.util.Scanner;
public class college1 extends students{
	
	@Override
	public String student(String universityname) {
		// TODO Auto-generated method stub
		return universityname;
	}
	public int studentid(int id)
	{
		return id;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("College information");
		college1 c=new college1();
		System.out.println("University Name:");
		String name=sc.next();
		name +=sc.nextLine();
		System.out.println("Student Name:");
		String name1=sc.next();
		name1 +=sc.nextLine();
		System.out.println("Student Id:");
		int id=sc.nextInt();
		
		System.out.println("College information");
		System.out.println("University Name:"+c.student(name));
		System.out.println("Student Name:"+c.student(name1));
		System.out.println("Student Id:"+c.studentid(id));
		sc.close();

	}

}
