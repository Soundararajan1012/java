package classandobject;

public class student1 {
	public void StudentDetails()
	{
		int stuId=101;
		String stuName="soundar";
		String stuDob="18.11.1996";
		long stuPhone=9752372719l;
		String stuEmail="srm@gmail.com";
		String stuAddress="1/104 north street, covai";
		System.out.println("student Id:"+stuId+"\nstudent Name:"+stuName+"\nstudent Dob:"+stuDob+"\nstudent phone:"+stuPhone+"\nstudent Email:"+stuEmail+"\nstudent Address:"+stuAddress);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student1 stu=new student1();
		stu.StudentDetails();
		

	}

}
