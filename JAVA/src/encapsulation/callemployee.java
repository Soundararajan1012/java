package encapsulation;

public class callemployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee e=new employee();
		e.setName("Raja");
		e.setEmailId("ms@gmail.com");
		e.setPhoneNumber(9876543210l);
		System.out.println(e.getName());
		System.out.println(e.getEmailId());
		System.out.println(e.getPhoneNumber());

	}

}
