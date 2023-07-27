package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
//stdId,stdName,stdPhone,address,dOB,eMail,gender
public class student {
	int StdId;
	String StdName;
	long StdPhone;
	String Address;
	String Dob;
	String Email;
	String Gender;
	
	
	student(int s1,String s2,long s3,String s4,String s5,String s6,String s7)
	{
		StdId=s1;
		StdName=s2;
		StdPhone=s3;
		Address=s4;
		Dob=s5;
		Email=s6;
		Gender=s7;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,student> s=new HashMap<Integer,student>();
		student c1=new student(101,"Anand",9090909098l,"1/14a North street,chennai","12.10.1998","anand@gamil.com","male");
		student c2=new student(102,"Aravind",8776543210l,"2a South street,tenkasi","09.12.1998","aravind67@gmail.com","male");
		student c3=new student(103,"Poorani",9344567810l,"1/32 West street,madurai","31.12.1998","poorani@gmail.com","female");
		student c4=new student(104,"Rajan",9789096778l,"1/2s East street,salem","06.03.1998","rajan@gmail.com","male");
		student c5=new student(105,"surya",7654378908l,"1/90e vellammal street,vellor","13.07.1998","surya@gmail.com","male");
		s.put(1, c1);
		s.put(2, c2);
		s.put(3, c3);
		s.put(4, c4);
		s.put(5, c5);
		Iterator trav=s.entrySet().iterator();
		while(trav.hasNext())
		{
			Map.Entry record=(Map.Entry)trav.next();  //will give next (Key, Value) pair
			student j=(student)record.getValue();
	                System.out.println(record.getKey()+" "+j.StdId+" "+j.StdName+" "+j.StdPhone+" "+j.Address+" "+j.Dob+" "+j.Dob+" "+j.Email+" "+j.Gender);
		}

	}

}
