package Interface;

import java.util.Scanner;

public class iphone implements mobile {
Scanner sc=new Scanner(System.in);
	
	@Override
	public void mobilebrand() {
		// TODO Auto-generated method stub
		System.out.println("Brand Name:IPhone");
		
	}

	@Override
	public void mobilecamera() {
		// TODO Auto-generated method stub
		System.out.println("Mobile Camera:45MP");
		
	}

	@Override
	public void mobileram() {
		// TODO Auto-generated method stub
		System.out.println("Mobile RAM:3GB");
		
	}

	@Override
	public void mobileprocessor() {
		// TODO Auto-generated method stub
		System.out.println("Mobile Processor:Bionic");
		
	}

	@Override
	public void mobilerom() {
		// TODO Auto-generated method stub
		System.out.println("Mobile ROM:512GB");
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		iphone i=new iphone();
		i.mobilebrand();
		i.mobilecamera();
		i.mobileram();
		i.mobileprocessor();
		i.mobilerom();

	}


}
