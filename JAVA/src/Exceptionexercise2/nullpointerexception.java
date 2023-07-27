package Exceptionexercise2;

public class nullpointerexception {
	public static void value(String s) throws NullPointerException
	{
		if(s.equals("Good"))
		{
			System.out.println("Equals");
			
		}
		else
		{
			throw new NullPointerException("not equals");
		}
	}

	public static void main(String[] args) throws NullPointerException
	{
		// TODO Auto-generated method stub
		nullpointerexception.value("Good");

	}

}
