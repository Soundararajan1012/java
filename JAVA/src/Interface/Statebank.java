package Interface;

public class Statebank implements bank {
	@Override
	public void bankname() {
		// TODO Auto-generated method stub
		System.out.println("Bank name:State Bank");
		
	}

	@Override
	public void bankIfsc() {
		// TODO Auto-generated method stub
		System.out.println("Bank Ifsc:SBIN0011753");
		
	}

	@Override
	public void branchname() {
		// TODO Auto-generated method stub
		System.out.println("Branch Name:Chennai Adambakkam");
		
	}

	@Override
	public void customers() {
		// TODO Auto-generated method stub
		System.out.println("Customers:8000");
		
	}

	@Override
	public void securitytips() {
		// TODO Auto-generated method stub
		System.out.println("Security Tips:Do not click on any links in any e-mail message to access the site");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Statebank p=new Statebank();
		System.out.println("State Bank Information");
		p.bankname();
		p.bankIfsc();
		p.branchname();
		p.customers();
		p.securitytips();
	}

	

}
