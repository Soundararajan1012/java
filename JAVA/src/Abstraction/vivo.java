package Abstraction;
import java.util.Scanner;
public class vivo extends mobile {
	public String vivoprocessor(String processor)
	{
		return processor;
	}

	@Override
	public String mobilebrand(String brand) {
		// TODO Auto-generated method stub
		return brand;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		vivo v1=new vivo();
		System.out.println("Enter vivo Brand:");
		String brand1=sc.next();
		brand1 +=sc.nextLine();
		System.out.println("vivo processor:");
		String processor=sc.next();
		System.out.println("Mobile Ram:");
		String ram=sc.next();
		System.out.println("Mobile camera:");
		String camera=sc.next();
		
		processor +=sc.nextLine();System.out.println("Vivo");
		System.out.println("vivo Brand:"+v1.mobilebrand(brand1));
		System.out.println("vivo processor:"+v1.vivoprocessor(processor));
		System.out.println("Mobile Ram:"+v1.mobileram(ram));
		System.out.println("Mobile camera:"+v1.mobilecamera(camera));
		sc.close();


	}

}
