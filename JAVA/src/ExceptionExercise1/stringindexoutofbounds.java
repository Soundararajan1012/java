package ExceptionExercise1;

public class stringindexoutofbounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Always be carefully";
		try
		{
			System.out.println(a.charAt(13));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
			System.out.println("Exception caught");
		}
		finally
		{
			System.out.println(a);
		}
		

	}

}
