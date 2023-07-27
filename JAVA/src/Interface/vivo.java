package Interface;
import java.util.Scanner;
public class vivo implements mobile{
	Scanner sc=new Scanner(System.in);
	
	@Override
	public void mobilebrand() {
		// TODO Auto-generated method stub
		System.out.println("Brand Name:Vivo");
		
	}

	@Override
	public void mobilecamera() {
		// TODO Auto-generated method stub
		System.out.println("Mobile Camera:6MP");
		
	}

	@Override
	public void mobileram() {
		// TODO Auto-generated method stub
		System.out.println("Mobile RAM:4GB");
		
	}

	@Override
	public void mobileprocessor() {
		// TODO Auto-generated method stub
		System.out.println("Mobile Processor:Snapdragon");
		
	}

	@Override
	public void mobilerom() {
		// TODO Auto-generated method stub
		System.out.println("Mobile ROM:128GB");
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vivo v=new vivo();
		v.mobilebrand();
		v.mobilecamera();
		v.mobileram();
		v.mobileprocessor();
		v.mobilerom();

	}

	
}
