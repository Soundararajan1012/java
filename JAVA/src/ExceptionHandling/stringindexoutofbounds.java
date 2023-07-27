package ExceptionHandling;

public class stringindexoutofbounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Allthebest";
		try
		{
			System.out.println(s.charAt(40));
		}
		catch(StringIndexOutOfBoundsException ex)
		{
			System.out.println(ex.getMessage());
			System.out.println("Exception caught");
		}
		System.out.println(s);

	}

}
