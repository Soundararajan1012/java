package classandobject;

public class phone {
	public void mobileDetails()
	{
	 String brandname="samsung"; 
	 String processorname="Exynos850 Processor";
	 String ram="6GB";
	 String mobcolor="Blue";
	 System.out.println("Brand Name:"+brandname+"\nProcessor Name:"+processorname+"\nRam:"+ram+"\nMobile color:"+mobcolor);
	}
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		phone phone1=new phone();
		phone1.mobileDetails();

	}

}
