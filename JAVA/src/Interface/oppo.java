package Interface;

import java.util.Scanner;

public class oppo implements mobile {
Scanner sc=new Scanner(System.in);
	
	@Override
	public void mobilebrand() {
		// TODO Auto-generated method stub
		System.out.println("Brand Name:OPPO");
		
	}

	@Override
	public void mobilecamera() {
		// TODO Auto-generated method stub
		System.out.println("Mobile Camera:12MP");
		
	}

	@Override
	public void mobileram() {
		// TODO Auto-generated method stub
		System.out.println("Mobile RAM:8GB");
		
	}

	@Override
	public void mobileprocessor() {
		// TODO Auto-generated method stub
		System.out.println("Mobile Processor:Exynos");
		
	}

	@Override
	public void mobilerom() {
		// TODO Auto-generated method stub
		System.out.println("Mobile ROM:64GB");
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		oppo o=new oppo();
		o.mobilebrand();
		o.mobilecamera();
		o.mobileram();
		o.mobileprocessor();
		o.mobilerom();

	}


	
}
