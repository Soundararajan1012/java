package Exceptionexercise2;

import java.io.InvalidClassException;

public class invalidclass 
{
	private static final String CLASS_TO_LOAD = "main.java.Utils";

	public static void main(String[] args) throws InvalidClassException, ClassNotFoundException
	{
		// TODO Auto-generated method stub
		try {
            Class loadedClass = Class.forName(CLASS_TO_LOAD);
            System.out.println("Class " + loadedClass + " found!");
            throw new InvalidClassException("error");
        } catch (InvalidClassException ex) {
            System.err.println("InvalidClassException was found: " + ex.getMessage());
            ex.printStackTrace();
        }
	}

}
