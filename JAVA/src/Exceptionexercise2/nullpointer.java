package Exceptionexercise2;

public class nullpointer {
	public static void value(String s)
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nullpointer.value("bad");

	}

}
