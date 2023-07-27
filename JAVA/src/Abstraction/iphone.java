package Abstraction;
import java.util.Scanner;
public class iphone extends mobile{
	
	public String mobieram(String ram)
	{
		return ram;
	}
	@Override
	public String mobilebrand(String brand) {
		// TODO Auto-generated method stub
		return brand;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Mobile Information");
		iphone m1=new iphone();
		System.out.println("Enter iphone Brand:");
		String brand=sc.next();
		brand +=sc.nextLine();
		System.out.println("Enter iphone Ram:");
		String ram=sc.next();
		System.out.println("Mobile Camera:");
		String camera=sc.next();
				
		System.out.println("IPHONE");
		System.out.println("iphone Brand:"+m1.mobilebrand(brand));
		System.out.println("iphone Ram:"+m1.mobieram(ram));	
		System.out.println("Camera:"+m1.mobilecamera(camera));
		sc.close();

	}

		}


