package ExceptionExercise1;

public class nullpointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=null;
		try
		{
			if(s.equals("alone"))
			{
				System.out.println("equals");
			}
			else
			{
				System.out.println("not equals");
			}
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("welcome");
		}
		

	}

}
