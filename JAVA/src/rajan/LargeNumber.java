package rajan;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;
public class LargeNumber {

		    static void printLargest(Vector<String> arr)
		    {
		        Collections.sort(arr, new Comparator<String>()
		        {
		            @Override public int compare(String X, String Y)
		            {
		                String XY = X + Y;
		                String YX = Y + X;
		                return XY.compareTo(YX) > 0 ? -1 : 1;
		            }
		        });
		        Iterator it = arr.iterator();
		        while (it.hasNext())
		            System.out.print(it.next());
		        System.out.println();
		    }
		    public static void main(String[] args)  
		    { 
		        Scanner sr = new Scanner(System.in);
		        System.out.println("How many number:");
		        Vector<String> v = new Vector<String>();
		        int n = sr.nextInt();
		        for(int i=0;i<n;i++)
		        {
		            String x;
		            x = sr.next();
		            v.add(x);
		        }
		        printLargest(v);
                
	}

}
