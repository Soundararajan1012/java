package ExceptionHandling;

public class numberformatexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="India";
		try
		{
			int i=Integer.parseInt(s);
			System.out.println(i);
		}
		catch(NumberFormatException ex)
		{
			System.out.println(ex.getMessage());
			System.out.println("Exception caught");
		}
		System.out.println(s);

	}

}
