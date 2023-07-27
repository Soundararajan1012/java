package map;
import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Map;

public class student2 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> s=new LinkedHashMap<String,String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Id:");
		Integer stdid=sc.nextInt();
		System.out.println("Name:");
		String stdname=sc.next();
		System.out.println("PhoneNo:");
		long phoneno=sc.nextLong();
		System.out.println("Address:");
		String address=sc.next();
		address +=sc.nextLine();
		System.out.println("Dob:");
		String dob=sc.next();
		System.out.println("Email:");
		String emailid=sc.next();
		System.out.println("Gender:");
		String gender=sc.next();
		System.out.println("Student Id:"+stdid);
		System.out.println("Student Name:"+stdname);
		System.out.println("Student Phoneno:"+phoneno);
		System.out.println("Student Address:"+address);
		System.out.println("Student Dob:"+dob);
		System.out.println("Student Email:"+emailid);
		System.out.println("Student Gender:"+gender);
	}

}
