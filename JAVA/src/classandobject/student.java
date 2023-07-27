package classandobject;
import java.util.Scanner;
public class student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//int stuId;
		String stuName;
		String stuDob;
		long stuPhone;
		String stuEmail;
		String stuAddress;
		String district;
		System.out.println("Enter Student Id:");
		int stuId=sc.nextInt();
		System.out.println("Enter Student Name:");
		stuName=sc.next();
		System.out.println("Enter Student Dob:");
		stuDob=sc.next();
		System.out.println("Enter Student phone:");
		stuPhone=sc.nextLong();
		System.out.println("Enter Student Email:");
		stuEmail=sc.next();
		System.out.println("Enter Student Address:");
		stuAddress=sc.next();
		stuAddress += sc.nextLine();
		System.out.println("Enter District:");
		district=sc.next();
		String fulladdress=stuAddress+"\n"+district;
		System.out.println("student Id:"+stuId+"\nstudent Name:"+stuName+"\nstudent Dob:"+stuDob+"\nstudent phone:"+stuPhone+"\nstudent Email:"+stuEmail+"\nstudent Address:"+fulladdress);
		sc.close();

	}

}
