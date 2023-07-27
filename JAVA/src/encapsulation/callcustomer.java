package encapsulation;

public class callcustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		customer c=new customer();
		c.setCustomerName("Suriya");
		c.setAdharNo(999992345123l);
		c.setCustomerAge(25);
		System.out.println("Customer Information");
		System.out.println("Customer Name:"+c.getCustomerName());
		System.out.println("Customer AdharNo:"+c.getAdharNo());
		System.out.println("Customer Age:"+c.getCustomerAge());

	}

}
