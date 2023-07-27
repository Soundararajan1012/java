package Interface;

public class Bullet implements bike{
	@Override
	public void bikename() {
		// TODO Auto-generated method stub
		System.out.println("Bike Name:Bullet");
		
	}

	@Override
	public void bikemodel() {
		// TODO Auto-generated method stub
		System.out.println("Bike Model:Royal Enfield Bullet 350");
		
	}

	@Override
	public void mileage() {
		// TODO Auto-generated method stub
		System.out.println("Bike Mileage:80kmpl");
		
	}

	@Override
	public void bikerate() {
		// TODO Auto-generated method stub
		System.out.println("Bike Rate:1,48,000");
		
	}

	@Override
	public void warranty() {
		// TODO Auto-generated method stub
		System.out.println("Bike Warranty:5 Years");
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bullet p=new Bullet();
		System.out.println("Passion Information");
		p.bikename();
		p.bikemodel();
		p.mileage();
		p.bikerate();
		p.warranty();

	}


}
