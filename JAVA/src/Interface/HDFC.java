package Interface;

public class HDFC implements bank{
	@Override
	public void bankname() {
		// TODO Auto-generated method stub
		System.out.println("Bank name:HDFC");
		
	}

	@Override
	public void bankIfsc() {
		// TODO Auto-generated method stub
		System.out.println("Bank Ifsc:HDFC0000017.");
		
	}

	@Override
	public void branchname() {
		// TODO Auto-generated method stub
		System.out.println("Branch Name:Chennai Anna Nagar");
		
	}

	@Override
	public void customers() {
		// TODO Auto-generated method stub
		System.out.println("Customers:7000");
		
	}

	@Override
	public void securitytips() {
		// TODO Auto-generated method stub
		System.out.println("Security Tips:Avoid accessing NetBanking over shared networks at cyber cafes, airports etc");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFC p=new HDFC();
		System.out.println("HDFC Information");
		p.bankname();
		p.bankIfsc();
		p.branchname();
		p.customers();
		p.securitytips();

	}

}
