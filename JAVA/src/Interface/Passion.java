package Interface;

public class Passion implements bike{
	@Override
	public void bikename() {
		// TODO Auto-generated method stub
		System.out.println("Bike Name:Passion");
		
	}

	@Override
	public void bikemodel() {
		// TODO Auto-generated method stub
		System.out.println("Bike Model:Hero Passion Pro");
		
	}

	@Override
	public void mileage() {
		// TODO Auto-generated method stub
		System.out.println("Bike Mileage:75kmpl");
		
	}

	@Override
	public void bikerate() {
		// TODO Auto-generated method stub
		System.out.println("Bike Rate:80,858");
		
	}

	@Override
	public void warranty() {
		// TODO Auto-generated method stub
		System.out.println("Bike Warranty:3 Years");
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Passion p=new Passion();
		System.out.println("Passion Information");
		p.bikename();
		p.bikemodel();
		p.mileage();
		p.bikerate();
		p.warranty();

	}

	
}
