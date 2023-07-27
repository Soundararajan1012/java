package rajan;

public class ifcondition {

	public static void main(String[] args) {
		//ifcondition
		int a=10,b=5,c=9,d=11;
		if(a>b)
		{
			System.out.println("A is bigger than B");
		}
		//if..else condition
		if(c>d)
		{
			System.out.println("C is bigger than D");
		}
		else
		{
			System.out.println("D is bigger than C");
		}
		//else..if condition
		if(a>b && a>c && a>d)
		{
			System.out.println("A is big");
		}
		else if(b>a && b>c && b>d)
		{
			System.out.println("B is big");
		}
		else if(c>a && c>b && c>d)
		{
			System.out.println("C is big");
		}
		else
		{
			System.out.println("D is big");
		}

	}

}
