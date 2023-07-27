package classandobject;

public class studentmethod {
	public void stuId()
	{
		int stuId=1121;
		System.out.println("Student Id:"+stuId);
	}
	public void stuName()
	{
		String stuName="Raja";
		System.out.println("Student Name:"+stuName);
	}
	public void stuDob()
	{
		String stuDob="10.12.1996";
		System.out.println("Student Dob:"+stuDob);
	}
	public void stuPhone()
	{
		long stuPhone=8754372715l;
		System.out.println("Student Phone:"+stuPhone);
	}
	public void stuEmail()
	{
		String stuEmail="msr@gmail.com";
		System.out.println("Student Email:"+stuEmail);
	}
	public void stuAddress()
	{
		String stuAddress="1/144a north street,porur.";
		System.out.println("Student Address:"+stuAddress);
	}
//stuDob(), stuPhone(), stuEmail(), stuAddress()
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		studentmethod s1=new studentmethod();
		s1.stuId();
		s1.stuName();
		s1.stuDob();
		s1.stuPhone();
		s1.stuEmail();
		s1.stuAddress();

	}

}
