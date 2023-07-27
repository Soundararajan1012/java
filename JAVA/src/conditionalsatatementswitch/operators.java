package conditionalsatatementswitch;

import java.util.Scanner;

public class operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x,y,z,a;
		System.out.println("Checking:");
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		a=sc.nextInt();
		System.out.println("x value:");
		System.out.println("y value:");
		switch(a)
		{
		case 1:
		    z=x+y;
			System.out.println("Added result:"+z);
			break;
		case 2:
			z=x-y;
			System.out.println("Subtraction result:"+z);
			break;
		case 3:
			z=x*y;
			System.out.println("Multiplication result:"+z);
			break;
		case 4:
			z=x/y;
			System.out.println("Division result:"+z);
			break;
		case 5:
			z=x%y;
			System.out.println("Modulo Division result:"+z);
			break;
		default:
			System.out.println("Invalid Case");
			break;
		}

	}

}
