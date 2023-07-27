package scannerwithreturntype;
import java.util.Scanner;
public class marks {
	//*eng
	 //tamil
	 //maths
	 //evs
	 //hindi
	 //Also find average and total of the marks.*//
	public int English(int english)
	{
		return english;
	}
	public int Tamil(int tamil)
	{
		return tamil;
	}
	public int Maths(int maths)
	{
		return maths;
	}
	public int Evs(int evs)
	{
		return evs;
	}
	public int Hindi(int hindi)
	{
		return hindi;
	}
	public double Total(double total)
	{
		return total;
	}
	public double Average(double average)
	{
		return average;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		marks m1=new marks();
		Scanner sc=new Scanner(System.in);
		System.out.println("Mark Sheet");
		System.out.println("Tamil Marks:");
		int tamil=sc.nextInt();
		System.out.println("English Marks:");
		int english=sc.nextInt();
		System.out.println("Maths Marks:");
		int maths=sc.nextInt();
		System.out.println("Evs Marks:");
		int evs=sc.nextInt();
		System.out.println("Hindi Marks:");
		int hindi=sc.nextInt();
		System.out.println("Tamil:"+m1.Tamil(tamil));
		System.out.println("english:"+m1.English(english));
		System.out.println("Maths:"+m1.Maths(maths));
		System.out.println("Evs:"+m1.Evs(evs));
		System.out.println("Hindi:"+m1.Hindi(hindi));
		double total=(tamil+english+maths+evs+hindi);
		System.out.println("Total Marks:"+m1.Total(total));
		double average=total/5;
		System.out.println("Average Marks:"+m1.Average(average));

	}

}
