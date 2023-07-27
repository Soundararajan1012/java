package Exceptionexercise2;

public class arithmeticexception {
	public static void big(int a,int b)
	{
		if(a>b)
		{
			System.out.println("a is big");
			
		}
		else
		{
			throw new ArithmeticException("b is big");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arithmeticexception.big(14, 15);
	

	}

}
