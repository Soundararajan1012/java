package scannerwithreturntype;
import java.util.Scanner;
public class student {
	//: stuid,stuname,stuclass,stumail,stuPhoneno,stuaddress,stuGender

	public int stuId(int id)
	{
		return id;
	}
	public String stuName(String name)
	{
		return name;
	}
	public String stuEmail(String email)
	{
		return email;
	}
	public long stuPhoneNo(long phoneno)
	{
		return phoneno;
	}
	public String stuAddress(String address)
	{
		return address;
	}
	public String stuGender(String gender)
	{
		return gender;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1=new student();
		Scanner sc=new Scanner(System.in);
		System.out.println("Student Information");
		System.out.println("Student Id:");
		int id=sc.nextInt();
		System.out.println("Student Name:");
		String name=sc.next();
		System.out.println("Student Email:");
		String email=sc.next();
		System.out.println("Student PhoneNo:");
		long phoneno=sc.nextLong();
		System.out.println("Student Address");
		String address=sc.next();
		address += sc.nextLine();
		System.out.println("Student Gender:");
		String gender=sc.next();
		System.out.println("Student Id:"+s1.stuId(id));
		System.out.println("Student Name:"+s1.stuName(name));
		System.out.println("Student Email:"+s1.stuEmail(email));
		System.out.println("Student PhoneNo:"+s1.stuPhoneNo(phoneno));
		System.out.println("Student Address:"+s1.stuAddress(address));
		System.out.println("Student Gender:"+s1.stuGender(gender));

	}

}
