package Interface;
import java.util.Scanner;
public class studentone  implements maths{
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();

	@Override
	public void add() {
		
		System.out.println("Addition Output:"+(a+b));
	}

	@Override
	public void subtraction() {
		
		System.out.println("Subtraction Output:"+(a-b));
		
	}

	@Override
	public void multiplication() {
		
		System.out.println("Multiplication Output:"+(a*b));
		
	}

	@Override
	public void division() {
		
		System.out.println("Division Output:"+(a/b));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		studentone s=new studentone();
		s.add();
		s.subtraction();
		s.multiplication();
		s.division();
		

	}

}
