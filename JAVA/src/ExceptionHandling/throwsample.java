package ExceptionHandling;

public class throwsample {
	public static void age(int a)
	{
		if(a<18)
		{
			System.out.println("not eligible to vote");
			throw new ArithmeticException("not eligible to vote");
		}
		else
		{
			System.out.println("eligible to vote");
		}
		System.out.println("method called");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		throwsample.age(17);

	}

}
