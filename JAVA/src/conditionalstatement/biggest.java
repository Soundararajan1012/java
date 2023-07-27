package conditionalstatement;

public class biggest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=200,b=300,c=70,d=90;
		if(a>b && a>c && a>d)
		{
			System.out.println("a is big");
		}
		else if(b>a && b>c && b>d)
		{
			System.out.println("b is big");
		}
		else if(c>a && c>b && c>d)
		{
			System.out.println("c is big");
		}
		else
		{
			System.out.println(" d is big");
		}

	}

}
