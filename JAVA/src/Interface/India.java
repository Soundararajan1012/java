package Interface;

public class India implements Countries {
	@Override
	public void countryname() {
		// TODO Auto-generated method stub
		System.out.println("Country Name:India");
		
	}

	@Override
	public void noofstates() {
		// TODO Auto-generated method stub
		System.out.println("Number of States:32");
		
	}

	@Override
	public void president() {
		// TODO Auto-generated method stub
		System.out.println("President:Droupadi Murmu");
		
	}

	@Override
	public void primeminister() {
		// TODO Auto-generated method stub
		System.out.println("Prime Minister:Narendra Modi");
		
	}

	@Override
	public void population() {
		// TODO Auto-generated method stub
		System.out.println("Population:1,415,236,875");
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		India c=new India();
		System.out.println("India Details");
		c.countryname();
		c.noofstates();
		c.president();
		c.primeminister();
		c.population();
		

	}

	
}
