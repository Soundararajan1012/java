package ExceptionHandling;

public class nullpointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=null;
		try
		{
			if(s.equals("India"))
			{
				System.out.println("Equals");
			}
			else
			{
				System.out.println("Not Equal");
			}
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
			
		}
		System.out.println("Hello");

	}

}
