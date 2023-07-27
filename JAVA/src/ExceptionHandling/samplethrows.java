package ExceptionHandling;
import java.io.IOException;
public class samplethrows {
	private static void info() throws IOException
	{
		System.out.println("hello");
		throw new IOException();
	}

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		samplethrows.info();

	}

}
