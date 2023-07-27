package constructor;

public class laptop {
	//parameterized constructor
	laptop(String lapnames1, String lapname2,String lapname3,String lapname4,String lapname5)
	{
		System.out.println("Laptop Names:");
		System.out.println(lapnames1);
		System.out.println(lapname2);
		System.out.println(lapname3);
		System.out.println(lapname4);
		System.out.println(lapname5);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		laptop l1=new laptop("HP","Asus","lenovo","samsung","Dell");
		

	}

}
