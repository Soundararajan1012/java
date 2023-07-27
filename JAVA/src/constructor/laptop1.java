package constructor;

public class laptop1 extends desktop{
	//parameterized constructor
	laptop1(String name,String ram)
	{
		super();//super keyword to call the desktop class
		System.out.println("Laptop Details");
		System.out.println("Laptop Name:"+name);
		System.out.println("Laptop Ram:"+ram);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		laptop1 l=new laptop1("Lenovo","8GB");
		
		
		

	}

}
