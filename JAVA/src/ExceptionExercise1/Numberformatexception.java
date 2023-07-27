package ExceptionExercise1;

public class Numberformatexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String i="jai Hind";
		try
		{
			double d=Double.parseDouble(i);
			System.out.println(d);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e.getMessage());
			System.out.println("Exception caught");
		}
		finally
		{
			System.out.println(i);
		}
		

	}

}
