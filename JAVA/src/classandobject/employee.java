package classandobject;

public class employee {
	public void EmployeeDetails()
	{
		int empId=112;
		String empName="rajan";
		String empDob="10.12.1998";
		long empPhone=8754372815l;
		String empEmail="ms@gmail.com";
		String empAddress="1/144 north street, porur.";
		System.out.println("Employee Id:"+empId+"\nEmployee Name:"+empName+"\nEmployee Dob:"+empDob+"\nEmployee phone:"+empPhone+"\nEmployee Email:"+empEmail+"\nEmployee Address:"+empAddress);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee emp=new employee();
		emp.EmployeeDetails();

	}

}
