package scannerwithreturntype;
import java.util.Scanner;
public class employee {
	public int empId(int id)
	{
		return id;
	}
	public String empName(String name)
	{
		return name;
	}
	public String empEmail(String email)
	{
		return email;
	}
	public long empPhoneNo(long phoneno)
	{
		return phoneno;
	}
	public double empSalary(double salary)
	{
		return salary;
	}
	public String empGender(String gender)
	{
		return gender;
	}
	public String empCity(String city)
	{
		return city;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//empid,empname,empemail,empPhoneno,empSalary,empGender,empCity
		employee e1=new employee();
		Scanner sc=new Scanner(System.in);
		System.out.println("Employee Information");
		System.out.println("Employee Id:");
		int id=sc.nextInt();
		System.out.println("Employee Name:");
		String name=sc.next();
		System.out.println("Employee Email:");
		String email=sc.next();
		System.out.println("Employee PhoneNo:");
		long phone=sc.nextLong();
		System.out.println("Employee Salary:");
		double salary=sc.nextDouble();
		System.out.println("Employee Gender:");
		String Gender=sc.next();
		System.out.println("Employee City:");
		String city=sc.next();
		System.out.println("Employee Id:"+e1.empId(id));
		System.out.println("Employee Name:"+e1.empName(name));
		System.out.println("Employee Email:"+e1.empEmail(email));
		System.out.println("Employee PhoneNo:"+e1.empPhoneNo(phone));
		System.out.println("Employee Salary:"+e1.empSalary(salary));
		System.out.println("Employee Gender:"+e1.empGender(Gender));
		System.out.println("Employee City:"+e1.empCity(city));

	}

}
