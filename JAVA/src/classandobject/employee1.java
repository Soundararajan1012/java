package classandobject;

public class employee1 {
	public void empId()
	{
		int empId=1121;
		System.out.println("Employee Id:"+empId);
	}
	public void empName()
	{
		String empName="Raja";
		System.out.println("Employee Name:"+empName);
	}
	public void empDob()
	{
		String empDob="10.12.1996";
		System.out.println("Employee Dob:"+empDob);
	}
	public void empPhone()
	{
		long empPhone=8754372715l;
		System.out.println("Employee Phone:"+empPhone);
	}
	public void empEmail()
	{
		String empEmail="msr@gmail.com";
		System.out.println("Employee Email:"+empEmail);
	}
	public void empAddress()
	{
		String empAddress="1/144a north street,porur.";
		System.out.println("Employee Address:"+empAddress);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee1 e1=new employee1();
		e1.empId();
		e1.empName();
		e1.empDob();
		e1.empPhone();
		e1.empEmail();
		e1.empAddress();

	}

}
