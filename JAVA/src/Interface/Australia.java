package Interface;

public class Australia implements Countries {
	@Override
	public void countryname() {
		// TODO Auto-generated method stub
		System.out.println("Country Name:Australia");
		
	}

	@Override
	public void noofstates() {
		// TODO Auto-generated method stub
		System.out.println("Number of States:6");
		
	}

	@Override
	public void president() {
		// TODO Auto-generated method stub
		System.out.println("President:The Hon Anthony Albanese MP");
		
	}

	@Override
	public void primeminister() {
		// TODO Auto-generated method stub
		System.out.println("Prime Minister:The Hon Anthony Albanese MP");
		
	}

	@Override
	public void population() {
		// TODO Auto-generated method stub
		System.out.println("Population:26,268,279");
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Australia c=new Australia();
		System.out.println("Australia Details");
		c.countryname();
		c.noofstates();
		c.president();
		c.primeminister();
		c.population();
		

	}


}
