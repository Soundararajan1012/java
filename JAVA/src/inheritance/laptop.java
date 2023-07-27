package inheritance;
import java.util.Scanner;
public class laptop extends computer {
	public String laptopmodel(String name)
	{
		return name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Laptop Name:");
		laptop l=new laptop();
		String name=sc.next();
		name +=sc.nextLine();
		
		System.out.println("computerName:");
		computer c=new computer();
		String name1=sc.next();
		name1 +=sc.nextLine();
		System.out.println("\n Laptop Model:"+l.laptopmodel(name));
		System.out.println("Computer Model:"+c.computermodel(name1));
		

	}

}
