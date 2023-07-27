package Interface;

public class USA implements Countries{
	@Override
	public void countryname() {
		// TODO Auto-generated method stub
		System.out.println("Country Name:USA");
		
	}

	@Override
	public void noofstates() {
		// TODO Auto-generated method stub
		System.out.println("Number of States:52");
		
	}

	@Override
	public void president() {
		// TODO Auto-generated method stub
		System.out.println("President:Joe Biden");
		
	}

	@Override
	public void primeminister() {
		// TODO Auto-generated method stub
		System.out.println("Prime Minister:Joe Biden");
		
	}

	@Override
	public void population() {
		// TODO Auto-generated method stub
		System.out.println("Population:334,233,854");
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		USA c=new USA();
		System.out.println("USA Details");
		c.countryname();
		c.noofstates();
		c.president();
		c.primeminister();
		c.population();
		

	}

}
