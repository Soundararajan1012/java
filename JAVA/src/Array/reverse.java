package Array;
import java.util.Scanner;
public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Orginal Order:");
		String s1=sc.next();
		s1 +=sc.nextLine();

		String s2=" ";
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
		}
		System.out.println("Original order:"+s1);
		
		System.out.println("Reverse Order:"+s2);
		sc.close();
		

	}

}
