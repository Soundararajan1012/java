package classandobject;

public class phone1 {
	public void brandname()
	{
		String brandname="Samsung";
		System.out.println("Brand Name:"+brandname);
	}
	public void processorname()
	{
		String processorname="Exynos Processor";
		System.out.println("Processor Name:"+processorname);
	}
	public void ram()
	{
		String ram="2GB";
		System.out.println("Ram:"+ram);
	}
	public void mobcolor()
	{
		String mobcolor="Blue";
		System.out.println("mobcolor:"+mobcolor);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		phone1 p1=new phone1();
		p1.brandname();
		p1.processorname();
		p1.ram();
		p1.mobcolor();

	}

}
