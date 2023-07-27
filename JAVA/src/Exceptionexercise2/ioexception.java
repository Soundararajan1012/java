package Exceptionexercise2;

import java.io.FileReader;
import java.io.IOException;

public class ioexception {
	public static void read() throws IOException
	{
		 FileReader fileReader = new FileReader("Desktop:/hai.txt");
		    
	        System.out.println(fileReader.read());
	    
	        fileReader.close();
	        throw new IOException("Caught");
	}
	
	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		 try {
		        
		       read();
		        
		    }
		    catch (IOException e) {
		        e.printStackTrace();
		        System.out.println(" Succesffully Caught");
		       
		    }
		}

	}


