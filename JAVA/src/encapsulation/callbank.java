package encapsulation;

public class callbank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank b=new bank();
		b.setAccno(9010234567l);
		b.setEmail("rs@gmail.com");
		b.setName("Rajan");
		b.setAmount(60000);
		System.out.println("Bank Chellan Information");
		System.out.println("Customer Accno:"+b.getAccno());
		System.out.println("Customer Email:"+b.getEmail());
		System.out.println("Customer Name:"+b.getName());
		System.out.println("Customer Amount:"+b.getAmount());

	}

}
