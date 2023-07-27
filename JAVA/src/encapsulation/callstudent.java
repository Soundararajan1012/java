package encapsulation;

public class callstudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s=new student();
		s.setStdName("Rajan");
		s.setStdRoll(1234);
		s.setStdId(11);
		System.out.println("Student Information");
		System.out.println("Student Name:"+s.getStdName());
		System.out.println("Student RollNo:"+s.getStdRoll());
		System.out.println("Student Id:"+s.getStdId());

	}

}
