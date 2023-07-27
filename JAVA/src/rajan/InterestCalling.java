package rajan;

public class InterestCalling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI s=new SBI();
		System.out.println("Interest rate for SBI");
		System.out.println(s.interestRate());
		BOB b=new BOB();
		System.out.println("Interest rate for BOB");
		System.out.println(b.interestRate());
		TMB t=new TMB();
		System.out.println("Interest rate for TMB");
		System.out.println(t.interestRate());

	}

}
