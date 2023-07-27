package employee;

import company.company;
import department.department;
import salary.salary;

public class employee {
	public void empName()
	{
		String empName="Raja";
		System.out.println("Employee Name:"+empName);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee e1=new employee();
		e1.empName();
		company c1=new company();
		c1.companyName();
		salary s1=new salary();
		s1.salaryamount();
		department d1=new department();
		d1.departmentName();
	}

}
