package Interface;

public class ICICI implements bank {

	@Override
	public void bankname() {
		// TODO Auto-generated method stub
		System.out.println("Bank name:ICICI");
		
	}

	@Override
	public void bankIfsc() {
		// TODO Auto-generated method stub
		System.out.println("Bank Ifsc:ICIC0006027");
		
	}

	@Override
	public void branchname() {
		// TODO Auto-generated method stub
		System.out.println("Branch Name:Chennai Anna Nagar");
		
	}

	@Override
	public void customers() {
		// TODO Auto-generated method stub
		System.out.println("Customers:6000");
		
	}

	@Override
	public void securitytips() {
		// TODO Auto-generated method stub
		System.out.println("Security Tips:Don't share your OTP or Passwords");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICICI p=new ICICI();
		System.out.println("ICICI Information");
		p.bankname();
		p.bankIfsc();
		p.branchname();
		p.customers();
		p.securitytips();

	}

}
