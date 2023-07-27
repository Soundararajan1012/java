package Abstraction;
import java.util.Scanner;
public class college2 extends students{
	@Override
	public String student(String universityname) {
		// TODO Auto-generated method stub
		return universityname;
	}
	public int studentmark(int m1,int m2,int m3)
	{
		int total=(m1+m2+m3);
		return total;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("College information");
		college2 c1=new college2();
		System.out.println("University Name:");
		String name=sc.next();
		name +=sc.nextLine();
		System.out.println("Student Name:");
		String name1=sc.next();
		name1 +=sc.nextLine();
		System.out.println("Student Marks:");
		System.out.println("mark1:");
		int m1=sc.nextInt();
		System.out.println("mark2:");
		int m2=sc.nextInt();
		System.out.println("mark3:");
		int m3=sc.nextInt();
		
		System.out.println("College information");
		System.out.println("University Name:"+c1.student(name));
		System.out.println("Student Name:"+c1.student(name1));
		System.out.println("Student Marks:"+c1.studentmark(m1, m2, m3));
		sc.close();


	}

	
	}


