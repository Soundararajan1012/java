package palimorphism;
import java.util.Scanner;
public class mobile {
	public String PhoneInfo(String brand)
	{
		return brand;
	}
	public int PhoneInfo(int ram)
	{
		return ram;
	}
	public double PhoneInfo(double size)
	{
		return size;
	}
	public long PhoneInfo(long rate)
	{
		return rate;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mobile p1=new mobile();
		Scanner sc=new Scanner(System.in);
		System.out.println("Mobile Information");
		System.out.println("Brand Name:");
		String brand=sc.next();
		brand +=sc.nextLine();
		System.out.println("Ram:");
		int ram=sc.nextInt();
		System.out.println("Size:");
		double size=sc.nextDouble();
		System.out.println("Rate:");
		long rate=sc.nextLong();
		System.out.println("Brand:"+p1.PhoneInfo(brand));
		System.out.println("Ram:"+p1.PhoneInfo(ram));
		System.out.println("Size:"+p1.PhoneInfo(size));
		System.out.println("Rate:"+p1.PhoneInfo(rate));

	}

}
