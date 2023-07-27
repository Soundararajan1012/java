package rajan;

public class classstudent {
	public void StudentMark() 
	{
		int t=90;
		int e=80;
		int m=60;
		int s=56;
		int ss=98;
		double average=(t+e+m+s+ss)/5;
		System.out.println("student average:"+average);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		classstudent stu=new classstudent();
		stu.StudentMark();

	}

}
