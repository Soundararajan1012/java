package Interface;

public class Jawa implements bike{
	@Override
	public void bikename() {
		// TODO Auto-generated method stub
		System.out.println("Bike Name:Jawa");
		
	}

	@Override
	public void bikemodel() {
		// TODO Auto-generated method stub
		System.out.println("Bike Model:Jawa Perak");
		
	}

	@Override
	public void mileage() {
		// TODO Auto-generated method stub
		System.out.println("Bike Mileage:30kmpl");
		
	}

	@Override
	public void bikerate() {
		// TODO Auto-generated method stub
		System.out.println("Bike Rate:2,11,000");
		
	}

	@Override
	public void warranty() {
		// TODO Auto-generated method stub
		System.out.println("Bike Warranty:5 Years");
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jawa p=new Jawa();
		System.out.println("Jawa Information");
		p.bikename();
		p.bikemodel();
		p.mileage();
		p.bikerate();
		p.warranty();

	}



}
